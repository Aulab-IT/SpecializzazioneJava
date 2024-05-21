public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Mage gandalf = new Mage("Gandalf");
        Preist endevor = new Preist("Endevor");
        gandalf.castFireball();
        endevor.defend();
    }
}

