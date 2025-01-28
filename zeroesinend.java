import java.util.ArrayList;

class zeroesinend
{
    int[] moving(int array[], int n)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0;i < n;i++)
        {
            if(array[i] != 0)
            {
                list.add(array[i]);
            }
        }

        for(int i = 0;i < list.size();i++)
        {
            array[i] = list.get(i);
        }

        int nz = list.size();

        for(int i = nz;i < n;i++)
        {
            array[i] = 0;
        }

        return array;
    }
    public static void main(String args[])
    {
        zeroesinend ss = new zeroesinend();
        int array[] = {0, 1, 2, 3, 2, 0, 0, 4, 5, 1};

        int n = array.length;

        int result[] = ss.moving(array, n);

        for(int i =0;i < n;i++)
        {
            System.out.println(result[i]);
        }
    }
}