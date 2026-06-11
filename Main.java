import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void classToStrings() {
        Tile tile = new Tile();
        Tile ash = new Ash();
        Tile water = new Water();
        Tile fire = new Fire();
        Tile wood = new Wood();
        Tile dryWood = new DryWood();

        System.out.println("Tile toString (" + tile.toString() + ")");
        System.out.println("Ash toString (" + ash.toString() + ")");
        System.out.println("Water toString (" + water.toString() + ")");
        System.out.println("Fire toString (" + fire.toString() + ")");
        System.out.println("Wood toString (" + wood.toString() + ")");
        System.out.println("DryWood toString (" + dryWood.toString() + ")");
    }

    public static void main(String[] args) {
        GUI gui = new GUI();

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.stopTimer();
            }
        });

        JButton continueButton = new JButton("Continue");
        continueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.startTimer();
            }
        });

        JFrame frame = new JFrame("Fire Simulation");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(stopButton);
        buttonPanel.add(continueButton);

        frame.add(gui, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
