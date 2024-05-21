import abstract_class.LowerBody;
import abstract_class.UpperBody;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Creazione del jeeg");
        LowerBody lowerBody1 = new Engine("left engine");
        LowerBody lowerBody2 = new Engine("right engine");
        UpperBody upperBody1 = new Wing("left Wing");
        UpperBody upperBody2 = new Wing("right Wing");
        
        JeegRobot jeeg1 = new JeegRobot(upperBody1, upperBody2, lowerBody1, lowerBody2);
        jeeg1.useLowerBodyLeft();
        //casting
        /* 
        * viene eseguito un'operazione di casting esplicito. 
        * Il casting è un'operazione che consente di convertire un oggetto da un tipo a un altro, purché ci sia una relazione di ereditarietà tra i due tipi coinvolti.
        * Nel tuo caso, stai facendo un casting dell'oggetto jeeg1.ubDx da UpperBody a Wing. 
        * Questo è possibile poiché Wing è una sottoclasse di UpperBody, quindi è possibile trattare un oggetto di tipo Wing come un oggetto di tipo UpperBody, ma non viceversa senza un casting.
        * Quindi, quando esegui ((Wing) jeeg1.ubDx).forward();, 
        * stai essenzialmente dicendo al compilatore di trattare jeeg1.ubDx come un oggetto di tipo Wing, 
        * consentendoti di chiamare il metodo forward() che appartiene alla classe Wing.
        * È importante notare che il casting dovrebbe essere usato con cautela poiché può generare eccezioni se il tipo di oggetto non è compatibile con il tipo a cui si sta cercando di convertirlo. Assicurati sempre che il casting sia sicuro e corretto per evitare errori durante l'esecuzione del programma.
        */
        ((Wing) jeeg1.ubDx).forward();

    }
}
