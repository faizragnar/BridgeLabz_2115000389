class BankAccount {

    static String bankName = "ABC Bank";
    private static int totalAccounts = 0;

    private final String accountNumber; 
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber; 
        this.accountHolderName = accountHolderName;
        totalAccounts++; 
    }

    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    public void display() {
        System.out.println("ACCOUNT NUMBER - " + accountNumber);
        System.out.println("ACCOUNT HOLDER NAME - " + accountHolderName);
		System.out.println();
    }
}
public class BankDetails{
    public static void main(String[] args) {

        BankAccount ac1 = new BankAccount("123456789343", "Mohit");
        BankAccount ac2 = new BankAccount("912458789555", "Rohit");
        BankAccount ac3 = new BankAccount("856256789132", "Sohit");
		
		System.out.println(BankAccount.bankName);
        BankAccount.getTotalAccounts();

        ac1.display();
        ac2.display();
        ac3.display();
    }
}
