public class Fist extends Arm{
    //costruttore
    public Fist(String side){super(side);}
    @Override
    public void attack(){
        System.out.println("Il pugno Perforante");
    }
}
