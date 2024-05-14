package controler;

import static controler.Draw.getDraw;
import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.GREEN;
import static java.awt.Color.PINK;
import static java.awt.Color.RED;
import static java.awt.Color.YELLOW;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Clown;
import static model.Clown.getClown;
import model.ShapeFactory;
import model.Shapes;
import view.play;

public class GenRandom extends Thread{
    private static  int colorNum=3;
   String [] shapes={"plate","bowl","triangle","bomb"};
   Color [] colors={RED,GREEN,BLUE,YELLOW,PINK};
   int[]x=new int[]{ -80,1040,-80,1040 };
   int[]y=new int[]{ 65,65,125,125 };
   Draw draw= getDraw();
    public static String path=Draw.path;
   public GenRandom(){
   }
    public void genRandom(){
        Random rand = new Random();
         for(int i=0;i<4;i++){
              int xshape = rand.nextInt(100);
         int xcolor = rand.nextInt(colorNum);
         Shapes randomShape = null;
       if(  xshape <10)  randomShape = ShapeFactory.createShape(shapes[3],colors[xcolor],x[i],y[i]);
        else if(  xshape >10&& xshape <20)  randomShape = ShapeFactory.createShape(shapes[2],colors[xcolor],x[i],y[i]);
        else if(  xshape >20&& xshape <60)  randomShape = ShapeFactory.createShape(shapes[1],colors[xcolor],x[i],y[i]);
         else  randomShape = ShapeFactory.createShape(shapes[0],colors[xcolor],x[i],y[i]);
    draw.addShapes(randomShape, i);}
    }
     Clown clown =getClown();
     @Override
   public void run(){
      for(int i=0;i<500;i++){
                     try {
                         if(  Draw.statePlaying==false){ 
        break;}
                         genRandom();
               Thread.sleep(800);
                     } 
                     catch (InterruptedException ex) {
               Logger.getLogger(GenRandom.class.getName()).log(Level.SEVERE, null, ex);
           }
                  
                    catch(Throwable e) 
                    {
                        System.out.println(e.getMessage()); 
                    }
          
       }
         AudioPlayer.main(null, path+"endgame.wav");
     play.setEnd();
         
   }
  
     public  void setColorNum(int x){
       GenRandom.colorNum=x;
   }
}
