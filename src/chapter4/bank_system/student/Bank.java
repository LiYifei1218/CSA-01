package chapter4.bank_system.student;

import java.util.ArrayList;

public class Bank {

    private String name;
    private Account[] accounts;
    private ArrayList<Account> c;

    public Bank(String name, Account[] accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }


    /**
     * Return an Account object in current bank with the given account number.
     * Return null if the account with the given account number does not exist.
     *
     * @param accountNum the account number
     */
    public Account findAccount(String accountNum)
    {
        /* write your code here */
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getNum() == accountNum)
                return accounts[i];
        }
        return null;
    }


    /**
     * Deposit a certain mount of money into an account with the given account number.
     * @Precondition the account with the given account number exists in the current bank.
     * @param accountNum the account number
     * @param m the amount money
     */
    public void deposit(String accountNum, double m)
    {
        /* write your code here */
        findAccount(accountNum).setBalance(findAccount(accountNum).getBalance() + m);
    }

    /**
     * Withdraw a certain mount of money from an account with the given account number.
     * @Precondition the account with the given account number exists in the current bank.
     * @param accountNum the account number
     * @param m the amount money
     */
    public void withdraw(String accountNum, double m)
    {
        /* write your code here */
        findAccount(accountNum).setBalance(findAccount(accountNum).getBalance() - m);
    }


    /**
     * Return the current balance of an account with the given account number.
     * Return -1 if the account does not exist.
     * @param accountNum the account number.
     */
    public double checkBalance(String accountNum)
    {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getNum() == accountNum)
                return accounts[i].getBalance();
        }
        return -1;
    }


    /**
     *
     * Transfer a certain amount of money m from the given account a to another
     * given account b and return true.
     * Return false if the balance of the account a is less than m.
     *
     * @Precondition: the two given account exist in the current bank.
     *
     * @param a the account that the money transferred from
     * @param b the account that the money transferred to
     * @param m the amount of money to transfer.
     */
    public boolean transfer(Account a, Account b, double m)
    {
        /* write your code here */
        if (a.getBalance() < m)
            return false;
        b.setBalance(b.getBalance() + m);
        a.setBalance(a.getBalance() - m);
        return true;
    }


    /**
     * Add a new account into the current bank.
     * @param a the new account object
     */
    public void addAccount(Account a)
    {
        /* write your code here */
        int l = accounts.length + 1;
        Account[] t = new Account[l];
        for (int i = 0; i < l - 1; i++) {
            t[i] = accounts[i];
        }
        t[l - 1] = a;
        accounts = t;
    }
}
