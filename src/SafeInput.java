import java.util.Scanner;

public class SafeInput {
    /**
     * Get an int value with no constraints
     * @param pipe - scanner instance to read the data System.in most cases
     * @param prompt - input prompt msg should not include range info
     * @return - unconstrained int value
     */
    public static int getInt(Scanner pipe, String prompt)

    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
                {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
                }
            }while(!done);
        return retVal;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0.0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
                {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
                }
            else
                {
                trash = pipe.nextLine();
                System.out.println("You must enter double: " + trash);
                }
            }while(!done);
        return retVal;
    }





}


