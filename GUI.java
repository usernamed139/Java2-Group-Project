import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JPanel{
    private Grid grid;

    public GUI() {
        grid = new Grid(25, 25);

        Timer timer = new Timer(200, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                grid.update();
                repaint();
            }
        });
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int r = 0; r < grid.getRows(); r++) {
            for (int c = 0; c < grid.getCols(); c++) {
                Tile t = grid.getTile(r, c);
                if (t instanceof Fire) {
                    g.setColor(Color.RED);
                }
                else if (t instanceof Ash) {
                    g.setColor(Color.GRAY);
                }
                else if (t.isBurnable()) {
                    g.setColor(new Color(139, 69, 19));
                }
                else {
                    g.setColor(new Color(139, 69, 19));
                }
                g.fillRect(c * 20, r * 20, 20, 20);
            }
        }
    }
}

