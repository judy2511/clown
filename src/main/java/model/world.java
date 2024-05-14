package model;
public interface world {
   void addBar(Bars b);
    void addShapes(Shapes s,int pos);
    void removeShape(Shapes s,int pos);
    void refresh();
}
