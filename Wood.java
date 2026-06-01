import java.awt.Color;

public class Wood extends Tile {
    public void tryBurn() {
        // TODO
    }

    @Override
    public String toString(){
        return "Y";
    }

    @Override
    public Color getColor(){
        // Brown
        Color c = new Color(127, 78, 31);
        return c;
    }
}