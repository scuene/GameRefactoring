package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class ColorfulVectorPlayerFactory extends PlayerStyleFactory {
    @Override
    public Shape createPlayerShape() {
        return new Ellipse2D.Double(0, 0, Player.WIDTH, Player.HEIGHT);
    }
    @Override
    public Color getPlayerColor() {
        return Color.BLUE;
    }
}
