import java.util.Scanner;
class Reverseastring
{
    public static void main(String args[])
    {
        Scanner ss = new Scanner(System.in);

        String s = new String();

        System.out.println("Enter the string");
        s = ss.nextLine();

        String l[] = s.split(" +");
        StringBuilder ans = new StringBuilder();

        for(int i = l.length - 1;i >= 0;i--)
        {
            ans.append(l[i]);
            ans.append("");
        }

        System.out.print("Reversed string is\s"+ans.toString().trim());
    }
}