public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Interfacce");
        Player p1 = new Player(100, "Robbie", "Necromante", 87, 70);
        p1.greatings();
        p1.moveForward();
        p1.jump();

        Enemy e1 = new Enemy(50, "Chervantes", "Cavaliere", 20 , 88);
        e1.greatings();
        e1.jump();
    }
}
