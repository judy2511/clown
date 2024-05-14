package controler;

import static controler.MovePlates.getHMove;

public class level2 {
     MovePlates hmove=getHMove();
     GenRandom GN=new GenRandom();
  public  level2(){
      hmove.setSpeed(8);
     GN.setColorNum(4);
    }
}
