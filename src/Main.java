import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Zadatak 1: Brojevi od 1 do N

//        int nNumber;
//        int sum = 0;
//
//        do {
//            System.out.println("Please enter integer");
//            nNumber = scanner.nextInt();
//            if (nNumber < 0) {
//                System.out.println("Number must be positive integer");
//            }
//        } while (nNumber < 0);
//
//        for (int i = 0; i <= nNumber; i++) {
//            sum+=i;
//        }
//
//        System.out.println("Sum of all numbers up to " + nNumber + " is " + sum);

        //Zadatak 2: Brojanje znamenki broja

//        System.out.println("Please enter integer");
//        int num = scanner.nextInt();
//        int tempNum = num;
//        int digitCount = 0;
//
//        while (num > 0){
//            num = num /10;
//            digitCount++;
//        }
//
//        System.out.println(tempNum + " has " + digitCount + " digits");

        //Zadatak 3: Unos brojeva dok ne postignemo određeni zbroj

        int goalNum = 10;
        int sum = 0;
        int count = 0;
        int num;

        do {
            System.out.println("Please enter integer");
            num = scanner.nextInt();
            if (num < 0 ){
                System.out.println("Number must be positive");
            } else if (num == 0){
                break;
            } else{
                sum += num;
            }
            count ++;
        }while (sum < goalNum);

        System.out.println(count + " tries, sum is " + sum);
    }
}
