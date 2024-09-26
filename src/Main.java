import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String partyAffil = "";
        Scanner in = new Scanner(System.in);


        System.out.print("Enter your party affiliation [D, R, I]: ");
        partyAffil = in.nextLine();



        if(partyAffil.equalsIgnoreCase("R"))
        {
            System.out.println("you get a republican elephant");

        }else if(partyAffil.equalsIgnoreCase("D"))
        {
            System.out.println("you get a democratic donkey");
        }
        else if(partyAffil.equalsIgnoreCase("I"))
        {
            System.out.println("you get an independent man");
        }
        else
        System.out.println("I don't know what party you belong to");
        System.out.println("please input either a [D, R, or I]: ");
    }
}