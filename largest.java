import java.util.Scanner;

class largest
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        //Find the largest of three numbers
        int max=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        System.out.println("Max: "+max);


    }
}