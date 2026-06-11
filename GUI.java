import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JPanel{
    private Grid grid;
    private Timer timer;
    public GUI() {
        grid = new Grid(40, 85);

        timer = new Timer(250, new ActionListener() {
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

                g.setColor(t.getColor());

                g.fillRect(c * 20, r * 20, 20, 20);
            }
        }
    }

    public void stopTimer() {
        timer.stop();
    }

    public void startTimer() {
        timer.start();
    }
}

