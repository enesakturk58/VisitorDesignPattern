public class Main {
    public static void main(String[] args) {

            IVisitor wifi = new Wifi_6();
            IVisitor besG = new _5G();

            ITablet galaxyTab1 = new GalaxyTab();
            ITablet iPad1 = new IPad();

            galaxyTab1.apply(wifi);

            iPad1.apply(wifi);
            iPad1.apply(besG);

    }
}