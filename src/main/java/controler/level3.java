package controler;

import static controler.MovePlates.getHMove;

public class level3 {
    
     MovePlates hmove=getHMove();
     GenRandom GN=new GenRandom();
      public  level3(){
          hmove.setSpeed(6);
     GN.setColorNum(5);
    }
}
