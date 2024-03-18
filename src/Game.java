import java.util.Scanner;

public class Game {

    private Player currentPlayer;
    Player player1 = new Player("X");
    Player player2 = new Player("O");


    public void startGame(){
        System.out.println("""
                 Player 1 - X
                 Player 2 - O
                 
                 Input x and y coordinates of the tile you want to place your symbol in
                """);
        currentPlayer = player1;

    }

    Scanner sc = new Scanner(System.in);
    public void placeSymbol(int x, int y){
        boolean passed = false;
        while(!passed) {
            System.out.println("x: ");
            x = sc.nextInt();
            sc.reset();
            System.out.println("y: ");
            y = sc.nextInt();
            if(x > 0 && x <= 3 && y > 0 && y <= 3){
                passed = true;
            }else{
                System.out.println("Out of bounds or tile is captured");
            }

        }

    }


}
