package chapter4.bank_system.solutions;


public class Bank {

    private String name;
    private Account[] accounts;

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


    public Account findAccount(String accountNum)
    {

        for(int i =0; i<accounts.length; i++){
            if(accounts[i].getNum().equals(accountNum)){
                return accounts[i];
            }
        }
        return null;

//另一种实现代码：for-each loop
//        for(Account a: accounts){
//            if(a.getNum().equals(accountNum)){
//                return a;
//            }
//        }
//        return null;


    }

    public void deposit(String accountNum, double m)
    {

        for(int i =0; i<accounts.length; i++){
            if(accounts[i].getNum().equals(accountNum)){
                accounts[i].setBalance(accounts[i].getBalance() + m);
            }
        }

        //另一种实现代码：使用findAccount()方法
        /*
        Account a = findAccount(accountNum);
        a.setBalance(a.getBalance() + m);
        */

    }

    public void withdraw(String accountNum, double m)
    {

        for(int i =0; i<accounts.length; i++){
            if(accounts[i].getNum().equals(accountNum)){
                accounts[i].setBalance(accounts[i].getBalance() - m);
            }
        }

        //另一种实现代码：使用findAccount()方法
        /*
        Account a = findAccount(accountNum);
        a.setBalance(a.getBalance() - m);
        */


    }

    public  double checkBalance(String accountNum)
    {

        for(int i =0; i<accounts.length; i++){
            if(accounts[i].getNum().equals(accountNum)){
                return accounts[i].getBalance();
            }
        }
        return -1;

//另一种实现代码：使用getAccounts()方法获取当前Bank对象的accounts属性的值
//        for(int i =0; i<getAccounts().length; i++){
//            if(getAccounts()[i].getNum().equals(accountNum)){
//                return getAccounts()[i].getBalance();
//            }
//        }
//        return -1;


//另一种实现代码：for-each loop
//        for(Account a: accounts){
//            if(a.getNum().equals(accountNum)){
//                return a.getBalance();
//            }
//        }
//        return -1;


    }


    public boolean transfer(Account a, Account b, double m)
    {
        if(checkBalance(a.getNum())>=m){
            withdraw(a.getNum(), m);
            deposit(b.getNum(), m);
            return true;
        }
        return false;

    }

    /**
     * Add a new account into the current bank.
     * @param a the new account object
     */
    public void addAccount(Account a)
    {

        Account[] newArray = new Account[accounts.length + 1];
        for(int i = 0;i<accounts.length; i++)
        {
            newArray[i] = accounts[i];

        }

        newArray[newArray.length-1] = a;
        accounts = newArray;

    }

}
