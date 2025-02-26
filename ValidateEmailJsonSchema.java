import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.ValidationMessage;

import java.util.Set;

public class ValidateEmailJsonSchema {
    public static void main(String[] args) throws Exception {
        String json = "{\"email\": \"user@example.com\"}";
        String schemaString = "{\"type\": \"object\", \"properties\": {\"email\": {\"type\": \"string\", \"format\": \"email\"}}, \"required\": [\"email\"]}";

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(json);
        JsonSchemaFactory schemaFactory = JsonSchemaFactory.getInstance();
        JsonSchema schema = schemaFactory.getSchema(schemaString);

        Set<ValidationMessage> errors = schema.validate(jsonNode);
        if (errors.isEmpty()) {
            System.out.println("Valid email format!");
        } else {
            errors.forEach(error -> System.out.println(error.getMessage()));
        }
    }
}
