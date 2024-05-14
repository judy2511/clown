package controler;

import static controler.MovePlates.getHMove;

public class level1 {
   static MovePlates hmove=getHMove();
    static  GenRandom GN=new GenRandom();
  public  level1(){
     GN =new GenRandom();
     GN.setColorNum(3);
      hmove.setSpeed(10);
    try{ if(Draw.statePlaying){ hmove.start();}
           GN.start();}
  catch (Throwable e) {
        
        }
    }

}
