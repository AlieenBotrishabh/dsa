import java.util.HashSet;
import java.util.Set;

class duplicates
{
    Set<Integer> setmethod(int array[], int n)
    {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0;i <= n;i++)
        {
            set.add(array[i]);
        }
        return set;
    }
    int finduplicates(int array[], int n)
    {
        int i = 0;
        for(int j = 1;j <= n;j++)
        {
            if(array[i] != array[j])
            {
                array[i + 1] = array[j];
                i++;
            }
        }

        return i + 1;
    }
    public static void main(String args[])
    {
        duplicates ss = new duplicates();
        int array[] = {1, 1, 2, 2, 3, 3};




        int n = array.length - 1;

        System.out.println(ss.setmethod(array, n));



        System.out.println(ss.finduplicates(array, n));
    }
}