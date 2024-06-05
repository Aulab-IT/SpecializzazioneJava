public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Generics");
        GenericClass generico = new GenericClass("Non è poi così generico");
        System.out.println(generico.getData());
    }
}
