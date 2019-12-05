class AscendingOrder extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Ascending Order: " + i);
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}

class DescendingOrder extends Thread
{
    public void run()
    {
        for(int i = 10; i >= 1; i--)
        {
            System.out.println("Descending Order: " + i);
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class HeavySwitching 
{
    public static void main(String[] args) throws InterruptedException
    {
        AscendingOrder t1 = new AscendingOrder();
        DescendingOrder t2 = new DescendingOrder();
        t1.start();
        t2.start();
        try
        {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
