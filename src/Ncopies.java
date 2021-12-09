import java.util.Scanner;

public class Ncopies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the s1");
        String s1=sc.nextLine();

        String s2="";

        if(s1.length()>1)
        {
            for(int i=1;i<=s1.length();i++)
            {
                s2=s2.concat(s1.substring(1,3));
            }
        }
        else
        {
            s2=s2.concat(s1);
        }


        System.out.println(s2);
    }
}
