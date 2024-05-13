public class BackAccount {
    public String name;
    public String code;
    private int balance; // saldo

    //costruttore    
    public BackAccount(String name, String code, int balance) {
        this.name = name;
        this.code = code;
        this.balance = balance;
    }
    //!Creiamo anche due metodi versamento e prelievo
    public void versamento( int cifra ){ this.balance += cifra; }
    public void prelievo( int cifra ){ this.balance -= cifra; }
    public void printBalance(){System.out.println("il saldo del conto è: " + this.balance);}
}
