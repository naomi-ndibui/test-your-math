import java.util.*;

public class Math {
       public static Scanner keyboard = new Scanner(System.in);
       public static void main(String [] args)
       {
           System.out.print("How many math questions do you want: ");
           int j = keyboard.nextInt();

           keyboard.nextInt();

           if (j == 0)
           {
               System.out.println("That's no fun!\n");
               System.exit(0);
           }

           if (j < 0)
               j = j * -1;

           int i = 0;
           while (i< j)
           {
              randy();
              i++;
           }

           finaloutput();
       }
       public static void randy()
       {
           Random randy1 = new Random();
           Random randy2 = new Random();
           int m = randy1.nextInt(10) + 1;
           int n = randy1.nextInt(10) + 1;
           int o = randy2.nextInt(3);

           calc(m,n,o);
       }

       public static int numright = 0;
       public static int numwrong = 0;

       public static void calc(int a, int b , int c)
       {
           double answer = 0;

           if (c == 0)
           {
               answer = a + b;
               System.out.println("What is" + a +"+" + b + ":");
           }

           if (c == 1)
           {
               answer = a-b;
               System.out.println("What is" +a + " - " + b + ": ");
           }

           if (c == 2)
           {
               answer = a * b;
               System.out.println("What is " + a + " x " + b + ": ");
           }


           double input = keyboard.nextDouble();

           if (input == answer)
           {
               System.out.println("That is correct!\n");
               numright++;
           }

           else
           {
               System.out.println("That is incorrect! The answer is " + answer + "\n");
               numwrong++;
           }
       }
}