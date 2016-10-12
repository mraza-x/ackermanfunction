import java.util.*;

/**
Mohammed Raza
CSC 162 - Lab7 # 3 (main)
*/

public class AckermanFunction
{
    public static void main (String args[])
    {

		int m;
		int n;

		Scanner console = new Scanner(System.in);

        System.out.print("Enter value m:");
        m = console.nextInt();

        System.out.print("Enter value n:");
        n = console.nextInt();

        System.out.println("ackerman(" + m + ", " + n + ") = " + ackerman(m,n));


	}


        public static int ackerman(int m, int n)
        {
			if (m == 0)
				return n + 1;

			if (n == 0)
				return ackerman(m-1,1);

			else
				return ackerman(m-1, ackerman(m, n-1));
		}



}