package controler;

import static controler.Draw.getDraw;
import static controler.Draw.Shapes1;
import static controler.Draw.Shapes2;
import static controler.Draw.Shapes3;
import static controler.Draw.Shapes4;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Clown;
import static model.Clown.getClown;
import model.Shapes;

public class MovePlates extends Thread {
   Draw d=getDraw();
  private static int speed=0;
  
   private MovePlates(){ }
   static MovePlates hMove=new MovePlates();
   Clown clown =getClown();
   public static MovePlates getHMove(){
       return hMove;
   }
   public void plateMove(){
        for(Shapes s:Shapes1){if(clown.isExsist(s)==false){
           if(s.getX()<350)    s.barMoveL();
        else if(s.abovePlate1()){clown.addShapes1(s);}
        else if(s.abovePlate2()){clown.addShapes2(s);}
        else{ s.falling();}
        }}
         for(Shapes s:Shapes2){if(clown.isExsist(s)==false){
          if(s.getX()>650)    s.barMoveR();
          else if(s.abovePlate1()){clown.addShapes1(s);}
        else if(s.abovePlate2()){clown.addShapes2(s);}
          else{ s.falling();}
        }}
          for(Shapes s:Shapes3){if(clown.isExsist(s)==false){
          if(s.getX()<200)   s.barMoveL();
          else if(s.abovePlate1()){clown.addShapes1(s);
          }
        else if(s.abovePlate2()){clown.addShapes2(s);}
          else{ s.falling();}
        }}
         for(Shapes s:Shapes4){if(clown.isExsist(s)==false){
          if(s.getX()>780)  s.barMoveR();
          else if(s.abovePlate1()){clown.addShapes1(s);}
        else if(s.abovePlate2()){clown.addShapes2(s);}
         else{ s.falling();}
        }}
        d.refresh();
   }
   
   @Override
   public void run(){
       while (true){
                     try {
                         if(!d.statePlaying){ Thread.sleep(1000);d.refresh();continue;}
                         plateMove();
               Thread.sleep(MovePlates.speed);
           } catch (InterruptedException ex) {
               Logger.getLogger(MovePlates.class.getName()).log(Level.SEVERE, null, ex);
           }
                    catch(Throwable e) 
                    {
                        System.out.println(e.getMessage()); 
                    }
       }
       
      
   }

    public void setSpeed(int speed) {
        MovePlates.speed = speed;
    }
      
     
 
}
