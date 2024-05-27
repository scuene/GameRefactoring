package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Shape;

public abstract class BulletStyleFactory {
    public abstract Shape createBulletShape();
    public abstract Color getBulletColor();
}
