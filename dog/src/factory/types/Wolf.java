package factory.types;

public class Wolf extends Type {

    public Wolf(String name, String type){
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
