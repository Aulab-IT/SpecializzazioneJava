public class Student extends Person {
    private String course;

    public Student(String name, String surname, int age, String course) {
        super(name, surname, age);
        this.course = course;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dettagli Studente:");
        System.out.println("Nome: " + name);
        System.out.println("Cognome: " + surname);
        System.out.println("Età: " + age);
        System.out.println("Corso: " + course);
    }

}
