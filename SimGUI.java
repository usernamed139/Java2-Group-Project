import java.awt.*;
import javax.swing.*;

public class SimGUI {
    private Grid model;
    private JFrame frame;
    private FirePanel panel;
    private Timer timer;
    private final int DELAY = 500; // ms delay
    private final int SCALE = 10; // pixels per tile

    // Constructor
    public SimGUI(Grid model) {
        this.model = model;
        this.panel = new FirePanel();

        this.frame = new JFrame("Simulation");
        this.frame.setSize(model.getCols() * SCALE, (model.getRows() + 3) * SCALE - 3);

        this.frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.frame.getContentPane().add(this.panel);

        // Updates every [DELAY] milliseconds
        this.timer = new Timer(DELAY, (event) -> this.update());
        this.timer.start();

        this.frame.setVisible(true);
    }

    private void update() {
        this.model.update();
        this.panel.repaint();
    }

    private class FirePanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {            
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g;

            for (int i = 0; i < SimGUI.this.model.getCols(); i++) { // x
                for (int k = 0; k < SimGUI.this.model.getRows(); k++) { // y
                    // Draws a frame of the simulation
                    g2.setColor(SimGUI.this.model.map[i][k].getColor());
                    g2.fillRect(i * SCALE, k * SCALE, SCALE, SCALE);
                }
            }
        }
    }
}