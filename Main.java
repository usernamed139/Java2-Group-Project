public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Fire Simulation");

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
        System.out.println("dryWood toString (" + dryWood.toString() + ")");

        Grid simulationGrid = new Grid(10, 10);
        simulationGrid.display();
    }
}
