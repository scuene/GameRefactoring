package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Shape;

public abstract class PlayerStyleFactory {
    public abstract Shape createPlayerShape();
    public abstract Color getPlayerColor();
}
