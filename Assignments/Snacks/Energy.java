import java.util.Scanner;

public class Energy{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the amount of water in kilograms: ");
double water = input.nextDouble();

System.out.print("Enter the initial temperature: ");
double initialTemperature = input.nextDouble();

System.out.print("Enter the final temperature: ");
double finalTemperature = input.nextDouble();

double energy = water * (finalTemperature - initialTemperature) * 4184;

System.out.println("The energy neeeded is "+ energy);
}
}