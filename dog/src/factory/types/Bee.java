package factory.types;

public class Bee extends Type {

    public Bee(String name, String type){
        super(name, type);
    }

    @Override
    public void sayHello() {
    }

    @Override
    public void getName() {
        System.out.println(this.name);
    }
}
