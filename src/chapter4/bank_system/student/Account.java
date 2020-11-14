package chapter4.bank_system.student;

public class Account {

    private String name;
    private String num;
    private double balance;

    public Account(String name, String num, double balance) {
        this.name = name;
        this.num = num;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
