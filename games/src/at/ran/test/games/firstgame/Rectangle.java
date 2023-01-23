package at.ran.test.games.firstgame;

import org.newdawn.slick.*;

public class Rectangle {
    private enum DIRECTION {RIGHT, DOWN, LEFT, UP};
    private int x;
    private int y;
    private int speed;

    public Rectangle(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render(Graphics graphics){
        graphics.drawRect(this.x, this.y, 10, 10);
    }

    public void update(int delta){
        this.x += (float)delta/this.speed;
        if(this.x>600){
            this.x = 0;
        }
    }
}
