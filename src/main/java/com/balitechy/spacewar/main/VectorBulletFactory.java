package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Shape;

public class VectorBulletFactory extends BulletStyleFactory {
    @Override
    public Shape createBulletShape() {
        return new Rectangle(0, 0, Bullet.WIDTH, Bullet.HEIGHT);
    }
    @Override
    public Color getBulletColor() {
        return Color.RED;
    }
}
