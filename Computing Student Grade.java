import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     
     System.out.print("Enter English Grades: ");
     float Sci = s.nextFloat();
     System.out.print("Enter Filipino Grades: ");
     float Fil = s.nextFloat();
     System.out.print("Enter Programming Grades: ");
     float Prog = s.nextFloat();
     System.out.print("Enter Op2 Grades: ");
     float Op2 = s.nextFloat();

     float average = (Sci + Fil + Prog + Op2) / 4;
     System.out.println("Average: " + average);    
     
     if (average > 100) {
        System.out.println("invalid Grade");
     }  else if (average >= 98) {
        System.out.println("With Highest Honors");
     } else if  (average >= 95) {
        System.out.println("With High Honors");
     } else if  (average >= 90) {
        System.out.println("With Honors");
     } else if  (average >= 75) {
        System.out.println("Passed");
     } else {
        System.out.println("Failed");
     }
     
    }
}