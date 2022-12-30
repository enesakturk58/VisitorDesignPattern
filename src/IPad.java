public class IPad implements ITablet{

    private final String name = "Ipad 8.nesil";
    @Override
    public void apply(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }
}
