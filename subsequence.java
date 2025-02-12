import java.util.Scanner;
class subsequence
{
    public static void main(String args[])
    {
        Scanner ss = new Scanner(System.in);
        String s = new String();
        String t = new String();
        boolean ans = false;

        System.out.println("Enter the substring");
        s = ss.nextLine();

        System.out.println("Enter the string");
        t = ss.nextLine();

        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length())
        {
            if(s.charAt(i) == t.charAt(j))
            {
                i++;
            }
            j++;
        }

        if(i == s.length())
        {
            ans = true;
        }

        System.out.println("The string\s"+s+"subsequnce\s"+ans);
    }
}