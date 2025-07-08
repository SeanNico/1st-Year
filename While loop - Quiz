package java;
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
        int lives = 3;

        while (lives > 0) {
        	 System.out.println("What is my fav color?");
             System.out.print("Answer: ");
             String answers = s.nextLine();
        	
        	if (answers.equalsIgnoreCase("Light Blue")) break;
        	else {
        		System.out.println("-1 life");
        		lives--;
        	}
        }
       
        if (lives > 0) {
        	System.out.println("YOU WON!");
        }
        else {
        	System.out.println("YOU lose");
        }              
    }
}
