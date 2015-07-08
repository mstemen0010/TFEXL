/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfexl;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author matthew.g.stemen
 */
public class Tile {
    
    Canvas canvas;
    int value = -2;
    
    public Tile( Canvas canvas )
    {
        this.canvas = canvas;
    }
    
    public void setBackground( Color color )
    {
        this.canvas.getGraphicsContext2D().setFill(color);
        render();
    }
    
    public void render()
    {
        
        double x = 0.0; // canvas.getWidth();
        double y = 0.0;
        double w = canvas.getWidth();
        double h = canvas.getHeight();
        System.out.println("Canvas height is: " + w );
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill( Color.ANTIQUEWHITE);
        gc.fillRect(0, 0, w, h);
        gc.setFont(Font.font ("Verdana", 32) );
        gc.setFill(Color.BLACK);
        gc.fillText("02", x, y, w);
        
        
        
    }
}
