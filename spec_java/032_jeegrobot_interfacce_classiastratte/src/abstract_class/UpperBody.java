package abstract_class;
public abstract class UpperBody {
    public String upper_body_side;
    public UpperBody(String upper_body_side) {
        this.upper_body_side = upper_body_side;
    }
    abstract public void upper_attack();
    abstract public void defence();
}
