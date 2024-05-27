package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class BackgroundRenderer {
    public void render(Graphics g, Canvas c) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());

        // Dibujo un círculo en la esquina superior izquierda
	   g.setColor(Color.BLACK); 
	   int circleSize = 100; 
	   g.drawOval(10, 10, circleSize, circleSize); 
    }
}