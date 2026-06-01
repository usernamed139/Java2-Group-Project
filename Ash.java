import java.awt.Color;

public class Ash extends Tile{
    @Override
    public String toString(){
        return ".";
    }

    @Override
    public Color getColor(){
        return Color.GRAY;
    }
}