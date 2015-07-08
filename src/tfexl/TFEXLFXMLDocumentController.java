/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfexl;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 *
 * @author matthew.g.stemen
 */
public class TFEXLFXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Canvas c1;
    @FXML
    private Canvas c2;
    @FXML
    private Canvas c3;
    @FXML
    private Canvas c4;
    @FXML
    private Canvas c5;
    @FXML
    private Canvas c6;
    @FXML
    private Canvas c7;
    @FXML
    private Canvas c8;
    
    private Tile t1;
    private Tile t2;
    private Tile t3;
    private Tile t4;
    private Tile t5;
    private Tile t6;
    private Tile t7;
    private Tile t8;    
            
    
    
            
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // bind the tile and canvas together
        //c1 = new Canvas();
        t1 = new Tile( c1 );
        //c2 = new Canvas();
        t2 = new Tile( c2 );
        //c3 = new Canvas();
        t3 = new Tile( c3 );
        //c4 = new Canvas();
        t4 = new Tile( c4 );
        //c5 = new Canvas();
        t5 = new Tile( c5 );
        //c6 = new Canvas();
        t6 = new Tile( c6 );
        //c7 = new Canvas();
        t7 = new Tile( c7 );
        //c8 = new Canvas();
        t8 = new Tile( c8 );
        
        initTiles();
    }    
    
    
    private void initTiles()
    {
        t1.setBackground(Color.AQUA);
        t1.render();
        t2.render();
        t3.render();
        t4.render();
        t5.render();
        t6.render();
        t7.render();
        t8.render();
        
    }
}
