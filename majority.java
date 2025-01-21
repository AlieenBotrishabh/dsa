public class majority
{
    public static void main(String args[])
    {
        int a = 0;
        int array[] = {3, 3, 4, 2, 4, 4, 2, 4};
        int n = array.length - 1;
        for(int i = 0;i < n;i++)
        {
            int count = 0;
            for(int j = 0;j < n;j++)
            {
                if(array[i] == array[j])
                {
                    count++;
                }

                else if(count > n / 2)
                {
                    a = array[i];
                }
                else
                {
                    a = -1;
                }
            }
        }
        System.out.println("Majority element is\s" + a);
    }
}