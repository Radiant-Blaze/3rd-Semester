package Theory.Assignment_1.Question_1;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] array_1 = { 10 , 31 , 81 , 5 , 23 , 59 };
        int[] array_2 = new int[10];        // Java can't declare arrays like C hence we need this syntax

        for (int i = 0; i < array_1.length ; i++ )
        {
            array_2[i] = array_1[i];
        }

        System.out.println("Original Array : " + Arrays.toString(array_1));
        System.out.println("Copied   Array : " + Arrays.toString(array_2));
    }
}
