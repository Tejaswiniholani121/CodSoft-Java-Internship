import java.util.Scanner;

class GuessingGame {
    int random;

    public GuessingGame(){
    random = (int) Math.ceil(Math.random()*100);
    }

    int guess(int guessNumber){
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game");
        GuessingGame game = new GuessingGame();
        int guess;
        int result;
       do {
           System.out.println("Guess the number between 1 to 100 ");
           guess = s.nextInt();
           result = game.guess(guess);
           if (result == 0) {
               System.out.println("You have guessed correct number");
           } else if (result < 0) {
               System.out.println("Please guess higher number ");
           } else {
               System.out.println("Please guess lower number");
           }
       }while (result!=0);

    }


}