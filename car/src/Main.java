public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        Tank t1 = new Tank(100);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);
        Car c1 = new Car(t1, e1, 12, "Opel", "12347");

        c1.addMirror(r1);
        c1.addMirror(r2);

        System.out.println(c1.getMirrors().get(0).getPosition());

        c1.attributes();
        c1.drive(20);

    }
}
