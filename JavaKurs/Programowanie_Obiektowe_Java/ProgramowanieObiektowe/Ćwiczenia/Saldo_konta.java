package Ćwiczenia;

public class Saldo_konta {
    public static void main(String[] args){
        Account k1 = new Account();
        System.out.println(k1.getBalance());
        k1.deposit(1000);
        System.out.println(k1.getBalance());
        k1.withdraw(300);
        System.out.println(k1.getBalance());
    }
}
class Account{
    private double balance;
    Account(){
        this.balance = 0;
    }
    void deposit(double depozyt){
        this.balance += depozyt;
    }
    void withdraw(double kwota){
        if (kwota > this.balance) {
            System.out.println("Za mało środków!");
        }
        this.balance -= kwota;
    }
    double getBalance(){
        return this.balance;
    }

}