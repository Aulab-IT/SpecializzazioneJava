import abstract_class.LowerBody;
import abstract_class.UpperBody;


public class JeegRobot {
    public UpperBody ubDx;
    public UpperBody ubSX;
    public LowerBody lbDx;
    public LowerBody lbSx;

    public JeegRobot(UpperBody ubDx, UpperBody ubSX, LowerBody lbDx, LowerBody lbSx) {
        this.ubDx = ubDx;
        this.ubSX = ubSX;
        this.lbDx = lbDx;
        this.lbSx = lbSx;
    }

    public void attackLeft(){
        this.ubSX.upper_attack();
    }

    public void attackRight(){
        this.ubDx.upper_attack();
    }

    public void useLowerBodyRight(){
        this.lbDx.low_attack();
    }

    public void useLowerBodyLeft(){
        this.lbSx.low_attack();
    }
    //funzione col casting sulle ali
}
