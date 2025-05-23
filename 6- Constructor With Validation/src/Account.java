/*
6. Constructor with Validation
Write a Java program to create a class called Account with instance variables accountNumber and balance.
Implement a parameterized constructor that initializes these variables with validation:

accountNumber should be non-null and non-empty.
balance should be non-negative.
Print an error message if the validation fails.
*/

public class Account {
    private String accountNumber;
    private double balance;



    public Account(String accountNumber, double balance) {

        if(accountNumber == null || accountNumber.trim().isEmpty()){
            throw new IllegalArgumentException("Account number cannot be null or empty");
        }
        if (balance < 0){
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        this.balance = balance;

        System.out.println(accountNumber + " " + balance);
    }
}
