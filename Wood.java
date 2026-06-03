import java.awt.Color;

public class Wood extends Tile {
    public void tryBurn() {
        // TODO
    }

    public boolean isBurnable(){
        return true;
    }

    @Override
    public String toString(){
        return "W";
    }

    @Override
    public Color getColor(){
        // Brown
        Color c = new Color(127, 78, 31);
        return c;
    }
}