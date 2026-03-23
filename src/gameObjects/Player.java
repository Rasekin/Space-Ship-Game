package gameObjects;

import input.KeyBoard;
import math.Vector2D;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends MovingObject {

    private Vector2D heading;

    public Player(Vector2D position, Vector2D velocity, BufferedImage texture) {
        super(position, velocity, texture);
    }

    @Override
    public void update()
    {

        if(KeyBoard.RIGHT)
            angle += Math.PI/10;
        if(KeyBoard.LEFT)
            angle += Math.PI/10;


        heading= heading.setDirection(angle - Math.PI/2);
    }

    @Override
    public void draw(Graphics g) {

        Graphics2D g2d = (Graphics2D)g;
    }
}
