import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Password");
        String Password = sc.nextLine();

        String txt =(Password);
     //   char u =txt.charAt(0);
        int passLennghth = txt.length();

         if( passLennghth <= 8) {System.out.println("Pass must be more then 8");

         } else if (passLennghth >= 20 ){System.out.println("Pass Lennghth must be less then 20");

         }else{System.out.println("Password accepted");
         }

        }
    }
