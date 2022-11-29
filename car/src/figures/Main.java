package figures;

public class Main {
    public static void main(String[] args) {
        Figure r1 = new Rectangle("rectangle1", 5, 4);
        Figure c1 = new Circle("circle", 1);
        Figure s1 = new Square("square", 10);

        r1.getArea();
        c1.getArea();
        s1.getArea();
    }
}
