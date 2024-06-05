public class GenClass {
    public <T> void print (T data){
        System.out.println(data);
    }

    public <T> T returnTypeGeneric(T data){
        return data;
    }
}
