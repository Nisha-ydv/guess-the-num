import java.util.Scanner;
import java.util.Random;
class game{
    public int noOfGuesses;
    public int inputNumber;
    public int randonNumber;
    public void setnoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
    public int getnoOfGusses(){
        return noOfGuesses;
    }
    public void game(){
        Random rand = new Random();
        this.randonNumber=rand.nextInt(100);
        // System.out.println(randonNumber);
    }
    public void takeUserInput(){
        System.out.println("guess the number");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
        // System.out.println(inputNumber);


    }
    public  boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==randonNumber){
            System.out.println("guess number is correct  "+inputNumber+" in no. of attempts "+noOfGuesses);
            return true;
        }
        else if(inputNumber>randonNumber){
            System.out.println("ur number is too high");

        }
        else if(inputNumber<randonNumber){
            System.out.println("ur number is too low");

        }

        return false;


    }

}
public class guess_the_number{
    public static void main(String[] args) {
        game g=new game();
        boolean b=false;
        g.game();
        while (!b) {
            g.takeUserInput();
            // g.game();
            b= g.isCorrectNumber();
            System.out.println(b);

        }
    }
}