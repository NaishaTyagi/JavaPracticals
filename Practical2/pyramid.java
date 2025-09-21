class pyramid {
    public static void main(String[] args) {
        int n = 4;
System.out.println("Naisha Tyagi, 24csu315");

        for (int i = 1; i <= 4; i++) {
 //space
            for (int j = i; j <= 4; j++) {
                System.out.print(" ");
            
}
//number of stars 
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}