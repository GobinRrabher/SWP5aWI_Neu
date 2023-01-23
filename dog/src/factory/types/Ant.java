package factory.types;

public class Ant extends Type {

    public Ant(String name, String type){
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
