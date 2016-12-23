import java.util.Scanner;

/**
 * Created by udaka on 9/28/16.
 */
public class TestInput {

    public static void main(String[] args) {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            String s = in.nextLine( );

            if(s.equals("e")|s.equals("pl exit"))
            {
                break;
            }
            else
            {
                //TODO : Add Thread here. use runnable method. First run a program with a single thread.
            }
        }

    }
}
