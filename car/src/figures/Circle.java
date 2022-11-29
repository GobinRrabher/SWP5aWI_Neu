package figures;


public class Circle extends Figure{

    private int radius;

    public Circle(String name, int radius){
        super(name);
        this.radius = radius;
    }

    public void getArea(){
        double a = (radius^2)*Math.PI;
        System.out.println("Area of Circle: " + a);
    }

    public int getRadius() {
        return radius;
    }
}
