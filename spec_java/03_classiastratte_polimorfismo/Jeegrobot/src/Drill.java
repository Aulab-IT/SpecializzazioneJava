public class Drill extends Arm {
    public Drill(String side){super(side);}
    @Override
    public void attack(){
        System.out.println("Attacco con la trivella del braccio "
			 + this.side);
    }
}
