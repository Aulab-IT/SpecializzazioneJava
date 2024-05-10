class App{
    public static void main(String[] args) {
        Pointer3D p1 = new Pointer3D(100,200,300);
        Pointer3D p2 = p1;
        System.out.println(p1.equals( p2 ));
    }
}
