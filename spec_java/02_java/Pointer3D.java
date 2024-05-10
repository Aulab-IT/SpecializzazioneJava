public class Pointer3D {
    public int x;
    public int y;
    public int z;

    public Pointer3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //! Ti dico io come ti devi comportare e non come ti vien detto dal padre Object
    @Override //! si chiama annotation -> è una informazione utile al compilatore
              //* Non cambia nulla a noi programmatori, 
              //* stiamo dicendo semplicemente al compilatore che il metodo equals esiste già nella classe pointer3d perchè lo eredita da object in maniera nativa ma noi vogliamo sovrascriverlo
    public boolean equals(Object obj){
        // ora qui verranno acccettati tutti gli oggetti perchè tutti gli oggetti ereditano da object
        // e quindi di partenza sono di tipo object
        //? Quando due oggetti sono uguali?

        // caso 1. due oggetti sono uguali se hanno lo stesso riferimento
        if(this == obj) return true;
       
        //caso 2. due oggetti sono SICURAMENTE DIVERSI se hanno classi differenti
        if(obj == null || this.getClass() != obj.getClass()) return false;

        // caso 3. se sono arrivato fin qui vuol dire che obj è != null ed è di classe Pointer3D
        Pointer3D other = (Pointer3D) obj; //Facciamo il cast poichè anche se sappiamo che obj è di classe Pointer3d, obj.x andrebbe in errore poichè non capisce implicitamente la struttura di obj, facciamo un cast poichè java non fa sempre conversioni in automatico dobbiamo spesso dirgli noi di farlo e a cosa a differenza di altri linguaggi
        if(this.x == other.x &&
            this.y == other.y &&
            this.z == other.z) return true;
        return false;
        //tutti i return perchè? Return as soon as possible
    }
}