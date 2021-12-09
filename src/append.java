import java.util.Scanner;

public class append {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the s1");
        String s1= sc.nextLine();

        System.out.println("enter the s2");
        String s2= sc.nextLine();
        String s3;


        s1=s1.toLowerCase();
        s2=s2.toLowerCase();


        if(s1.charAt(s1.length()-1)==s2.charAt(0))
        {
            System.out.println(s3=s1.concat(s2.substring(1,s2.length())));
        }

        else
        {
            System.out.println(s3=s1.concat(s2));
        }
    }
}
