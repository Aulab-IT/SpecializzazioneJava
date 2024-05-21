public abstract class WizardCharacter {

        protected String name;
        protected int healthPoints;
        protected int manaPoints;
    
        public WizardCharacter(String name) {
            this.name = name;
            this.healthPoints = 100;
            this.manaPoints = 50;
        }
    
        public abstract void attack();
    
        public abstract void defend();
        
        public String getName() {
            return name;
        }
    
        public int getHealthPoints() {
            return healthPoints;
        }
    
        public int getManaPoints() {
            return manaPoints;
        }
    
        public void setHealthPoints(int healthPoints) {
            this.healthPoints = healthPoints;
        }
    
        public void setManaPoints(int manaPoints) {
            this.manaPoints = manaPoints;
        }
    }
