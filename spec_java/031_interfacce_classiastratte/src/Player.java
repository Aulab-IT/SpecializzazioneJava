public class Player implements MoveSet{
    // attributi
    public int hp;
    public String name;
    public String role;
    public int manapoint;
    public int stamina;
    // costruttore
    public Player(int hp, String name, String role, int manapoint, int stamina) {
        this.hp = hp;
        this.name = name;
        this.role = role;
        this.manapoint = manapoint;
        this.stamina = stamina;
    }
    //metodi in override dall'interfaccia
    @Override
    public void moveForward() {
        System.out.println(name + " si muove in avanti");
    }

    @Override
    public void moveBack() {
        System.out.println(name + " si muove indietro");
    }

    @Override
    public void jump() {
        System.out.println(name + " salta!");
    }

    //metodo della classe
    public void greatings(){
        System.out.println("ciao sono un giocatore");
    }

}
