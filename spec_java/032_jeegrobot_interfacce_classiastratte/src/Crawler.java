import abstract_class.Leg;
import interface_files.Move;
public class Crawler extends Leg implements Move{
    protected String name;
    
    public Crawler(String name) {
        this.name = name;
    }

    @Override
    public void low_attack() {
       System.out.println("ci passo sopra");
    }

    @Override
    public void forward() {
       System.out.println("in avanti come un carro armato");
    }

    @Override
    public void back() {
        System.out.println("torno indietro");
    }

    @Override
    public void left() {
        System.out.println("giro a sinistra");
    }

    @Override
    public void right() {
        System.out.println("giro a destra");
    }

    @Override
    public void jump() {
        System.out.println("hai montato dei cingoli non posso saltare");
    }

    @Override
    public void run() {
        System.out.println("ok non posso correre ma posso andarte veloce ;D!");
    }

}
