package com.papirum.model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JToolBar;

public class ToolBarFigura extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	BufferedImage img;  
	  
	  TexturePaint texture;  
	  
	  public ToolBarFigura(File file)  {  
	    super();  
	    try {  
	      img = ImageIO.read(file);  
	    } catch (IOException e) {  
	      e.printStackTrace();  
	    }  
	    Rectangle rect = new Rectangle(0, 0, img.getWidth(null), img.getHeight(null));  
	    texture = new TexturePaint(img, rect);  
	    setOpaque(false);  
	  }  
	  
	  public void paintComponent(Graphics g) {  
	    Graphics2D g2 = (Graphics2D) g;  
	    g2.setPaint(texture);  
	    g.fillRect(0, 0, getWidth(), getHeight());  
	    super.paintComponent(g);  
	  }  

}



