import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //variables
        int roll1;
        int roll2;
        int sum;
        int point = 0;
        boolean done = false;
        boolean meetPoint = false;
        boolean done2 = false;
        String end;
        while (!done2) {
            while (!done) {
                roll1 = (int)(Math.random() * 6) + 1;
                roll2 = (int)(Math.random() * 6) + 1;
                sum = roll1 + roll2;
                System.out.printf("\n%-7s %-3d", "Roll 1:", roll1);
                System.out.printf("\n%-7s %-3d", "Roll 1:", roll2);
                System.out.printf("\n%-7s %-3d", "Sum:", sum);
                System.out.println("");
                if (meetPoint) {
                    if (sum == point) {
                        done = true;
                        System.out.println("\n You rolled a " + sum + " you win!!");
                    } else if (sum == 7) {
                        done = true;
                        System.out.println("\n Sorry you lose!");
                    }
                }
                else {
                    if (sum == 7 || sum == 11) {
                        System.out.println("\nYou have won! crapping galore!");
                        done = true;
                    } else if (sum == 2 || sum == 3 || sum == 12) {
                        System.out.println("\nYou rolled a " + sum + " you started crapping out like crazy!!!");
                        done = true;
                    } else {
                        point = sum;
                        meetPoint = true;
                    }
                }
            }
            System.out.println("Please enter N to STOP, enter Y to continue.");
            end = scan.nextLine();
            end = end.toUpperCase();
            if (end.equalsIgnoreCase("N")) {
                done2 = true;
            }
            else {
                done = false;
                meetPoint = false;
            }
        }
    }
}