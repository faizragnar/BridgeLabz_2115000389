import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class IPLCensorAnalyzer {

    public static void main(String[] args) throws IOException {
        processJsonData("ipl_data.json", "ipl_data_censored.json");
        processCsvData("ipl_data.csv", "ipl_data_censored.csv");
    }

    public static void processJsonData(String inputFile, String outputFile) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootArray = objectMapper.readTree(new File(inputFile));

        for (JsonNode matchNode : rootArray) {
            ((ObjectNode) matchNode).put("team1", maskTeamName(matchNode.get("team1").asText()));
            ((ObjectNode) matchNode).put("team2", maskTeamName(matchNode.get("team2").asText()));
            ((ObjectNode) matchNode).put("winner", maskTeamName(matchNode.get("winner").asText()));
            ((ObjectNode) matchNode).put("player_of_match", "REDACTED");

            JsonNode scoreNode = matchNode.get("score");
            ObjectNode maskedScoreNode = objectMapper.createObjectNode();
            Iterator<String> teamNames = scoreNode.fieldNames();
            while (teamNames.hasNext()) {
                String originalTeam = teamNames.next();
                maskedScoreNode.put(maskTeamName(originalTeam), scoreNode.get(originalTeam).asInt());
            }
            ((ObjectNode) matchNode).set("score", maskedScoreNode);
        }

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), rootArray);
        System.out.println("Censored JSON data written to " + outputFile);
    }

    public static void processCsvData(String inputFile, String outputFile) throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();
        
        List<Object> readData = csvMapper.readerFor(List.class).with(schema).readValues(new File(inputFile)).readAll();

        for (Object row : readData) {
            List<String> rowData = (List<String>) row;
            rowData.set(1, maskTeamName(rowData.get(1)));
            rowData.set(2, maskTeamName(rowData.get(2)));
            rowData.set(5, maskTeamName(rowData.get(5)));
            rowData.set(6, "REDACTED");
        }

        CsvSchema outputSchema = CsvSchema.builder().addColumns(readData.get(0), CsvSchema.ColumnType.STRING).build();
        csvMapper.writer(outputSchema.withHeader()).writeValue(new File(outputFile), readData);
        System.out.println("Censored CSV data written to " + outputFile);
    }

    private static String maskTeamName(String teamName) {
        return teamName.contains(" ") ? teamName.substring(0, teamName.indexOf(" ")) + " ***" : teamName;
    }
}
