import java.util.Scanner;
class A
{
    int maxnum(int a[], int max)
    {
        for(int i = 0;i < a.length;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        A ss2 = new A();
        Scanner ss = new Scanner(System.in);
        int a[] = new int[3];
        System.out.println("Enter the input");
        for(int i = 0;i < a.length;i++)
        {
            a[i] = ss.nextInt();
        }
        int max = 0;
        System.out.println("Maximun number is\s" + ss2.maxnum(a, max));
        ss.close();
    }
}