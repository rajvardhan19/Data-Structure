import java.util.Arrays;
import java.util.Scanner;
public class LinearSearchAlgorithm {
    //Linear Search Algorithm
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            System.out.print("Enter the element at position " + i +": ");
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter the element to be searched: ");
        int target = sc.nextInt();
        System.out.println("Do you want to search for target in specific range? : ");
        String ans = sc.next();
        if(ans.equalsIgnoreCase("no")){
            System.out.println("The element is at index: "+LinearSearch(arr,target));
        } else if (ans.equalsIgnoreCase("yes")) {
            System.out.println("The element is at index: "+LinearSearchIndex(arr,target));
        }else {
            System.out.println("Invalid input");
        }


    }
    static int LinearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int LinearSearchIndex(int[] arr, int target){
        System.out.print("Enter the starting index: ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.print("Enter the ending index: ");
        int last = sc.nextInt();
        for (int i = start; i <= last; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}
