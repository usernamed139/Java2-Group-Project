import java.awt.Color;

public class Fire extends Tile {
    private int lifeTime;

    public Fire(){
        this.lifeTime = 3;
    }

    public String toString() {
        return "\uD83D\uDD25";
    }

    public Color getColor() {
        return Color.RED;
    }

    public void tick() {
        this.lifeTime--;
    }

    public boolean isExtinguished(){
        if (lifeTime <= 0){
            return true;
        }
        else{
            return false;
        }
    }
}