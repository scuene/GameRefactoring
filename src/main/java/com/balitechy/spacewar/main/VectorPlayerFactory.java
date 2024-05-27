package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Shape;

public class VectorPlayerFactory extends PlayerStyleFactory {
    @Override
    public Shape createPlayerShape() {
        return new Rectangle(0, 0, Player.WIDTH, Player.HEIGHT);
    }
    @Override
    public Color getPlayerColor() {
        return Color.GREEN;
    }
}