public class Employee extends Person{
    //attributi
    String role;

    //costruttore
    public Employee(String name, String surname, int age, String role) {
        super(name, surname, age);
        this.role = role;
    }


    @Override
    public void displayInfo() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Mansione: " + role);
    }

}
