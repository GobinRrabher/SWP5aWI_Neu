import strategy.*;

public class Main {
    public static void main(String[] args) {
        WufStrategy ws1 = new WuffWuff();
        WufStrategy ws2 = new Wuuuuuf();

        Dog d1 = new Boxer("Brian",ws1);

        d1.run();

    }
}
