import java.awt.*;

public class Ash extends Tile{
    @Override
    public String toString(){
        return ".";
    }

    @Override
    public Color toColor(){
        return Color.GRAY;
    }
}