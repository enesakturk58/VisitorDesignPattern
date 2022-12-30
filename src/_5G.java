public class _5G implements IVisitor{

    public void ara(ITablet tablet){
        System.out.println(tablet.getClass().getName()+" tabletine 5G arama ozelligi eklenildi.");
    }
    @Override
    public void visit(ITablet tablet) {
        ara(tablet);
    }
}
