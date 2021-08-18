import java.util.Scanner;

public class variable {
    
    public static void main(String[] args) {
        
    //Constants 

    final double TAX_RATE = 0.20;
    final double STANDARD_DEDUCTION = 10000.0;
    final double DEPENDENT_DEDUCTION = 2000.0;

    Scanner reader = new Scanner(System.in);

    double grossIncome;
    int numDependents;
    double taxableIncome;
    double incomeTax;

    // Request the inputs
    System.out.print("Enter the gross income: ");
    grossIncome = reader.nextDouble();
    System.out.print("Enter the number of dependents: ");
    numDependents = reader.nextInt();
        
    }
}
