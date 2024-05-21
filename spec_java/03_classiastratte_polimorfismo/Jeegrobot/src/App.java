public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("O chiamavano Jig Robbò");
        System.out.println("Miwa!! Lanciami i componenti!!!!");
        //! creazione degli oggetti componenti in UPcasting
        Arm aSx = new Drill("Trivella Sinistra"); 
        Arm aDx = new Fist("Pugno Destro");
        Leg lSx = new Flare();
        Leg lDx = new Shild();
        //! creazione dell'oggetto jeeg robot
        JeegRobot jeegRobot = new JeegRobot(aSx, aDx, lSx, lDx);
        //richiamo dei metodi sull'oogetto jeegrobot
        jeegRobot.attaccoDestro();
        jeegRobot.attaccoSinistro();
        jeegRobot.difesaGinocchioDestro();
        jeegRobot.salto();

        System.out.println("creazione di un nuovo Jeeg");
        JeegRobot jeeg2 = new JeegRobot(new Drill("trivella destra"), new Drill("trivella sinistra"), new Shild(), new Shild());
        jeeg2.attaccoDestro();
        jeeg2.attaccoSinistro();
        jeeg2.difesaGinocchioDestro();
        jeeg2.difesaGambaSinistra();
    }
}

