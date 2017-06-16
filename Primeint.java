import java.util.*;
public class Primeint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int j=0,i=0;
        String pno="";
        for(i=a;i<=b;i++)
        {
             int c=0;
            for(j=i;j>=a;j--)
            {
               if(i%j==0)
               {
                c=c+1;
               }
            }
            if(c==2)
                {
                    pno=pno+i+" ";
                }
            }
            System.out.println(pno);
    }
}






