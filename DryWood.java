import java.awt.Color;

public class DryWood extends Wood {
    @Override
    public Color getColor(){
        // Light brown
        Color c = new Color(155, 129, 95);
        return c;
    }

    @Override 
    public int getBurnChance() {
        return 80;
    }
}