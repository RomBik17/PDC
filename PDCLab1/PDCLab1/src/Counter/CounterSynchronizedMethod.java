package Counter;

public class CounterSynchronizedMethod extends Counter{
    @Override
    public synchronized void increment()
    {
        count++;
    }

    @Override
    public synchronized void decrement()
    {
        count--;
    }
}
