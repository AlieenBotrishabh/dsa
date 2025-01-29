import java.util.HashSet;
import java.util.Set;

class union
{
    public static void main(String args[])
    {
        int arr1[] = {1, 1, 2, 3, 4, 5};
        int m = arr1.length;

        int arr2[] = {2, 3, 4, 4, 5, 6};
        int n = arr2.length;

        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0;i < n;i++)
        {
            if(arr1[i] < arr2[i])
            {
                set.add(arr1[i]);
            }
            else
            {
                set.add(arr2[i]);
            }
        }

        System.out.println(set);
    }
}