import java.util.Scanner;
 public class add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,res;
        a=sc.nextInt();
        b=sc.nextInt();
        res=a+b;
        System.out.println(res);
        sc.close();
    }
}