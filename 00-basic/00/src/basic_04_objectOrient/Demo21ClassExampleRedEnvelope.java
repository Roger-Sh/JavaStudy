package basic_04_objectOrient;

import java.util.ArrayList;
import java.util.Random;

/*
发红包案例
群主发普通红包给多名成员，
1. 群主的一笔金额从群主的余额中扣除，平均分成n份，让成员领取
2. 成员领取红包后，保存到成员余额中

用户类
    //用户名
    String userName
    //余额
    int leftMoney

群主类 extends 用户类
    // 发红包
    ArrayList<Integer> sendMoney( int totalMoney，int n){
    }

普通成员类 extends 用户类
    // 收红包
    void receiveMoney(ArrayList<Integer> moneyList){
    }

 */
public class Demo21ClassExampleRedEnvelope {
    public static void main(String[] args) {
        // init manager
        Manager manager = new Manager("Roger", 200);
        Member member1 = new Member("Francesca", 0);
        Member member2 = new Member("Anne", 500);

        manager.show();
        member1.show();
        member2.show();
        System.out.println("==============");

        ArrayList<Integer> redEnvelopeList;
        redEnvelopeList = manager.sendMoney(300, 7);  // not enough money
        System.out.println("==============");
        redEnvelopeList = manager.sendMoney(100, 3);
        manager.show();

        member1.receiveMoney(redEnvelopeList);  // get a random redEnvelope from redEnvelopeList
        member1.show();
        member2.receiveMoney(redEnvelopeList);  // get a random redEnvelope from redEnvelopeList
        member2.show();
    }
}

// user
class User {
    // member variable
    private String userName;
    private int leftMoney;

    // constructor
    public User() {
    }

    public User(String userName, int leftMoney) {
        this.userName = userName;
        this.leftMoney = leftMoney;
    }

    // getter and setter

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(int leftMoney) {
        this.leftMoney = leftMoney;
    }

    // method
    public void show() {
        System.out.println("Name: " + this.userName);
        System.out.println("Left money: " + this.leftMoney);
    }
}

// manager
class Manager extends User {
    // constructor
    public Manager() {
    }

    public Manager(String userName, int leftMoney) {
        super(userName, leftMoney);
    }

    // sendMoney
    public ArrayList<Integer> sendMoney(int totalMoney, int n) {
        // init moneyList
        ArrayList<Integer> moneyList = new ArrayList<>();

        // check left money
        int leftMoney = super.getLeftMoney();
        if (totalMoney > leftMoney) {
            System.out.println("There is not enough money");
            return moneyList;
        }

        // reset left money
        super.setLeftMoney(leftMoney - totalMoney);

        // put money in moneyList
        int avg = totalMoney / n;
        int mod = totalMoney % n;
        for (int i = 0; i < n - 1; i++) {
            moneyList.add(avg);
        }
        moneyList.add(avg + mod); // put mod in last red envelope

        return moneyList;
    }
}

// member
class Member extends User {
    // constructor
    public Member() {
    }

    public Member(String userName, int leftMoney) {
        super(userName, leftMoney);
    }

    // receiveMoney
    public void receiveMoney(ArrayList<Integer> moneyList) {
        // receive random red envelope form moneyList
        // get a random index
        int index = new Random().nextInt(moneyList.size());

        // delete the element with the random index from moneyList
        int redEnvelope = moneyList.remove(index);

        // recent money
        int recentMoney = super.getLeftMoney();

        // reset money
        super.setLeftMoney(recentMoney + redEnvelope);
    }
}