import java.util.*;
public class BankingSystem {
    Map<String, Double> accounts = new HashMap<>();
    TreeMap<Double, String> sortedByBalance = new TreeMap<>();
    Queue<String> withdrawalQueue = new LinkedList<>();
    public void createAccount(String accNumber, double balance) {
        accounts.put(accNumber, balance);
        sortedByBalance.put(balance, accNumber);
    }
    public void requestWithdrawal(String accNumber) { withdrawalQueue.add(accNumber); }
}