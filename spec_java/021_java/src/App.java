public class App {
    public static void main(String[] args) throws Exception {
        // creazione di un oggetto di tipo Peron
        Person p = new Person();
        // assegnazione dei valori degli attributi name e surname dell'oggetto p
        p.name = "Robbie";
        p.surname = "Russian";
        // chiamata al metodo info() passando l'oggetto p come argomento della funzione
        info(p);
    }
    //definizione del metodo info() che riceveun oggetto di tipo Person come parametro
    public static void info(Person p){
        System.out.println("Ciao il mio nome è "+ p.name + " ed il mio cognome è " + p.surname);
    }
}
