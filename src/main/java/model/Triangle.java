
package model;

import java.awt.Color;
import static java.awt.Color.MAGENTA;
import java.awt.Graphics;

public class Triangle extends Shapes{
   static final Color  c=MAGENTA;
   int x2,y2,x3,y3;
    public Triangle(Color Color, int x, int y) {
        super(Triangle.c, x, y);
        setPoints();
    }
    public void setPoints(){
        this.x2=getX()+50;
          this.y2=getY();
             this.x3=getX()+25;
          this.y3=getY()+25;
          
    }
   @Override
    public void barMoveL(){
        setX(getX()+2);
        setPoints();
    }
      @Override
    public void barMoveR(){
        setX(getX()-2);
        setPoints();
    }
     @Override
    public void falling(){
        setY(getY()+2);
          setPoints();
    }
   @Override
    public void draw(Graphics canvas){
                canvas.setColor(c);
  canvas.fillPolygon(new int[]{this.getX() ,x2,x3},new int[]{this.getY(),y2,y3}, 3);
    }
    
}
