public class Person {
    //! attributi
    String name;
    String surname;
    Integer age;
    
    //! costruttore senza parametro
    public Person() {
    }

    //! costruttore
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    
    public Person(String surname, Integer age) {
        this.surname = surname;
        this.age = age;
    }

    //! metodi
    public void info(){
        System.out.println("Ciao il mio nome è "+ this.name + " ed il mio cognome è " + this.surname);
    }



}
