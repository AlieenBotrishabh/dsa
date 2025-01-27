class rotatebydposition
{
    public static void main(String args[])
    {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int n = array.length;

        int d = 3;

        int temp[] = new int[d];

        for(int i = 0;i < d;i++)
        {
            temp[i] = array[i];
        }

        for(int i = d;i < n;i++)
        {
            array[i - d] = array[i];
        }

        for(int i = n - d;i < n;i++)
        {
            array[i] = temp[i - (n - d)];
        }

        for(int i = 0;i < n;i++)
        {
            System.out.println(array[i]);
        }

    }
}