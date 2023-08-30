//package test;
//
//import java.util.Scanner;
//
//public class Demonstrate {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter year: ");
//        int year = scanner.nextInt();
//        System.out.println("Enter day: ");
//        int day = scanner.nextInt();
//        boolean correctYear;
//        System.out.println("===============================");
//        if (year % 4 == 0) {
//            if (year % 100 != 0 || year % 400 == 0) {
//                correctYear = false;
//                System.out.println(year + ": 해당 연도는 윤년입니다.");
//            } else {
//                correctYear = true;
//                System.out.println(year + ": 해당 연도는 평년입니다.");
//            }
//        } else {
//            correctYear = true;
//            System.out.println(year + ": 해당 연도는 평년입니다.");
//        }
//
//
//        System.out.println("===============================");
//    }
//
//
//    public String datCorrect(boolean year, int day){
//        int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        if(year == false){
//            arr[1] = 29;
//        }
//        int Month = 0;
//        for(int i = 0; day-arr[i]<=0; i++){
//            if
//        }
//
//    }
//}