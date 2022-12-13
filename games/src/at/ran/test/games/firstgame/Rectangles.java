package at.ran.test.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangles extends BasicGame {
    private int x,y;
    private int circlex,circley,circler;
    private int circlefacing = 1;
    private int ovalx,ovaly,ovalr1,ovalr2;
    private int ovalfacing = 1;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 100;
        this.circlex = 0;
        this.circley = 100;
        this.circler = 50;
        this.ovalx = 100;
        this.ovaly = 0;
        this.ovalr1 = 100;
        this.ovalr2 = 50;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.x++;
        this.y++;
        this.circley += 1*circlefacing;
        this.ovalx += 1*ovalfacing;

        if(this.x>800){
            this.x = 0;
            this.y = 0;
        }
        if(this.circley>500){
            circlefacing = -1;
            ovalfacing = -1;
        }
        if(this.circley<100){
            circlefacing = 1;
            ovalfacing = 1;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 50, 50);
        graphics.drawOval(this.circlex, this.circley, this.circler, this.circler);
        graphics.drawOval(this.ovalx, this.ovaly, this.ovalr1, this.ovalr2);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("First Game"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
