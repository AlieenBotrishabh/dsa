import java.util.Scanner;
public class secondlargest {
    int secondlargestelement(int array[], int largest, int slargest)
    {
        for(int i = 1;i < array.length;i++)
        {
            if(array[i] > largest)
            {
                slargest = largest;
                largest = array[i];
            }
            else if(array[i] < largest && array[i] > slargest)
            {
                slargest = array[i];
            }
        }

        return slargest;
    }
    public static void main(String args[])
    {
        secondlargest ss2 = new secondlargest();
        Scanner ss = new Scanner(System.in);
        int array[] = new int[3];
        System.out.println("Enter the input");
        for(int i = 0;i < array.length;i++)
        {
            array[i] = ss.nextInt();
        }

        System.out.println("Second largest element is\s" + ss2.secondlargestelement(array, array[0], -1));
    }
}
