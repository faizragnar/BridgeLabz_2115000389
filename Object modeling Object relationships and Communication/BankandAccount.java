import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.getName() + " at " + name);
    }
}

class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void viewBalance() {
        System.out.println(name + "'s balance: $" + balance);
    }
}

public class  BankandAccount {
    public static void main(String[] args) {
        Bank bank = new Bank("Global Bank");
        Customer c1 = new Customer("Alice", 5000);
        bank.openAccount(c1);
        c1.viewBalance();
    }
}
