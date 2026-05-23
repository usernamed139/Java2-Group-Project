import java.awt.*;

public class Fire extends Tile {
    public String toString() {
        return "⌁";
    }

    public Color getColor() {
        return Color.RED;
    }

    public void tick() {
        // TODO: turns into ash after a certain amount of ticks
    }
}