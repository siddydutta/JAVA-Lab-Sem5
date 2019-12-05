class printNumbers extends Thread
{
    @Override
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(this.getName() + ": " + i);
            try 
            {
                Thread.sleep(100);
            } 
            catch (InterruptedException ex) 
            {
                System.out.println(ex.getMessage());
            }
        }
    }
}

public class ThreadLifecycle 
{
    public static void main(String[] args)
    {
        printNumbers t1 = new printNumbers();
        printNumbers t2 = new printNumbers();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
        try
        {
            Thread.sleep(100);
            System.out.println("Suspending Thread 1");
            t1.suspend();
            Thread.sleep(500);
            System.out.println("Resuming Thread 1");
            t1.resume();
            
            Thread.sleep(100);
            System.out.println("Suspending Thread 2");
            t2.suspend();
            Thread.sleep(500);
            System.out.println("Resuming Thread 2");
            t2.resume();
            
            t1.join();
            t2.join();
        } 
        catch (InterruptedException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
}
