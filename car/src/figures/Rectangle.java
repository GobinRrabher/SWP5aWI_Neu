package figures;

public class Rectangle extends Figure{

    private int length;
    private int height;
    public Rectangle(String name, int length, int height){
        super(name);
        this.length = length;
        this.height = height;
    }

    public void getArea(){
        int a = getHeight() * getLength();
        System.out.println("Area of Square: " + a);
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
