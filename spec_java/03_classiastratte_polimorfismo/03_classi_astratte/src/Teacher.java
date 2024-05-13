public class Teacher extends Employee {
    //* attributi privati
    private String subject;
    private int salary;

    //* costruttore
    public Teacher(String name, String surname, int age, String role, String subject, int salary) {
        super(name, surname, age, role);
        this.subject = subject;
        this.salary = salary;
    }
    
    //* metodi 
    // ha la fuznione di getter
    public void teach(){
        System.out.println("Il docente " + name + "insegna la materia:" + subject);
    }

    public void getSalary(){
        System.out.println("il suo compenso lordo annuo è:" + salary);
    }

}
