import java.util.Scanner;
//Naisha Tyagi,24csu315
public class AlternateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i += 2) {   // skipping alternate
            sum += arr[i];
        }

        System.out.println("Sum of alternate elements = " + sum);
    }
}