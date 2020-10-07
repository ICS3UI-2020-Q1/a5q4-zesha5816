import java.util.Scanner;
/**
 * a program that will ask the user how much money they wish to invest, what their 	interest rate is (as a full percentage), and how many years they want to invest
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create the Scanner
		Scanner input = new Scanner(System.in);
		//prompt user for starting balance
		  System.out.println("Please enter a starting balance");
			double startingBalance = input.nextDouble();
			//prompt user for invest rate
			System.out.println("Please enter your interest rate");
			double interestRate  = input.nextInt();
			//prompt user for investment years
			System.out.println("Please enter the number of years you will invest for");
			int investInt = input.nextInt();
			//initialize count 
			int count = 0;
			//turn invest rate in 0.01 value
			interestRate= interestRate * 0.01;
			//loops the equation the amount of years for investment
		 for (int i = 0; i < investInt; i++){
				startingBalance = startingBalance + (interestRate*startingBalance);
		 }
		 //outputs the balance to user
		System.out.println("Your final balance would be $" + startingBalance);
			
  }
}
