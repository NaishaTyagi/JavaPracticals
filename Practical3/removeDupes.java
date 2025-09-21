import java.util.Scanner;

public class removeDupes{
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

        // Remove duplicates
        int temp[] = new int[n];
        int newLength = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // check if arr[i] already exists in temp[]
            for (int j = 0; j < newLength; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // if not duplicate, add to temp[]
            if (!isDuplicate) {
                temp[newLength] = arr[i];
                newLength++;
            }
        }

        // Print result
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}