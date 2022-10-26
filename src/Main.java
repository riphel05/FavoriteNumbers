import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int faveInt = 0;
        double favDouble = 0.0;

        Scanner in = new Scanner(System.in);

        faveInt = SafeInput.getInt(in, "What is your fave int?: ");
        favDouble = SafeInput.getDouble(in, "What is your fave double?: ");
    }
}