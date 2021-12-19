import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,p,q;
        int found = 0;
        n = sc.nextInt();
        boolean[] bool = new boolean[n+1];
        bool[0] = true;
        p = sc.nextInt();
        for(int i=0;i<p;i++)
        {
            int temp = sc.nextInt();
            bool[temp] = true;
        }
        q = sc.nextInt();
        for(int j=0;j<q;j++)
        {
            int temp = sc.nextInt();
            bool[temp] = true;
        }
        for(int k = 0;k<n;k++)
        {
            if(bool[k] != true){System.out.println("Oh, my keyboard!");found=0;break;}
            else{found = 1;}
        }
        if(found == 1){System.out.println("I become the guy.");}
    }  
}
