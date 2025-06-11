
import java.util.Scanner;
public class Check
{

    public static void main(String [] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        String text= sc.nextLine();


        System.out.println("Please enter the text you are looking for: ");
        String look= sc.nextLine();


        System.out.println(((text.contains(look))?"Yes it does contain this text":"No; it does not contain it"));


        sc.close();

    }

}
