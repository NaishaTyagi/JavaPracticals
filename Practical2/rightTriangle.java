import java.util.Scanner;
class rightTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
System.out.println("Naisha Tyagi, 24csu315");
        int n = 5;
        for (int i = 1; i <=5; i++) {
            // spaces 
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}