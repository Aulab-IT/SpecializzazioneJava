public class Preist extends WizardCharacter implements Spell{
    public Preist(String name) {
        super(name);
    }


    @Override
    public void attack() {
        System.out.println(name + " Attacco Papale");
    }

    @Override
    public void defend() {
        System.out.println(name + " Invoco la protezione divina");
    }

    @Override
    public void castFireball() {
        System.out.println(name + " palla di fuoco infernale");
    }

    @Override
    public void castLightningBolt() {
        System.out.println(name + "la classe prete non può usare magie elettriche");
    }

    @Override
    public void castHealingTouch() {
        System.out.println(name + "Asclepio curami!!!");
        
    }
}
