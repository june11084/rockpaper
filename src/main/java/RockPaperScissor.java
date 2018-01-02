import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        System.out.println("Please enter your strikes");

        try{
            String playerOneStrike = bufferedReader.readLine();
            int computerStrike = random.nextInt(3);
            if(playerOneStrike.equalsIgnoreCase("rock") && computerStrike == 0){
                System.out.println("draw");
            }else if(playerOneStrike.equalsIgnoreCase("paper") && computerStrike == 1){
                System.out.println("draw");
            }else if(playerOneStrike.equalsIgnoreCase("scissor") && computerStrike == 2){
                System.out.println("draw");
            }else if(playerOneStrike.equalsIgnoreCase("rock") && computerStrike == 1){
                System.out.println("Computer Wins");
            }else if(playerOneStrike.equalsIgnoreCase("paper") && computerStrike == 2){
                System.out.println("Computer Wins");
            }else if(playerOneStrike.equalsIgnoreCase("scissor") && computerStrike == 0){
                System.out.println("Computer Wins");
            }else if(playerOneStrike.equalsIgnoreCase("rock") && computerStrike == 2){
                System.out.println("You Win");
            }else if(playerOneStrike.equalsIgnoreCase("paper") && computerStrike == 0){
                System.out.println("You Win");
            }else if(playerOneStrike.equalsIgnoreCase("scissor") && computerStrike == 1){
                System.out.println("You Win");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
