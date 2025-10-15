package Theory.Assignment_1.Question_3;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[]   array = { 10 , 31 , 81 , 5 , 23 , 59 };
        int     temp  = array[0];

        for ( int element : array)
        {
            if ( element > temp)
            {
                temp = element;
            }
        }

        System.out.println("Biggest number in the array -> " + Arrays.toString(array) + " is : " + temp );
    }
}
