public class Person {
    private String nome;
    private String cognome;
    private int eta;

    public Person(int eta, String nome, String cognome) {
        setEta(eta);
        setNome(nome);
        setCognome(cognome);
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public int getEta() {
        return this.eta;
    }

}
