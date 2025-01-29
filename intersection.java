import java.util.ArrayList;

class intersection
{
    public static void main(String args[])
    {
        int a[] = {1, 2, 2, 3, 3, 4, 5, 6};
        int n1 = a.length;

        int b[] = {2, 3, 3, 5, 6, 6, 7};
        int n2 = b.length;

        ArrayList<Integer> list = new ArrayList<Integer>();

        int vis[] = new int[n2];

        vis[0] = 0;

        for(int i = 0;i < n1;i++)
        {
            for(int j = 0;j < n2;j++)
            {
                if(a[i] == b[j] && vis[j] == 0)
                {
                    list.add(a[i]);
                    vis[j] = 1;
                    break;
                }

                if(b[j] > a[i])
                {
                    break;
                }
            }
        }

        System.out.println(list);
    }
}