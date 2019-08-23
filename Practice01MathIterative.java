public class Practice01MathIterative implements Practice01Math
{
    public int fact(int n) throws Exception
    {
        if (n<0)
        {
        throw new Exception("Negative number!");
        }
        int factorial=1;
        for (int i=1; i<=n; i++)
        {
            factorial*=i;
        }
        return factorial;
    }

    public int fib(int n) throws Exception
    {
        if (n<0)
        {
            throw new Exception("Negative number!");
        }
        int fib =0;
        int firstFib=1;
        int secondFib=1;
        for (int i=0; i<n; i++)
        {
            fib = firstFib;
            firstFib = secondFib;
            secondFib = firstFib+fib;
        }
        return fib;
    }
}
