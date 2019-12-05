class printNumbers extends Thread
{
    public void run()
    {
        if (this.getName().equals("Ascending Order"))
        {
            for(int i = 1; i <= 10; i++)
            {
                System.out.println(this.getName() + ": " + i);
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
        else
        {
            for(int i = 10; i >= 1; i--)
            {
                System.out.println(this.getName() + ": " + i);
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
}

public class LightSwitching 
{
    public static void main(String[] args) 
    {
        printNumbers t1 = new printNumbers();
        printNumbers t2 = new printNumbers();
        t1.setName("Ascending Order");
        t2.setName("Descending Order");
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
