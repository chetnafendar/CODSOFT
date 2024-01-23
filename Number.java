package number;
import java.util.Scanner;
//I am chetna Fendar Here I am doing Number game code for Codesoft Company
class range {
    public int genrate(int max,int min)
    {
        return (int) (Math.random()*(max - min + 1) + min);
    }
}

public class Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        range rg = new range();
        int Attempts = 0;
        int win = 0;

        while (true)
        {
            System.out.println("Enter the max number");
            int max = sc.nextInt();
            System.out.println("Enter the min number");
            int min = sc.nextInt();
            sc.nextLine();

            int cnum = rg.genrate(max, min);
            int attempts = 0;

            while (true) {
                System.out.println("Guess a number between "+max+" and "+min);
                int gnum = sc.nextInt();
                attempts++;

                if (gnum > cnum)
                {
                    System.out.println("Its Greater");
                } else if (gnum < cnum)
                {
                    System.out.println("Its Lower");
                }else
                {
                    System.out.println("Correct Guess");
                    win++;
                    break;
                }
            }
            Attempts += attempts;
            System.out.println("Attempts = " + attempts);
            System.out.println("Wins = " + win);

            double winrate = (double) win / Attempts*100;
            System.out.printf("Your winrate is %.2f%%\n",winrate);

            System.out.println("Do you want to play again (yes/no)");
            String playAgain = sc.next();
            if(!playAgain.equalsIgnoreCase("yes"))
            {
                sc.close();
                System.exit(0);
            }
            sc.nextLine();
        }
    }
}
// After using current file you may get the result