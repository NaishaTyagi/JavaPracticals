import java.util.Scanner;
class TimeConverter {
    public static void main(String[] args) { 
 System.out.println("Naisha Tyagi : 24csu315 ");
 System.out.println("Enter time in minutes ");
Scanner sc = new Scanner(System.in);
int min = sc.nextInt();

//tot days 
int totDays;
totDays=min/1440;


//tot years//
int years = totDays/365; 

//remaining days after years //
int remDays = totDays%365;

//months // 
int months = remDays/30;

//remaining days left after months//
int daysLeft = remDays%30;

 System.out.println(min+ " is : " + years +" year " + months+ " months " + daysLeft + " days "  ) ;
    }
}