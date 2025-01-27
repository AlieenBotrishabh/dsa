class rotatedpositionoptimize
{
    int[] reverese(int array[], int start, int end)
    {
        while(start <= end)
        {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        return array;
    }

    public static void main(String args[])
    {
        rotatedpositionoptimize ss = new rotatedpositionoptimize();

        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int n = array.length;

        int k = 3;

        ss.reverese(array, 0, n - k - 1);
        ss.reverese(array, n - k, n - 1);
        ss.reverese(array, 0, n - 1);

        for(int i = 0;i < n;i++)
        {
            System.out.print(array[i]);
        }
    }
}