import java.util.Scanner;

//NAISHA TYAGI, 24CSU315

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count even and odd elements
        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                evenCount++;

            else
                oddCount++;
        }

        // Create separate arrays for even and odd numbers
        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];

        int eIndex = 0, oIndex = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                evenArray[eIndex++] = num;
            else
                oddArray[oIndex++] = num;
        }

        // Display arrays and lengths
        System.out.print("Original Array: ");
        printArray(arr);
        System.out.println("Length: " + arr.length);

        System.out.print("Even Array: ");
        printArray(evenArray);
        System.out.println("Length: " + evenArray.length);

        System.out.print("Odd Array: ");
        printArray(oddArray);
        System.out.println("Length: " + oddArray.length);

        sc.close();
    }

    // Helper method to print arrays
    private static void printArray(int[] array) {
        System.out.print("[ ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.print("]");
    }
}