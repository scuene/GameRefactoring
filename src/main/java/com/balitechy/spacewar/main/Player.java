package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.image.BufferedImage;

class Player {
    private double x;
    private double y;
    private double velX;
    private double velY;
    public static final int WIDTH = 56;
    public static final int HEIGHT = 28;
    private Shape shape;
    private Color color;
    private Game game;

    public Player(double x, double y, PlayerStyleFactory factory, Game game) {
        this.x = x;
        this.y = y;
        this.shape = factory.createPlayerShape();
        this.color = factory.getPlayerColor();
        this.game = game;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setVelX(double velX) {
        this.velX = velX;
    }

    public void setVelY(double velY) {
        this.velY = velY;
    }

    public void shoot() {
        Bullet b = new Bullet(x + (WIDTH / 2) - 5, y - 18, game.getBulletStyleFactory());
        game.getBullets().addBullet(b);
    }

    public void tick() {
        x += velX;
        y += velY;

        if (x <= 0) x = 0;
        if (x >= (Game.WIDTH * Game.SCALE) - WIDTH) x = (Game.WIDTH * Game.SCALE) - WIDTH;
        if (y <= 0) y = 0;
        if (y >= (Game.HEIGHT * Game.SCALE) - HEIGHT) y = (Game.HEIGHT * Game.SCALE) - HEIGHT;
    }

    public void render(Graphics g) {
        g.setColor(color);
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(x, y);
        g2d.fill(shape);
        g2d.translate(-x, -y);
    }
}
