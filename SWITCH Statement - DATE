package java;
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a month number (1-12): ");
        int month = s.nextInt();

        System.out.println("Enter a date: ");
        int date = s.nextInt();
         
        System.out.println("Enter a year: ");
        int year = s.nextInt();
        
        String monthName = " ";
        switch(month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May"; 
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;  
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
              
        }
        if (monthName == " ") {
        	System.out.print("Month is invalid");
        } else if (date > 31 || date <= 0) {
            System.out.println("Invalid date");           
        } else {
        	System.out.println(monthName + " " + date + ", " + year);    
        }         
    }
}
