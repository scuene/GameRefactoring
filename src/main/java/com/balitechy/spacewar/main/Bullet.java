package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.image.BufferedImage;

class Bullet {
    private double x;
    private double y;
    public static final int WIDTH = 11;
    public static final int HEIGHT = 21;
    private Shape shape;
    private Color color;

    public Bullet(double x, double y, BulletStyleFactory factory) {
        this.x = x;
        this.y = y;
        this.shape = factory.createBulletShape();
        this.color = factory.getBulletColor();
    }

    public void tick() {
        y -= 5;
    }

    public void render(Graphics g) {
        g.setColor(color);
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(x, y);
        g2d.fill(shape);
        g2d.translate(-x, -y);
    }

    public double getY() {
        return y;
    }
}