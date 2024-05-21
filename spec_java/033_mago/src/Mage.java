public class Mage extends WizardCharacter implements Spell{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacco con magical blast!");
    }

    @Override
    public void defend() {
        System.out.println(name + " utilizza scudo magico");
    }

    @Override
    public void castFireball() {
        System.out.println(name + " magia d'attacco fireball");
    }

    @Override
    public void castLightningBolt() {
        System.out.println(name + " lightning bolt!");
 
    }

    @Override
    public void castHealingTouch() {
        System.out.println(name + " magia curativa");
    }
}
