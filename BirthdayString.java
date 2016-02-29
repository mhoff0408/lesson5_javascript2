import java.util.Scanner; 

public class BirthdayString {
  public static void main(String[] args) {
    //declare variables
    
    String month = "";
    int day;
    int year;
      
    // Create a Scanner
    
    Scanner input = new Scanner(System.in);
      
    //Step 1:  Ask the user to enter their birthday month as a string
    
    System.out.println("Please enter the month you were born in as a STRING (Example: January, June, April, etc.): ");
    
    //Step 2: Read answer from the user
    
    month = input.nextLine();
    
    //Step 3: Ask the user to enter the day you were born

    System.out.println("Please enter the day you were born: ");
    
    //Step 4: Read the answer from the user
    
    day = input.nextInt();
    
    //Step 5: Ask the user to enter the year they were born
    
    System.out.println("Please enter the 4-digit year you were born: ");
    
    //Step 6: Read the answer from the user
    
    year = input.nextInt();
    
    //Step 7: Display 'Thank You'
    
    System.out.println("Thank you!");
    System.out.println("You have the following birthday: ");
    
    //Step 8: Calculate their birthday month
    
    switch (month) {
      case "January": System.out.print("1/"); break;
      case "February": System.out.print("2/"); break;
      case "March": System.out.print("3/"); break;
      case "April": System.out.print("4/"); break;
      case "May": System.out.print("5/"); break;
      case "June": System.out.print("6/"); break;
      case "July": System.out.print("7/"); break;
      case "August": System.out.print("8/"); break;
      case "September": System.out.print("9/"); break;
      case "October": System.out.print("10/"); break;
      case "November": System.out.print("11/"); break;
      case "December": System.out.print("12/"); break;
    }
    
    //Step 9: Display their birth day
    
    System.out.println(day + "/" + year);
  }
}