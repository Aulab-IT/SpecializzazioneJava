abstract public class Person {
    String name;
    String surname;
    int age;
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    // Metodo astratto per visualizzare i dettagli
    public abstract void displayInfo();
}
