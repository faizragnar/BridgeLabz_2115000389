import java.util.*;
public class VotingSystem {
    Map<String, Integer> votes = new HashMap<>();
    Map<String, Integer> orderedVotes = new LinkedHashMap<>();
    public void vote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        orderedVotes.put(candidate, orderedVotes.getOrDefault(candidate, 0) + 1);
    }
    public Map<String, Integer> getSortedResults() { return new TreeMap<>(votes); }
}