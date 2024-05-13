public class Employee extends Person{
    //attributi
    int salary;

    //costruttore
    public Employee(String name, String surname, int age, int salary) {
        super(name, surname, age);
        this.salary = salary;
    }


    @Override
    public void displayInfo() {
        System.out.println("Employee Details: \n Name: " + name + "\n Surname:" + surname );
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        // System.out.println("Age: " + age);
        // System.out.println("Salary: " + salary);
    }

}
