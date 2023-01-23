package factory;

import factory.types.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomActorFactory {

    public Actor generateActor() {

        Random random = new Random();
        int r1 = random.nextInt(3);

        if(r1 == 0) {
            return new Bee("Maja", "Bee");
        }
        else if(r1 == 1){
            return new Ant("Brian", "Ant");
        }
        return new Wolf("Lukas", "Wolf");
    }
}