public class JeegRobot {
    private Arm armSx;
    private Arm armDx;
    private Leg legSx;
    private Leg legDX;
    public JeegRobot(Arm armSx, Arm armDx, Leg legSx, Leg legDX) {
        this.armSx = armSx;
        this.armDx = armDx;
        this.legSx = legSx;
        this.legDX = legDX;
    }
    
    public void attaccoDestro(){
         this.armDx.attack();
    }

    public void attaccoSinistro(){
        this.armSx.attack();
    }

    public void difesaGinocchioDestro(){
        this.legDX.defence();
    }

    public void salto(){
        this.legSx.jumpForward();
    }
}