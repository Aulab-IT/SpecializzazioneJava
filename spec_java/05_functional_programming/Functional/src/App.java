import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        List<Person> people = List.of(
            new Person("Andrea", Gender.MALE),
            new Person("Maria", Gender.FEMALE),
            new Person("Paola", Gender.FEMALE),
            new Person("Roberto", Gender.MALE),
            new Person("Marco", Gender.MALE)
        );

        // //? Imperativo
        // List<Person> females = new ArrayList<>();
        // for(Person p : people){
        //     if(Gender.FEMALE.equals(p.gender)) females.add(p);
        // }
        // for(Person f : females){
        //     System.out.println(f.name);
        // }

        //? Dichiarativo
        //? dalla lista genero uno stream ( una sequenza di dati che possono essere manipolati uno alla volta )
        people.stream()
        //? dato che ho creato uno stream indico alla funzione filter in base a cosa deve filtrare il singolo elemento che sta controllando
            .filter(person -> Gender.FEMALE.equals(person.gender))
            //? dopo aver filtrato, ho ancora uno stream, non una lista quindi devo trasformare lo stream in lista per poterla poi ciclare e stampare
            // ? utilizzo il metodo dell'oggetto Collectors.toList() che ritrasforma lo stream in una lista
            .collect(Collectors.toList())
            //?Ciclo tutti gli elementi della lista con un foreach cosi da stamparli
            .forEach(person -> System.out.println(person.name));

        System.out.println("Lista di partenza:");
        //! la lista originale non è stata modificata
        for(Person p : people){
            System.out.println(p.name);
        }


    }
}
