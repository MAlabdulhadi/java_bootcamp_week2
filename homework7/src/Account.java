public class Account {

    private String id;
    private String name ;
    private int balance =0;




    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount){//سحب

        this.balance = getBalance()-amount;

        return this.balance;


    }
    public int debit(int amount){// ايداع

        this.balance = getBalance()+amount;

        return this.balance;

    }
    public int transferTo(Account another,int amount){

        int current_balance = another.getBalance();
        int balanceAfterTranfer = current_balance + amount;
        this.balance = this.balance - amount;
        another.setBalance(balanceAfterTranfer);
        return balanceAfterTranfer;

    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

}
