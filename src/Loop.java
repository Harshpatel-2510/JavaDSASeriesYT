import java.util.Scanner;

public class Loop {
    static void main() {

//        ==> For Loop <==
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Value of i:- "+i);
//        }

//        for (int i = 1; i <= 10; i += 2) {
//            System.out.println(i);
//        }



//        ==> Nested Loop <==
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.println("i = " + i + " j = "+j);
//            }
//        }


//        for (int i = 1; i <= 10; i++) {
//            if(i == 5){
//                break;
//            }
//            System.out.println(i);
//        }


//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }



//        ==> While loop <==
//        int i = 1;
//        while (i<=10){
//            System.out.println(i);
//            i += 1;
//        }



//        ==> Nested While loop <==
//        int i = 1;
//        while (i <= 5){
//            int j = 1;
//            while (j <= 3){
//                System.out.println("Value of i:- "+i+" and Value of j:- "+j);
//                j++;
//            }
//            i++;
//        }




//        ==> Do-while loop <==
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        }while (i <= 5);



//        ====> Practice questions <====

//        HW-1===>print counting from 1 to n

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Any ONE number:- ");
//        int a = sc.nextInt();
//
//        for (int i = 1; i <= a; i++) {
//            System.out.println(i);
//        }
//        sc.close();


//        HW-2===>print counting from n to 1

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any ONE number:- ");
//        int a = sc.nextInt();
//
//        for (int i = 1; i <= a; a--) {
//            System.out.println(a);
//        }
//        sc.close();


//        HW-3===>print the 10 multiples of n

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any ONE number:- ");
//        int a = sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(a+" * "+i+" = "+ a*i);
//        }
//        sc.close();


//        HW-4===>print your name 100 time

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your Name:- ");
//        String name = sc.nextLine();
//        int i = 1;
//        while (i <= 100){
//            System.out.println(i+". " + name);
//            i++;
//        }
//        sc.close();


//        HW-5===>print all prime number from 1 to 100

//        for (int num = 2; num <= 100; num++) {
//            boolean isPrime = true;
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num%i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.println(num);
//            }
//        }


//        HW-6===>print all even number from 1 to 100

//        for (int num = 0; num <= 100; num++) {
//            if (num%2 == 0) {
//                System.out.println(num);
//            }
//        }


//        HW-7===>print the sum of all the number from 1 to n

        Scanner sc = new Scanner(System.in);
        System.out.print("Give any ONE number:- ");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++) {
            count = count + i;
        }
        System.out.println("Your final Sum of all number is "+count);


//        HW-8===>print all integers in range from 50 to 100, that are perfectly divisible by 7.



    }
}
