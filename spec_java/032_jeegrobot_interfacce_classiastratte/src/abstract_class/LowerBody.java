package abstract_class;

public abstract class LowerBody {
    public String lower_body_side;
    
    public LowerBody(String lower_body_side) {
        this.lower_body_side = lower_body_side;
    }

    abstract public void low_attack();
}
