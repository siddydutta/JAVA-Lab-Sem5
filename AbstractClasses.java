import java.util.Scanner;

abstract class studentMarks
{
    public abstract double setInternals();
    public abstract double setExternals();
    public char getGrade(double marks)
    {
        if (marks >= 90.0 && marks < 100.0)
            return 'A';
        else if (marks >= 80.0 && marks < 90.0)
            return 'B';
        else if (marks >= 70.0 && marks < 80.0)
            return 'C';
        else if (marks >= 60.0 && marks < 70.0)
            return 'D';
        else
            return 'F';
    }
}

public class AbstractClasses extends studentMarks
{
    public static void main(String[] args) 
    {
        AbstractClasses obj = new AbstractClasses();
        double internalMarks = obj.setInternals();
        double externalMarks = obj.setExternals();
        double marks = internalMarks + externalMarks;
        char grade = obj.getGrade(marks);
        System.out.println("\nGrade: " + grade);
    }

    public double setInternals() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Internal Marks: ");
        return sc.nextDouble();
    }

    public double setExternals() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter External Marks: ");
        return sc.nextDouble();
    }
}
