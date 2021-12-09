import java.util.Scanner;

public class Lastchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s1=sc.nextLine();

        System.out.println("enter the index");
        int index=sc.nextInt();

        String s2="";

        for(int i=0;i<index;i++)
        {
            s2=s2.concat(s1.substring(index-1,s1.length()));
        }

        System.out.println(s2);
    }
}
