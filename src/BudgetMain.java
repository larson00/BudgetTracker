/** 
* @author larson 
*/

import java.util.Scanner;

public class BudgetMain {

  private static Scanner keyboard;
  
  // Main
  public static void main(String[] args) {
    keyboard = new Scanner(System.in);
    // prints welcome message and program explanation
    // get users name
    String username = getName();

    // run
    // get income
    // get expenses
    // display stuff - budget info

    int choice = 0;

    System.out.print("Enter 1 if you would like to continue");
    System.out.println();
    System.out.println("Enter 2 if you would like to quit.");
    choice = keyboard.nextInt();
    System.out.println();

    switch (choice) {
      case 1:
        int continueProgram = 1;
        System.out.println("Alright, time to get started.");
        while (continueProgram == 1) {
          FinancialInfo usersFinancialInfo = new FinancialInfo();
          usersFinancialInfo.getIncome(keyboard);
          System.out.println("Alright, time to look at some expenses...");
          usersFinancialInfo.getExpenses(keyboard);
          System.out.println("Here is the budget info for " + username);
          usersFinancialInfo.displayBudget();
          System.out.println("Would you like to continue?");
          System.out.println("Enter 1 for yes, 2 for no");
          continueProgram = keyboard.nextInt();
        }
        break;
      default:
        System.out.println("You chose to exit. Goodbye!");
        break;
    }

    // break;
  }

  private static String getName() {
    System.out.println("Welcome to my budget calculator!");
    System.out
        .println("This program will serve as a way to track your spending.");
    System.out.println("Enter 0 if any bill does not apply to you.");

    System.out.println("Before we start, would you give me your name?");
    String name = keyboard.nextLine();
    System.out.println("Thanks " + name + ", now we can continue.");

    return name;
  }// end getName

}
