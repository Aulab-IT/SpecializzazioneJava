public class App {
    public static void main(String[] args) throws Exception {
       // creazione dell'oggetto Impiegato robbie 
       Employee robbie = new Employee("Robbie", "Russian", 35, "Product Leader");
       // creazione dell'oggetto studente valerio
       Student valerio = new Student("Valery", "Cow", 34, "hack 33"); 
       // richiamo del metodo displayinfo() sui due oggetti
       robbie.displayInfo();
       valerio.displayInfo();

       // creazione dell' oggetto Teacher
       Teacher teo = new Teacher("Matteo", "Sixo", 36, "Teacher Masterclass", "React Masterclass", 200000);
        // richiamo dei metodi
        teo.displayInfo();
        teo.teach();
        teo.getSalary();
        // creazione dell' oggetto Freelancer
        Freelancer nico = new Freelancer("Nico", "Gasp", 38, "Docente Freelance", "B2B React", 5000);
        //richiamo dei metodi
        nico.displayInfo();
        nico.workOnProject();
        nico.comminssionOnWork();
    }
}
