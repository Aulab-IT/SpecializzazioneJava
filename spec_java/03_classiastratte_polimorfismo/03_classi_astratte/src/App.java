public class App {
    public static void main(String[] args) throws Exception {
       // creazione dell'oggetto Impiegato robbie 
       Employee robbie = new Employee("Robbie", "Russian", 35, "Product Leader");
       // creazione dell'oggetto studente valerio
       Student valerio = new Student("Valery", "Cow", 34, "hack 33"); 
       // richiamo del metodo displayinfo() sui due oggetti
       robbie.displayInfo();
       valerio.displayInfo();

    }
}
