import abstract_class.UpperBody;
import interface_files.Move;

public class Wing extends UpperBody implements Move{

    public Wing(String upper_body_side) {
        super(upper_body_side);
    }

    @Override
    public void forward() {
        System.out.println("In PICCHIATA!!!");
    }

    @Override
    public void back() {
       System.out.println("Cabrata!!!!!");
    }

    @Override
    public void left() {
        System.out.println("virata a sinistra");
    }

    @Override
    public void right() {
        System.out.println("virata a destra");
    }

    @Override
    public void jump() {
        System.out.println("decolla!!!");
    }

    @Override
    public void run() {
        System.out.println("flap retratti, profilo alare a V!");
    }

    @Override
    public void upper_attack() {
        System.out.println("nemico aggaciato pronto a lanciare missile!");
    }

    @Override
    public void defence() {
        System.err.println("effettuo un tonneau");
    }

}
