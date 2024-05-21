import abstract_class.LowerBody;
import interface_files.Move;

public class Leg extends LowerBody implements Move{
    public String material;

    public Leg(String material, String lower_body_side) {
        super(lower_body_side);
        this.material = material;
    }

    @Override
    public void low_attack() {
        System.out.println("guarda mamma come Eddy Gordon! Sgambetto");
    }

    @Override
    public void forward() {
        System.out.println("gamba in avanti! ");
    }

    @Override
    public void back() {
        System.out.println("passo indietro");
    }

    @Override
    public void left() {
        System.out.println("Passo laterale a sinistra");
    }

    @Override
    public void right() {
        System.out.println("passo laterale a destra");
    }

    @Override
    public void jump() {
        System.out.println("salto con la gamba " + lower_body_side);
    }

    @Override
    public void run() {
        System.out.println("inizio corsa con la gamba "+ lower_body_side);
    }

}
