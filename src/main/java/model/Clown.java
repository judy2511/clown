package model;

import controler.AudioPlayer;
import controler.Draw;
import static java.awt.Color.BLACK;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import static model.Observer.getObserver;
import view.play;
public class Clown implements gameObject,Score{
    int x;
    static int xPlate1, xPlate2, yPlate1, yPlate2;
    int prevX;
    public LinkedList<Shapes> catchedShapes1 = new LinkedList<>();
    public LinkedList<Shapes> catchedShapes2 = new LinkedList<>();
    public static int win1 = 1;
    public static int win2 = 1;
    public static int score = 0;
 public static String path=Draw.path;
    @Override
    public void addShapes1(Shapes shape) {
        catchedShapes1.add(shape);
        setYPlate1();
        this.score1(shape);
        state();
        if(shape.getColor()==BLACK) Draw.statePlaying=false;
    }

    @Override
    public void addShapes2(Shapes shape) {
        catchedShapes2.add(shape);
        setYPlate2();
        this.score2(shape);
        state();
         if(shape.getColor()==BLACK) Draw.statePlaying=false;
    }

    @Override
    public void removeShape1(Shapes shape) {
        catchedShapes1.removeIf((cShapes) -> cShapes.toString().equals(shape.toString()));
    }

    @Override
    public void removeShape2(Shapes shape) {
        catchedShapes2.removeIf((cShapes) -> cShapes.toString().equals(shape.toString()));
    }
    @Override
    public void removeShapes(){
    catchedShapes1.removeAll(catchedShapes1);
     catchedShapes2.removeAll(catchedShapes2);
     yPlate1 = 380;
        yPlate2 = 380;
        score=0;
}
    @Override
    public int getPrevX() {
        return prevX;
    }

    public void setPrevX(int prevX) {
        this.prevX = prevX;
    }
    static final int width = 220, height = 320, y = 320;
    static final ImageIcon img = new ImageIcon(path + "clown.PNG");
    boolean selected;

    private Clown() {
        this.x = 200;
        this.prevX = x;
        yPlate1 = 380;
        yPlate2 = 380;
        setXPlates();
    }
    public static Clown c = new Clown();

    public static Clown getClown() {
        return c;
    }

    @Override
    public int getxPlate1() {
        return xPlate1;
    }

    @Override
    public void setxPlate1(int xPlate1) {
        Clown.xPlate1 = xPlate1;
    }

    @Override
    public int getxPlate2() {
        return xPlate2;
    }

    @Override
    public void setxPlate2(int xPlate2) {
        Clown.xPlate2 = xPlate2;
    }

    @Override
    public int getyPlate1() {
        return yPlate1;
    }

    @Override
    public void setyPlate1(int yPlate1) {
        Clown.yPlate1 = yPlate1;
    }

    @Override
    public int getyPlate2() {
        return yPlate2;
    }

    @Override
    public void setyPlate2(int yPlate2) {
        Clown.yPlate2 = yPlate2;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @param g
     * @param i
     */
    @Override
    public void draw(Graphics g, ImageObserver i) {
        g.drawImage(img.getImage(), this.x, Clown.y, Clown.width, Clown.height, i);
    }

    @Override
    public boolean contains(int x, int y) {

        int x2 = this.x + Clown.width;
        int y2 = Clown.y + Clown.height;
        return x > this.x && x < x2 && y > Clown.y && y < y2;
    }

    @Override
    public void moveTo(int x) {
        int m = x - prevX;
        setX(getX() + m);
        for (Shapes s : catchedShapes1) {
            s.setX(s.getX() + m);
            if(s instanceof Triangle triangle){triangle.setPoints();}
        }
        for (Shapes s : catchedShapes2) {
            s.setX(s.getX() + m);
             if(s instanceof Triangle triangle){triangle.setPoints();}
        }
        this.prevX = x;
        setXPlates();
    }

    @Override
    public boolean isSelected() {
        return selected;
    }

    @Override
    public void setselected(boolean isselected) {
        this.selected = isselected;
    }

    @Override
    public void setXPlates() {
        Clown.xPlate1 = this.x;
        Clown.xPlate2 = this.x + 150;
    }

    public static void setYPlate1() {
        Clown.yPlate1 -= 20;
    }

    public static void setYPlate2() {
        Clown.yPlate2 -= 20;
    }

    @Override
    public boolean isExsist(Shapes shape) {
        return catchedShapes1.contains(shape) || catchedShapes2.contains(shape);
    }

    @Override
    public void score1(Shapes s) {
        if (catchedShapes1.size() > 2) {
            if (s.getColor().equals(catchedShapes1.get(catchedShapes1.size() - 2).getColor()) && s.getColor().equals(catchedShapes1.get(catchedShapes1.size() - 3).getColor())||s instanceof Triangle) {
                Clown.newScore();
                for(int i=1;i<4;i++)
                           catchedShapes1.get(catchedShapes1.size() - i).setY(9999);
                 for(int i=1;i<4;i++)
                catchedShapes1.removeLast();
                Clown.yPlate1 += 60;

            }
        }
    }

    @Override
    public void score2(Shapes s) {
        if (catchedShapes2.size() > 2) {
            if (s.getColor() == catchedShapes2.get(catchedShapes2.size() - 2).getColor() && s.getColor().equals(catchedShapes2.get(catchedShapes2.size() - 3).getColor())||s instanceof Triangle) {
                Clown.newScore();
                 for(int i=1;i<4;i++)
                     catchedShapes2.get(catchedShapes2.size() - i).setY(9999);
                  for(int i=1;i<4;i++)
                catchedShapes2.removeLast();
                Clown.yPlate2 += 60;

            }

        }
    }
    public static Observer o = getObserver();

    public static void newScore() {
        ++Clown.score;
        if (Clown.score == 5) {
            o.updateLevel(2);
        }
       else if (Clown.score == 10) {
            o.updateLevel(3);
        }

        play.setScore("" + Clown.score);
        AudioPlayer.main(null, path + "scoreSound.wav");

    }
    public void state(){
        if(catchedShapes1.size()>12||catchedShapes2.size()>12){
           Draw.statePlaying=false;
        }
    }

}
