package twosumof_array_and_number;

import java.util.Scanner;

class TwoSum {

    public static boolean checkingPair(int arr[], int size, int target)
    {
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++)
            {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair with a given sum " + target +
                            " is (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        checkingPair(arr, size, target);
        return false;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of values in Array");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target=sc.nextInt();

        int size = arr.length;

        if (checkingPair(arr, size, target)) {
            System.out.println("Valid pair exists");
        } else {
            System.out.println("No valid pair exists for " + target);
        }
    }
}
