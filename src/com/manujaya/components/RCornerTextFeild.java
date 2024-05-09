package com.manujaya.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Manujaya
 */
public class RCornerTextFeild extends JTextField{
    
    public RCornerTextFeild() {
//        setCon(false);
        setForeground(Color.WHITE);
        setBackground(new Color(0,0,0,0));

//        super(cols);
        // We must be non-opaque since we won't fill all pixels.
        // This will also stop the UI from filling our background.
//        setOpaque(false);
        // Add an empty border around us to compensate for
        // the rounded corners.
        setBorder(new EmptyBorder(0, 10, 0, 0));
//        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }
    @Override
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();

        // Paint a rounded rectangle in the background.
        g2.setColor(new Color(43, 149, 70));
        g2.fillRoundRect(0, 0, width, height, 25, 25);
        // Now call the superclass behavior to paint the foreground.
        g.drawImage(img, 0, 0, null);
        super.paintComponent(g);
    }

    
}
