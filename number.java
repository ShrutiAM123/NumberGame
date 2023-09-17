import java.util.*;
class NumberGame{
     
    int computer;
    public NumberGame(){
        Random ra = new Random();
        computer = ra.nextInt(100);
        System.out.println("guess the no from 1 to 100");

    }
    public int computerNo(){ return computer; }
    
}
public class number{
        static int takeUserInput(){
            int user;
            System.out.println("enter: ");
            Scanner sc = new Scanner(System.in);
            user = sc.nextInt();
            return user;

        }
        static void isCorrectNumber(int i, int j){
            if(i==j){
                System.out.println("Coorect number guess");
            }
            else if(i>j){
                System.out.println("your number is bigger than computer no..");
            }
            else{
                System.out.println("your number is smaller than computer no..");
            }
        }
         public static void main(String[] args) {
            int user = 0,computer = 0,itteration = 0;
           NumberGame ng = new NumberGame();
           do{
            user = takeUserInput();
            computer = ng.computerNo();
            isCorrectNumber(user,computer);
            itteration++;
           }while(user != computer);
           System.out.println("you guess no in " + itteration + " itteration");
        }
       
    }