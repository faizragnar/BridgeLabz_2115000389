import java.util.*;

class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getCoverageType() { return coverageType; }
    public Date getExpiryDate() { return expiryDate; }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Policy policy = (Policy) obj;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}

public class InsuranceManagement {
    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<Policy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("All Unique Policies (HashSet): " + hashSetPolicies);
        System.out.println("All Policies in Insertion Order (LinkedHashSet): " + linkedHashSetPolicies);
        System.out.println("All Policies Sorted by Expiry Date (TreeSet): " + treeSetPolicies);
    }

    public void displayExpiringSoon() {
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = cal.getTime();
        
        for (Policy policy : treeSetPolicies) {
            if (policy.getExpiryDate().before(thresholdDate)) {
                System.out.println("Expiring Soon: " + policy);
            }
        }
    }
    
    public void displayByCoverageType(String coverageType) {
        for (Policy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println("Matching Coverage: " + policy);
            }
        }
    }
    
    public void comparePerformance() {
        long start, end;
        Policy samplePolicy = new Policy("P999", "Test User", new Date(), "Auto", 500.0);
        
        start = System.nanoTime();
        hashSetPolicies.contains(samplePolicy);
        end = System.nanoTime();
        System.out.println("HashSet lookup time: " + (end - start) + " ns");
        
        start = System.nanoTime();
        linkedHashSetPolicies.contains(samplePolicy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet lookup time: " + (end - start) + " ns");
        
        start = System.nanoTime();
        treeSetPolicies.contains(samplePolicy);
        end = System.nanoTime();
        System.out.println("TreeSet lookup time: " + (end - start) + " ns");
    }
    
    public static void main(String[] args) {
        InsurancePolicyManagement manager = new InsurancePolicyManagement();
        Calendar cal = Calendar.getInstance();
        
        cal.set(2025, Calendar.MARCH, 10);
        manager.addPolicy(new Policy("P101", "A", cal.getTime(), "Health", 1200));
        
        cal.set(2025, Calendar.APRIL, 15);
        manager.addPolicy(new Policy("P102", "B", cal.getTime(), "Auto", 800));
        
        cal.set(2025, Calendar.MARCH, 5);
        manager.addPolicy(new Policy("P103", "C", cal.getTime(), "Home", 1500));
        
        manager.displayAllPolicies();
        manager.displayExpiringSoon();
        manager.displayByCoverageType("Health");
        manager.comparePerformance();
    }
}
