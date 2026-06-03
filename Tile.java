import java.awt.Color;

public class Tile {
  public int x = 0;
  public int y = 0;
  
  public Tile() {

  }

  public boolean isBurnable(){
    return false; //default
  }

  public String toString() {
    return " ";
  }

  public Color getColor() {
    Color c = Color.WHITE;
    return c;
  }

  public void tick() {
    
  }
}
