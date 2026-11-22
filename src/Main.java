import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("1. New Game");
        System.out.println("2. Exit");
        System.out.println("Choose an option");

        int option=sc.nextInt();

        if(option==1) {
            System.out.println("New game selected.");
        }
        else if(option==2) {
            System.out.println("Exiting!");
            return;
        }
        else {
            System.out.println("Invalid option.");
        }
    }
    public char[][] map = new char[0][0];
    public int getRow = -1;
    public int getColumn = -1;
    public int getEnergy = 0;
    public int getMaxEnergy = 0;
    public int getCollectedRelics = 0;
    public int getRequiredRelics = 0;
    public int getMoves = 0;
    public String getStatus = "NOT_STARTED";

}
