public class GalaxyTab implements ITablet{

    private final String name = "Samsung Galaxy Tab5";
    @Override
    public void apply(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }
}
