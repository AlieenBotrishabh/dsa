import java.util.*;

class zeroesinendoptimal
{
    public static void main(String args[])
    {
        zeroesinendoptimal ss = new zeroesinendoptimal();
        int array[] = {0, 1, 2, 3, 2, 0, 0, 4, 5, 1};

        int n = array.length;
        int j = -1;
        for(int i = 0;i < n;i++)
        {
            if(array[i] == 0)
            {
                j = i;
                break;
            }

            else if(j == -1)
            {
                System.out.println(array[i]);
            }
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = j + 1;i < n;i++)
        {
            if(array[i] != 0)
            {
                result.add(array[i]);
                Collections.swap(result, array[i], array[j]);
                j++;
            }
        }

        for(int i = 0;i < n;i++)
        {
            System.out.println(array[i]);
        }
    }
}