package model;

import controler.Draw;
import java.awt.Color;
import java.util.ArrayList;

public class ShapeFactory {
        public static final String plate="plate";
         public static final String bomb="bomb";
     public static final String bowl="bowl";
      public static final String tri="triangle";
      public static String path=Draw.path;
     static ArrayList<Bars> bars=new ArrayList<>();
     public ShapeFactory(){
         
     }
     
     public static Shapes createShape(String s,Color c,int x,int y){
          if(s.equals(bowl)){
             return new Bowl(c,x,y);
         }
         if(s.equals(plate)){
             return new Plate(c,x,y,"plate");
         }
          if(s.equals(bomb)){
             return new Plate(c,x,y,"bomb");
         }
          if(s.equals(tri)){
             return new Triangle(c,x,y);
         }
        
         return null;
     }
     public  ArrayList<Bars> createBars(){
           Bars b1=new Bars(0, 30, 350, 120,path+"barL.PNG",1);
 Bars b2=new Bars( 700, 30, 350, 120, path+"barR.PNG",2);
  Bars b3=new Bars(0, 90, 200, 120,path+"barL.PNG",3);
 Bars b4=new Bars( 850, 90, 200, 120, path+"barR.PNG",4);
 
 bars.add(b1);
 bars.add(b2);
 bars.add(b3);
 bars.add(b4);
 return bars;
 
     }
}
