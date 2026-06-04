import javax.swing.*;

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
    /*  public static void main(String[] args) {
        System.out.println("Welcome to Fire Simulation");

        classToStrings();

        // TODO: GUI that asks user for input, ie, size of board
        // and composition of DryWood/Wood

        Grid simulationGrid = new Grid(10, 10);
        SimGUI simulationGUI = new SimGUI(simulationGrid);
        simulationGrid.display();
    }
*/
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fire Simulation");
        frame.add(new GUI());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
