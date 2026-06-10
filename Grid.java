import java.util.*;

public class Grid {
    public Tile[][] map;
    private int rows;
    private int cols;

    public Grid(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.map = new Tile[rows][cols];

        setupGrid();
    }

    //fill the 2D array with wood tiles and put a fire in the middle
    private void setupGrid(){
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                double randomChoice = Math.random();
                if (randomChoice < 0.50) {
                    map[r][c] = new Wood();
                } else if (randomChoice < 0.98) {
                    map[r][c] = new DryWood();
                } else {
                    map[r][c] = new Water();
                }
            }
        }
        //create a fire in the middle
        map[rows / 2][cols / 2] = new Fire();
    }

    //display the grid
    public void display(){
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                System.out.print(map[r][c].toString() + " ");
            }
            System.out.println();
        }
    }

    //update the grid by one tick
    public void update(){
        Tile[][] next = new Tile[rows][cols];
        Random rand = new Random();
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                next[r][c] = map[r][c];

                if (map[r][c].isBurnable()){
                    if (hasFireAround(r, c)){
                        if (rand.nextInt(100) < map[r][c].getBurnChance()){
                            next[r][c] = new Fire();
                        }
                        else {
                            next[r][c] = new SafeWood();
                        }
                    }
                }

                if (map[r][c] instanceof Fire) {
                    Fire fire = (Fire) map[r][c];
                    fire.tick();
                    if (fire.isExtinguished()) {
                        next[r][c] = new Ash();
                    }
                }
            }
        }
        map = next; //update new map
    }

    //check the 4 tiles UP, DOWN, LEFT, RIGHT of a tile to see if there is a Fire
    public boolean hasFireAround(int rows, int cols){
        if (rows + 1 < this.rows && map[rows + 1][cols] instanceof Fire){ //check if there is fire BELOW the current tile
            return true;
        }
        if (rows - 1 >= 0 && map[rows - 1][cols] instanceof Fire){ //check if there is fire ABOVE the current tile
            return true;
        }
        if (cols - 1 >= 0 && map[rows][cols - 1] instanceof  Fire){ //check if there is fire on the LEFT SIDE the current tile
            return true;
        }
        if (cols + 1 < this.cols && map[rows][cols + 1] instanceof Fire){ //check if there is fire on the RIGHT SIDE the current tile
            return true;
        }
        return false;
    }

    public Tile getTile(int r, int c){
        return map[r][c];
    }

    public int getRows(){
        return rows;
    }

    public int getCols(){
        return cols;
    }
}
