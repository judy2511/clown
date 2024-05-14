package model;

import java.awt.Color;
import java.awt.Graphics;
import static model.Clown.getClown;

public class Shapes {
private Color c;
private int x ,y;
   Clown clown=getClown();
    public Shapes(Color Color,int x,int y){
     setColor(Color);
      this.x=x;
      this.y=y;
           
 }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    

      public void setColor(Color color) {
this.c=color;    }

    public Color getColor() {
return this.c;    }
    public void barMoveL(){
        this.x+=2;
    }
      public void barMoveR(){
        this.x-=2;
    }
      public void falling(){
        this.y+=2;
    }
    
public void draw(Graphics canvas){}
public boolean abovePlate1(){
    return clown.getyPlate1()- this.y<=22 && this.y <clown.getyPlate1()&& (Math.abs(this.x-clown.getxPlate1())<=40); 
}
public boolean abovePlate2(){
    return clown.getyPlate2()- this.y<=21 && this.y <clown.getyPlate2()&& (Math.abs(this.x-clown.getxPlate2())<=40); 
}
}
