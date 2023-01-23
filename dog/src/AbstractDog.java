import strategy.WufStrategy;

import java.util.Date;

public abstract class AbstractDog implements Dog{
    protected String name;
    protected WufStrategy ws;
    //protected Date birthday;

    public AbstractDog(String name, WufStrategy ws){
        this.name = name;
        this.ws = ws;
    }

    public String getName() {
        return name;
    }
}
