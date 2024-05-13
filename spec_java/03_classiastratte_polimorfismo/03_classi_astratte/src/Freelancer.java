public class Freelancer extends Employee{
    // attributi
    private String project;
    private int commission;
    // costruttore
    public Freelancer(String name, String surname, int age, String role, String project, int commission) {
        super(name, surname, age, role);
        this.project = project;
        this.commission = commission;
    }
    
    //metodi
    public void workOnProject(){
        System.out.println("Il freelance "+ name + surname + "sta lavorando al progetto" + project);
    }
    public void comminssionOnWork(){
        System.out.println("la sua provvigione per il progetto " + project + "è pari a " + commission + "€");
    }
    
}
