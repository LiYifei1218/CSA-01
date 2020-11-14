package chapter4.bank_system.solutions;

public class Main {

    public static void main(String[] args) {

        //第一步：使用定义好的Account类创建2个Account对象
        Account ac1 = new Account("Jack", "100000008923", 100 );
        Account ac2 = new Account("Bill", "170000008670", 800 );

        //第二步：将2个账户对象放入一个数组中存放
        Account []  accounts = new Account[2];
        accounts[0] = ac1;
        accounts[1] = ac2;

        //第三步：使用定义好的Bank类创建一个Bank对象，并假设银行一开始就有2个银行账户
        Bank myBank = new Bank("ToTo",  accounts);

        //查询一个账户余额
        System.out.println("The current balance of ac1: " + myBank.checkBalance(ac1.getNum()) );

        //存入200
        myBank.deposit(ac1.getNum(), 200);

        //再次查询余额
        System.out.println("The current balance of ac1: " + myBank.checkBalance(ac1.getNum()) );

        //取钱55.5
        myBank.withdraw(ac1.getNum(),55.5);

        //再次查询余额
        System.out.println("The current balance of ac1: " + myBank.checkBalance(ac1.getNum()) );

        //转账
        myBank.transfer(ac1, ac2, 100.5);
        System.out.println("-----After transfer-----");
        System.out.println("The current balance of ac1: " + myBank.checkBalance(ac1.getNum()) );
        System.out.println("The current balance of ac2: " + myBank.checkBalance(ac2.getNum()) );

        //新开2个账户
        Account ac3 = new Account("Max", "170000005231", 200);
        myBank.addAccount(ac3);
        myBank.addAccount(new Account("Lina", "970000001111", 150));


        //查询新账户余额
        System.out.println("The current balance of ac3: " + myBank.checkBalance(ac3.getNum()) );




    }
}
