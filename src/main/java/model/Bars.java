package model;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;

public class Bars {
   int x,y,number,length,width;
   ImageIcon img;
  static int xbounds,ybounds;
 public Bars (int x,int y,int length,int width,String img,int number){
      this.x=x;
      this.y=y;
      this.length=length;
      this.width=width;
      this.img=new ImageIcon(img);
      this.number =number;
      
  }

public void draw(Graphics g,ImageObserver i){
     g.drawImage(img.getImage(), this.x, this.y, this.length, this.width, i);
     
}
}
