import java.util.Scanner; 

public class BirthdaySwitch {
  public static void main(String[] args) {
    //declare variables
    int month;
    int day;
    int year;
      
    // Create a Scanner
    
    Scanner input = new Scanner(System.in);
      
    //Step 1:  Ask the user to enter their birthday month as a number
    
    System.out.println("Please enter the month you were born in as a NUMBER: ");
    
    //Step 2: Read answer from the user
    
    month = input.nextInt();
    
    //Step 3: Ask the user to enter the day you were born

    System.out.println("Please enter the day you were born: ");
    
    //Step 4: Read the answer from the user
    
    day = input.nextInt();
    
    //Step 5: Ask the user to enter the year they were born
    
    System.out.println("Please enter the year you were born: ");
    
    //Step 6: Read the answer from the user
    
    year = input.nextInt();
    
    //Step 7: Display 'Thank You'
    
    System.out.println("Thank you!");
    System.out.println("You have the following birthday: ");
    
    //Step 8: Calculate their birthday month
    
    switch (month) {
      case 1: System.out.print("January "); break;
      case 2: System.out.print("February "); break;
      case 3: System.out.print("March "); break;
      case 4: System.out.print("April "); break;
      case 5: System.out.print("May "); break;
      case 6: System.out.print("June "); break;
      case 7: System.out.print("July "); break;
      case 8: System.out.print("August "); break;
      case 9: System.out.print("September "); break;
      case 10: System.out.print("October "); break;
      case 11: System.out.print("November "); break;
      case 12: System.out.print("December "); break;
    }
    
    //Step 9: Display their birth day
    
    System.out.println(day + ", " + year);
  }
}