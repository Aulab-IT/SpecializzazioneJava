public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Generics");
        //con stringa 
        GenericClass<String> genericoString = new GenericClass<String>("Ora questo è generco");
        System.out.println(genericoString.getData());
        // con intero
        GenericClass<Integer> genericoInteger = new GenericClass<Integer>(53);
        System.out.println(genericoInteger.getData());

        GenClass gen = new GenClass();
        gen.<String>print("Ciao");
        gen.<Integer>print(100);

        // metodo col ritorno con Stringa
        System.out.println(
            gen.<String>returnTypeGeneric("Sono la funzione col return")
        );
        // metodo col ritorno con intero
        System.out.println(
            gen.returnTypeGeneric(200)
        );


        // creazione oggetti della classe Pair coppia di stringhe
        Pair<String> p1 = new Pair<String>("String1", "Stringa 2");
        System.out.println(p1.getS1() + " : " + p1.getS2());

        GenericPair<String> genp1 = new GenericPair<String>("Ciao", "Java");
        System.out.println(genp1.getParam1() + " " + genp1.getParam2());
        GenericPair<Integer> genp2 = new GenericPair<Integer>(5, 6);
        System.out.println(genp2.getParam1() + " " + genp2.getParam2());
    }
}
