package com.manujaya.components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class GreenButton extends JButton{
    

//    Color mycolor = new Color(43, 149, 70);
//    private Color btngreen = Color.decode("#0C8B30");
    Font btnFont = new Font("Segoe UI", Font.PLAIN, 18);
    
    public GreenButton(){
        setContentAreaFilled(false);
        setForeground(Color.WHITE);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBorder(new EmptyBorder(10, 20, 10, 20));
        setFont(btnFont);
    }
    
    @Override
    protected void paintComponent(Graphics grphcs){
        int width=getWidth();
        int height=getHeight();
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(43, 149, 70));
        g2.fillRoundRect(0, 0, width, height, height, height);
        grphcs.drawImage(img, 0, 0, null);
        super.paintComponent(grphcs);
        
    }
    
}


