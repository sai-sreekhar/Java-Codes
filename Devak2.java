class Account {
    String accountNumber;
    int balance;

    Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
        return;
    }

    public void deposit(int amount) {
        balance += amount;
        return;
    }

    public void disp() {
        System.out.println("Account Number: " + accountNumber + "\nBalance: " + balance);
        return;
    }

}

class Person extends Account {
    String name;
    String aadhar_no;

    Person(String name, String aadhar_no, String accountNumber, int balance) {
        super(accountNumber, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }

    public void disp() {
        System.out.println("Name: " + name + "\nAadhar No: " + aadhar_no + "\nAccount Number: " + accountNumber
                + "\nBalance: " + balance);
        return;
    }

}

public class Devak2 {
    public static void main(String[] args) {
        Person person1 = new Person("devak Reddy", "568887543456", "4848898654", 1000000);
        person1.disp();
        Person person2 = new Person("Sai", "777771234567", "8923457901", 100);
        person2.disp();
        Person person3 = new Person("Srikar", "567925673452", "4795728494794", 9000000);
        person3.disp();
        Person person4 = new Person("Prabhas", "749293674510", "448495898299", 9000);
        person4.disp();
        Person person5 = new Person("NTR", "782345601672", "44849492010", 7500000);
        person5.disp();
    }
}
