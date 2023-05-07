import java.util.*;

public class Project1 {
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> computerPositions = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printBoard(gameBoard);
        try {
            while (true) {
                System.out.println("Where would like to play ? (1-9) ");
                int playerPos = scan.nextInt();
                inputPos(playerPos); // method throws
                while (playerPositions.contains(playerPos) || computerPositions.contains(playerPositions)) {
                    System.out.println("position taken!");
                    playerPos = scan.nextInt();
                }
                chosePosAndUser(gameBoard, playerPos, "player");
                String result = checkWinner();
                if (result.length() > 0) {
                    System.out.println(result);
                    break;
                }
                Random rand = new Random();
                int posForComputer = rand.nextInt(9) + 1;
                while (playerPositions.contains(posForComputer) || computerPositions.contains(posForComputer)) {
                    posForComputer = rand.nextInt(9) + 1;
                }
                chosePosAndUser(gameBoard, posForComputer, "computer");
                printBoard(gameBoard);
                result = checkWinner();
                if (result.length() > 0) {
                    System.out.println(result);
                    break;
                }

            }

        }catch (InputMismatchException e1){
            System.out.println("must be input number !!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("try again");
        }




    }

    public static void inputPos(int pos) throws Exception {//throw - throws
        if (pos > 9 || pos < 1) {
            throw new Exception("must be number between 1-9");
        }
    }


    public static void printBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

    public static void chosePosAndUser(char[][] gameBoard, int pos, String User) {
        char symbol = ' ';
        if (User.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else if (User.equals("computer")) {
            symbol = 'O';
            computerPositions.add(pos);
        }

        switch (pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static String checkWinner() {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightRow = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightRow);
        winning.add(cross1);
        winning.add(cross2);


        for (List l : winning) {
            if (playerPositions.containsAll(l)) {
                return "you win";
            } else if (computerPositions.containsAll(l)) {
                return "Computer win";
            } else if (playerPositions.size() + computerPositions.size() == 9) {
                return "CAT!";
            }

        }

        return "";
    }
}