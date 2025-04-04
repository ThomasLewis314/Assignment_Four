import java.util.Scanner;

class Main 
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a string here : ");
        String input = scnr.nextLine();
        char[] inputArray = input.toCharArray();
        for (int i = inputArray.length - 1; i >= 0; --i)
        {
            System.out.print(inputArray[i]);
        }
        System.out.print("\n");
    } bn
}