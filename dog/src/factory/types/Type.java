package factory.types;

import factory.Actor;

public class Type implements Actor {

    protected String name;
    protected String type;

    public Type(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public void sayHello() {
    }



    @Override
    public void getName() {;
    }
}
