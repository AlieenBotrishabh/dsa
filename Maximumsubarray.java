class Maximumsubarray
{
    int sum(int start, int end, int array[])
    {
        int max = 0;
        int sum = 0;
        for(int i = start;i < end;i++)
        {
            sum = sum + array[i];
        }

        if(max < sum)
        {
            max = sum;
        }

        return sum;
    }
    int[] divide(int start, int end, int array[])
    {
        int mid = start - (end + start) / 2;

        divide(0, mid - 1, array);
        divide(mid, end, array);
        
        return array;
    }
    public static void main(String args[])
    {
        Maximumsubarray ss = new Maximumsubarray();
        int array[] = {2, 3, -8, 7, -1, 2, 3};

        int n = array.length;
        int start = 0;
        int end = n;
        ss.divide(start, end, array);
        int maxsum = ss.sum(start, end, array);

        System.out.println(maxsum);

    }
}