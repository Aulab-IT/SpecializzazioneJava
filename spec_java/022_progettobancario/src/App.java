public class App {
    public static void main(String[] args) throws Exception {
        BackAccount acc = new BackAccount("Robbie", "AB1234CON", 1000);
        acc.prelievo(50);
        System.out.println("Il saldo disponibile dopo il prelievo è: " + acc.balance);
        acc.versamento(400);
        System.out.println("Il saldo disponibile dopo il versamento è: " + acc.balance);
        acc.balance = 0;
        System.out.println(acc.balance);
    }
}
