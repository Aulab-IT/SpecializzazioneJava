public class Person {
    //! attributi
    String name;
    String surname;
    
    //! costruttore
    
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    //! metodi
    public static void info(String name, String surname){
        System.out.println("Ciao il mio nome è "+ name + " ed il mio cognome è " + surname);
    }

}
