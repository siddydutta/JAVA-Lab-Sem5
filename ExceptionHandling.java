import java.util.InputMismatchException;
import java.util.Scanner;
class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(String message)
    {
        super(message);
    }
}

public class ExceptionHandling 
{
    public static void main(String[] args) throws InsufficientBalanceException
    {
        double balance = 0.0, withdraw;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("Enter balance: ");
            balance = sc.nextDouble();
            System.out.print("Enter withdrawal amount: ");
            withdraw = sc.nextDouble();
            if (balance < withdraw)
                throw new InsufficientBalanceException("Not Enough Balance!");
            else
            {
                balance -= withdraw;
            }
        }
        catch(InputMismatchException e1)
        {
            System.out.println("Please enter a number!");
        }
        /*catch(InsufficientBalanceException e2)
        {
            System.out.println(e2.getMessage());
        }*/
        finally
        {
            System.out.println("Remaining Balance: " + balance);
            sc.close();
        }
    }
}
