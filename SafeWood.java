import java.awt.Color;

public class SafeWood extends Tile{
    public boolean isBurnable(){
        return false;
    }

    @Override
    public Color getColor(){
        // Brown
        Color c = new Color(119, 98, 81);
        return c;
    }
}
