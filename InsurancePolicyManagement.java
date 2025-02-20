import java.util.*;
import java.time.LocalDate;
class Policy {
    String policyNumber, policyholder, coverageType;
    LocalDate expiryDate;
    double premiumAmount;
    public Policy(String policyNumber, String policyholder, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholder = policyholder;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }
    public String toString() { return policyNumber + " - " + policyholder + " - " + expiryDate; }
}
public class InsurancePolicyManagement {
    Map<String, Policy> policyMap = new HashMap<>();
    Map<String, Policy> orderedPolicyMap = new LinkedHashMap<>();
    TreeMap<LocalDate, Policy> sortedPolicies = new TreeMap<>();
    public void addPolicy(Policy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicyMap.put(policy.policyNumber, policy);
        sortedPolicies.put(policy.expiryDate, policy);
    }
    public Policy getPolicy(String policyNumber) { return policyMap.get(policyNumber); }
    public List<Policy> getExpiringPolicies() {
        LocalDate now = LocalDate.now(), limit = now.plusDays(30);
        List<Policy> result = new ArrayList<>();
        sortedPolicies.subMap(now, limit).values().forEach(result::add);
        return result;
    }
    public List<Policy> getPoliciesByHolder(String holder) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : policyMap.values()) if (p.policyholder.equals(holder)) result.add(p);
        return result;
    }
    public void removeExpiredPolicies() {
        sortedPolicies.headMap(LocalDate.now(), true).clear();
        policyMap.values().removeIf(p -> p.expiryDate.isBefore(LocalDate.now()));
    }
}