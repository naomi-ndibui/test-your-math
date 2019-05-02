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
           
       }
}