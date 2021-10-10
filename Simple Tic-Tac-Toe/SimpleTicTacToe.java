import java.util.Arrays;
import java.util.Scanner;

public class SimpleTicTacToe {
    public static void main(String[] args) {
        // 1: Create an empty grid array
        String[][] grid = new String[3][3];
        for (String[] strings : grid) {
            Arrays.fill(strings, " ");
        }

        // 2: print the empty grid array
        printTheGrid(grid);

        // 3: play the game
        gameOutcomes(grid);

    }

    // Analyze user input: input should be integer
    public static int[] tryAndCatch() {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        while (true) {
            try {
                String i = scan.nextLine();
                x = Integer.parseInt(String.valueOf(i.charAt(0)));
                y = Integer.parseInt(String.valueOf(i.charAt(2)));
                break;
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
            }
            System.out.print("Enter the coordinates: ");
        }
        return new int[]{x, y};
    }

    public static void play(String[][] grid, String s) {
        // 3: Prompt the user to make a move.
        System.out.print("Enter the coordinates: ");

        // 5: check the input
        while (true) {
            int[] arr = tryAndCatch();
            int x = arr[0];
            int y = arr[1];
            --x; --y;
            if (x > 2 || x < 0 || y > 2 || y < 0) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (grid[x][y].contains("X") || grid[x][y].contains("O")) {
                System.out.println("This cell is occupied! Choose another one!");
            } else {
                grid[x][y] = s;
                break;
            }
            System.out.print("Enter the coordinates: ");
        }

        // 6: print the grid
        printTheGrid(grid);
    }

    public static void printTheGrid(String[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (i == 0) {
                System.out.println("---------");
            }
            for (int j = 0; j < grid[i].length; j++) {
                if (j == 0) {
                    System.out.print("| " + grid[i][j] + " ");
                } else if (j == 2) {
                    System.out.print(grid[i][j] + " |");
                } else {
                    System.out.print(grid[i][j] + " ");
                }
            }
            System.out.println();
            if (i == 2) {
                System.out.println("---------");
            }
        }
    }

    public static void gameOutcomes(String[][] grid) {
        int counter = 0;
        while (counter < 9) {
            if (counter % 2 == 0) {
                play(grid, "X");
            } else {
                play(grid, "O");
            }
            counter++;

            // Game outcomes/conditions
            if (grid[0][0].equals("X") && grid[0][1].equals("X") && grid[0][2].equals("X")
                    || grid[1][0].equals("X") && grid[1][1].equals("X") && grid[1][2].equals("X")
                    || grid[2][0].equals("X") && grid[2][1].equals("X") && grid[2][2].equals("X")) { // X horizontal
                System.out.println("X wins");
                break;
            } else if (grid[0][0].equals("O") && grid[0][1].equals("O") && grid[0][2].equals("O")
                    || grid[1][0].equals("O") && grid[1][1].equals("O") && grid[1][2].equals("O")
                    || grid[2][0].equals("O") && grid[2][1].equals("O") && grid[2][2].equals("O")) { // O horizontal
                System.out.println("O wins");
                break;
            } else if (grid[0][0].equals("X") && grid[1][0].equals("X") && grid[2][0].equals("X")
                    || grid[0][1].equals("X") && grid[1][1].equals("X") && grid[2][1].equals("X")
                    || grid[0][2].equals("X") && grid[1][2].equals("X") && grid[2][2].equals("X")) { // X vertical
                System.out.println("X wins");
                break;
            } else if (grid[0][0].equals("O") && grid[1][0].equals("O") && grid[2][0].equals("O")
                    || grid[0][1].equals("O") && grid[1][1].equals("O") && grid[2][1].equals("O")
                    || grid[0][2].equals("O") && grid[1][2].equals("O") && grid[2][2].equals("O")) { // O vertical
                System.out.println("O wins");
                break;
            } else if (grid[0][0].equals("X") && grid[1][1].equals("X") && grid[2][2].equals("X")
                    || grid[0][2].equals("X") && grid[1][1].equals("X") && grid[2][0].equals("X")) { // X diagonal
                System.out.println("X wins");
                break;
            } else if (grid[0][0].equals("O") && grid[1][1].equals("O") && grid[2][2].equals("O")
                    || grid[0][2].equals("O") && grid[1][1].equals("O") && grid[2][0].equals("O")) { // O diagonal
                System.out.println("O wins");
                break;
            } else if (counter > 6) {
                StringBuilder str = new StringBuilder();
                for (String[] strings : grid) {
                    for (String string : strings) {
                        str.append(string);
                    }
                }
                String s = str.toString();
                if (!s.contains(" ")) System.out.println("Draw");
            }
        }
    }
}
