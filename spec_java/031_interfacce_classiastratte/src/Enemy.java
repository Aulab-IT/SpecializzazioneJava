public class Enemy implements MoveSet{
        // attributi
        public int hp;
        public String name;
        public String role;
        public int manapoint;
        public int stamina;
    
        public Enemy(int hp, String name, String role, int manapoint, int stamina) {
            this.hp = hp;
            this.name = name;
            this.role = role;
            this.manapoint = manapoint;
            this.stamina = stamina;
        }
        @Override
        public void moveForward(){
            System.out.println("Nemico in avanti");
        }
        @Override
        public void moveBack(){
            System.out.println("Nemico retrocede");
        }
        @Override
        public void jump(){
            System.out.println("il memico salta di un blocco");
        }
    
        public void greatings(){
            System.out.println("Sono un nemico");
        }
}
