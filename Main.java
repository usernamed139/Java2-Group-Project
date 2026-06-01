public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Fire Simulation");

        Tile tile = new Tile();
        Tile ash = new Ash();
        Tile water = new Water();
        Tile fire = new Fire();
        Tile wood = new Wood();
        Tile dryWood = new DryWood();

        System.out.println("toString (" + tile.toString() + ")");
        System.out.println("toString (" + ash.toString() + ")");
        System.out.println("toString (" + water.toString() + ")");
        System.out.println("toString (" + fire.toString() + ")");
        System.out.println("toString (" + wood.toString() + ")");
        System.out.println("toString (" + dryWood.toString() + ")");
    }
}
