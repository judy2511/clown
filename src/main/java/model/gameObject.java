package model;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface gameObject {

    public void addShapes1(Shapes shape);

    public void addShapes2(Shapes shape);

    public void removeShape1(Shapes shape);

    public void removeShape2(Shapes shape);
    
    public void removeShapes();

    public int getPrevX();

    public void setPrevX(int y);

    public int getxPlate1();

    public void setxPlate1(int x);

    public int getxPlate2();

    public void setxPlate2(int xp);

    public int getyPlate1();

    public void setyPlate1(int yp1);

    public int getyPlate2();

    public void setyPlate2(int yp2);

    public int getX();

    public void setX(int x);

    public void draw(Graphics g, ImageObserver i);

    public boolean contains(int x, int y);

    public void moveTo(int x);

    public boolean isSelected();

    public void setselected(boolean isselected);

    public void setXPlates();

    public boolean isExsist(Shapes shape);
}
