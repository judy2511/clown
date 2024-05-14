package model;

import java.awt.Color;
import static java.awt.Color.BLACK;
import java.awt.Graphics;

public class Plate  extends Shapes{
    private static final int hRad=40;
     private static final int vRad=10;
      private static final int rad=20;
     private String type;
    public Plate(Color fillColor,int x,int y,String type) {
        super( fillColor, x, y);
        this.type=type;
            }
    @Override
   public void draw(Graphics canvas){
       if(this.type.equals("bomb")){
          super.setColor(BLACK);
           canvas.setColor(getColor());
         canvas.fillOval(getX(),getY(), 2*this.rad, 2*this.rad); 
       }
       else{
         canvas.setColor(getColor());
         canvas.fillOval(getX(),getY(), 2*this.hRad, 2*this.vRad);}}
      
  
}
