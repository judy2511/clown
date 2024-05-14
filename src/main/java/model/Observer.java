package model;

import controler.AudioPlayer;
import controler.Draw;
import controler.level1;
import controler.level2;
import controler.level3;
import view.play;

public class Observer {

    int level = 1;
   public static String path=Draw.path;

    private Observer() {
    }
    public static Observer o = new Observer();

    public static Observer getObserver() {
        return Observer.o;
    }

    public void updateLevel(int level) {
        switch (level) {
            case 1:
                level1 l1 = new level1();
                break;
            case 2:
                level2 l2 = new level2();
                play.setLevel("Level 2");
                AudioPlayer.main(null, path + "newlevel.wav");
                break;
            case 3:
                level3 l3 = new level3();
                play.setLevel("Level 3");
                AudioPlayer.main(null, path + "newlevel.wav");
                break;
        }
    }
}
