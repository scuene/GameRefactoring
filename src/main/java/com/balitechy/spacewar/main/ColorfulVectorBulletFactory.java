package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class ColorfulVectorBulletFactory extends BulletStyleFactory {
    @Override
    public Shape createBulletShape() {
        return new Ellipse2D.Double(0, 0, Bullet.WIDTH, Bullet.HEIGHT);
    }
    @Override
    public Color getBulletColor() {
        return Color.ORANGE;
    }
}
