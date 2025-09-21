import java.util.Scanner;

class findElem {
    public static void main(String[] args) {
        System.out.println("Naisha Tyagi 24csu315");
 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

//arrays in java are 0 indexed, first elemtn is at 0 and the last elemtn os always i-1

        for (int i = 0; i <n; i++) {
            if (arr[i] == target) {
                System.out.println(target + " found at position " + (i+1));
                return;
            }
        }

        System.out.println(target + " not found.");
    }
}