package controler;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import model.Bars;
import model.Clown;
import static model.Clown.getClown;
import model.ShapeFactory;
import model.Shapes;
import model.world;

public class Draw extends JPanel implements world{
 public static  boolean statePlaying=true;
    ShapeFactory sf = new ShapeFactory();
    public static ArrayList<Shapes> Shapes1 = new ArrayList<>();
    static ArrayList<Shapes> Shapes2 = new ArrayList<>();
    static ArrayList<Shapes> Shapes3 = new ArrayList<>();
    static ArrayList<Shapes> Shapes4 = new ArrayList<>();
    public ArrayList<Bars> bars = sf.createBars();
    public static final String path = "C:\\Users\\L E N O V O\\Documents\\NetBeansProjects\\circus\\src\\main\\java\\media\\";
    Clown clown = getClown();

    private Draw() {
    }
    static Draw draw = new Draw();

    public static Draw getDraw() {
        return draw;
    }

    @Override
    public void addBar(Bars b) {
        bars.add(b);
    }

    @Override
    public void addShapes(Shapes shape, int pos) {
        if (pos == 0) {
            Shapes1.add(shape);
        }
        if (pos == 1) {
            Shapes2.add(shape);
        }
        if (pos == 2) {
            Shapes3.add(shape);
        }
        if (pos == 3) {
            Shapes4.add(shape);
        }
    }

    @Override
    public void removeShape(Shapes shape, int pos) {
        switch (pos) {
            case 0 ->
                Shapes1.removeIf((cShapes) -> cShapes.toString().equals(shape.toString()));

            case 1 ->
                Shapes2.removeIf((cShapes) -> cShapes.toString().equals(shape.toString()));
            case 2 ->
                Shapes3.removeIf((cShapes) -> cShapes.toString().equals(shape.toString()));
            case 3 ->
                Shapes4.removeIf((cShapes) -> cShapes.toString().equals(shape.toString()));
            default -> {
            }
        }
    }
    public void removeShapes(){
        Shapes1.removeAll(Shapes1);
           Shapes2.removeAll(Shapes2);
              Shapes3.removeAll(Shapes3);
                 Shapes4.removeAll(Shapes4);
        
    }

    @Override
    public void refresh() {
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.clearRect(0, 0, 9999, 9999);
        ImageIcon bg = new ImageIcon(path + "inner circus.JPEG");
        g.drawImage(bg.getImage(), 0, 0, g.getClipBounds().width, g.getClipBounds().height, this);

        for (Bars s : bars) {
            s.draw(g, this);
        }
        clown.draw(g, this);
        try {
            for (Shapes s : Shapes1) {
                s.draw(g);
            }
            for (Shapes s : Shapes2) {
                s.draw(g);
            }
            for (Shapes s : Shapes3) {
                s.draw(g);
            }
            for (Shapes s : Shapes4) {
                s.draw(g);
            }
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

    }



}
