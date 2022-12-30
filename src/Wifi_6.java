public class Wifi_6 implements IVisitor{

    public void baglan(ITablet tablet){
        System.out.println(tablet.getClass().getName() + " tabletine Wifi 6 özelligi eklendi.");
    }

    @Override
    public void visit(ITablet tablet) {
        baglan(tablet);
    }
}
