package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Bowl extends Shapes {
     private static final int length=80,width=20;
 
     public Bowl(Color Color,int x,int y) {
        super(Color,x,y);
        
        
    }

    
     @Override
      public void draw (Graphics canvas){
        
        canvas.setColor(getColor());
        canvas.fillRect(this.getX(),this.getY(),Math.abs(Bowl.length), Math.abs(Bowl.width));
    }
}
