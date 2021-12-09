import java.util.Scanner;

public class BiggerString {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String a=sc.nextLine();
        System.out.println("enter the string");
        String b=sc.nextLine();
        String str[] = new String[a.length()+b.length()];
        int j =0;
        if(a.length()>=b.length()){
            for (int i = 0; i < b.length(); i++) {
                str[j] = String.valueOf(a.charAt(i));
                j=j+1;
                str[j] = String.valueOf(b.charAt(i));
                j = j+1;
            }
            for (int i =b.length(); i < a.length(); i++) {
                str[j] = String.valueOf(a.charAt(i));
            }
        }
        else{

            for (int i = 0; i < a.length(); i++) {
                str[j] = String.valueOf(a.charAt(i));
                j=j+1;
                str[j] = String.valueOf(b.charAt(i));
            }
            for (int i = a.length(); i < b.length(); i++) {
                str[j] = String.valueOf(b.charAt(i));
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }


    }
}
