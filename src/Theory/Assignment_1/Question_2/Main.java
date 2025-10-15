package Theory.Assignment_1.Question_2;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] array_1 = { 10 , 31 , 81 , 5 , 23 , 59 };
        int[] array_2 = new int[10];

        int length = array_1.length - 1;

        for ( int element : array_1)
        {
            array_2[length] = element;
            length--;
        }

        System.out.println("Original Array : " + Arrays.toString(array_1));
        System.out.println("Reversed Array : " + Arrays.toString(array_2));
    }
}
