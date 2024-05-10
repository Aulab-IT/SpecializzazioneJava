public class App {
    public static void main(String[] args) throws Exception {
        // creazione di un oggetto di tipo Peron
        Person p = new Person();
        // assegnazione dei valori degli attributi name e surname dell'oggetto p
        p.name = "Robbie";
        p.surname = "Russian";

        // creazione di un oggetto di tipo Per
        Person laraC = new Person();
        //assegnazione dei valori degli attributi name e surname dell'oggetto laraC
        laraC.name = "Lara";
        laraC.surname = "Croft";

        /*  
        *   creazione di un oggetto attreverso il costruttore
        *   con due parametri di tipo stringa
        *   name e surname
        */
        Person robbieR = new Person("Robbie", "Russo");
        robbieR.info();
        laraC.info();
        Person aleL = new Person("Leo", 35);
        aleL.info();
        // chiamata al metodo info() passando l'oggetto p come argomento della funzione
        // info(p);
        // chiamata al metodo info() passando l'oggetto laraC come argomento della funzione
        // info(laraC);
    }
    //definizione del metodo info() che riceveun oggetto di tipo Person come parametro
    // public static void info(Person person){
    //     System.out.println("Ciao il mio nome è "+ person.name + " ed il mio cognome è " + person.surname);
    // }
}
