import java.util.Scanner;
class MajorityElement
{
    public static void main(String args[])
    {
        Scanner ss = new Scanner(System.in);

        int arr[] = new int[3];
        int n = arr.length;
        System.out.println("Enter the array");
        for(int i = 0;i < n;i++)
        {
            arr[i] = ss.nextInt();
        }

        int ans = 0;

        for(int i  = 0;i < n;i++)
        {
            int count = 0;
            for(int j = 0;j < n;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            if(count > n / 2)
            {
                ans  = arr[i];
            }
        }

        System.out.println("Majority Element is\s" + ans);
        ss.close();
    }
}