import java.util.Scanner;
class Paindrome
{
    public static void main(String args[])
    {
        Scanner ss = new Scanner(System.in);

        String s = new String();

        System.out.println("Enter the string");
        s = ss.nextLine();

        String l = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        int i = 0;
        int j = l.length() - 1;
        boolean ans = false;

        while(i < j)
        {
            if(l.charAt(i) != l.charAt(j))
            {
                ans = false;
            }
            else
            {
                ans = true;
            }
            
            i++;
            j--;
        }

        System.out.println("String\s"+s+"is Palindrome\s"+ans);
    }
}