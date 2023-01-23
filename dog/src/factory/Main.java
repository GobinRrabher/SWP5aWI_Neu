package factory;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        RandomActorFactory raf = new RandomActorFactory();

        for(int i=0;i<20;i++){
            actors.add(raf.generateActor());
        }
        for (Actor actor:actors) {
            actor.sayHello();
            actor.getName();
        }
    }
}
