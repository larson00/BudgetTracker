import java.util.Scanner;

public class FinancialInfo {
  
  //fields
	private String[] expenseNames = { "Rent", "Phone", "Insurance", 
			"Car", "Credit", "Loans", "Cable", 
			"Misc Spending", "Electric"};
	private double income;
	private double[] expenses;
	
	//methods
public void getIncome(Scanner keyboard) {
    
    double incomeMonth;
    double incomeWeek;
    double incomeOther;
    double incomeTotal;

    System.out.println("What is your total monthly take home pay, after"
        + " taxes?");
    incomeMonth = keyboard.nextDouble();

    System.out.println("List your total in additional income you receive in a"
        + " month.");
    incomeOther = keyboard.nextDouble();

    System.out.println("Thank you.");

    /*
     * Calculation to add up paychecks + additional income and divide by pay
     * periods to make a weekly income
     */
    incomeTotal = incomeMonth + incomeOther;
    incomeWeek = incomeTotal / 4;

    System.out.println("Your total weekly take home pay is $" + (incomeWeek));

    income = incomeTotal;
  }//End getIncome
	
	
	public  String getExpenseName(int a) {
		return expenseNames[a];
	}
	
	public void getExpenses(Scanner keyboard) {

	  expenses = new double[9];
	  
    System.out.println("How much do you pay a month in rent?");
    expenses[0] = keyboard.nextDouble();

    System.out.println("How much do you pay a month for electricity?");
    expenses[1] = keyboard.nextDouble();

    System.out.println("How much do you pay a month for your phone bill?");
    expenses[2] = keyboard.nextDouble();

    System.out.println("How much do you pay a month for your car and health "
        + "insurance, combined?");
    expenses[3] = keyboard.nextDouble();

    System.out.println("How much do you pay a month for cable?");
    expenses[4] = keyboard.nextDouble();

    System.out.println("Do you owe on your car? How much a month?");
    expenses[5] = keyboard.nextDouble();

    System.out.println("Do you owe student loans? Enter your monthly payment "
        + "now.");
    expenses[6] = keyboard.nextDouble();

    System.out.println("If you have any debt, enter your monthly payment now.");
    expenses[7] = keyboard.nextDouble();

    System.out.println("Enter an estimate on any extra spending you do in a"
        + " month, such as groceries and gas.");
    expenses[8] = keyboard.nextDouble();

    double expenseSum = 0;
    // Loop for array sum
    for (int counter = 0; counter < expenses.length; counter++)
      expenseSum += expenses[counter];

    System.out.println("Alright, your monthly expenses are ready...");
    System.out.println("You are currently paying $" + expenseSum + " in bills"
        + " a month.");

  }//getExpense
	
	public double getMaxValue() {
    double maxValue = expenses[0];
    for (int i = 1; i < expenses.length; i++) {
      if (expenses[i] > maxValue) {
        maxValue = expenses[i];
      }
    }
    return maxValue;
  }//End getMaxValue

  public double getMinValue() {
    double minValue = Double.MIN_VALUE;
    for (int i = 0; i < expenses.length; i++) {
      if (expenses[i] < minValue && expenses[i] != 0) {
        minValue = expenses[i];
      }
    }
    return minValue;
  }//End getMinValue

 public void displayBudget() {  
//getMaxValue(expenses);
  System.out.println("Your most expensive bill is $" + getMaxValue());
  System.out.println("Your least expensive bill is $" + getMinValue());
  double totalExpenses = 0;
  double gross = 0;
  double weeklyPayFinal = 0;
  String spending;
  // Add up Array Values
  for (int counter = 0; counter < expenses.length; counter++)
    totalExpenses += expenses[counter];

  /*
   * List. Names come from the array in class ExpenseFun and the numerical value
   * comes form expenses[] in the getExpense() method
   */
  System.out.println("\tHere is a list of your bills: \t");
  for (int i = 0; i < expenses.length; i++) {
    System.out.println("\t$" + expenses[i] + "\t" + getExpenseName(i));
  }

  gross = income - totalExpenses;
  System.out.println("This means that after all of your bills are paid, you "
      + "have $" + gross + " left over.");

  if (gross >= 800) {
    spending = "Great! Keep it up";
    System.out.println(spending);
  } else if (gross >= 600) {
    spending = "Thats really good!";
    System.out.println(spending);
  } else if (gross >= 400) {
    spending = "Not bad, consider limiting your spending.";
    System.out.println(spending);
  } else if (gross >= 200) {
    spending = "You are spending too much and need to cut expenses.";
    System.out.println(spending);
  } else if (gross <= 199) {
    spending = "YOUR SPENDING IS OUT OF CONTROL!!!";
    System.out.println(spending);
  }

  weeklyPayFinal = gross / 4;
  System.out.println("That means you should limit spending below $" + 
      (weeklyPayFinal) + " per week!");   
 }
}

