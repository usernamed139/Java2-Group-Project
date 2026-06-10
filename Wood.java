import java.awt.Color;

public class Wood extends Tile {
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
        Color c = new Color(145, 100, 62);
        return c;
    }

    @Override 
    public int getBurnChance() {
        return 50;
    }
}