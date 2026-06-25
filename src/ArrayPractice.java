import java.util.Scanner;

public class ArrayPractice {
    static void main() {

////        1.===> Array ka Sum nikalo
//        int arr[] = {5, 6, 3, 8, 4, 9};
//        int value = 0;
//        for (int i = 0; i <= arr.length - 1; i++) {
//            value = value + arr[i];
//        }
//        System.out.println("Total sum:- " + value);


////        2.===> Largest Number Find Karo
//        int arr[] = {21,65,25,62,21,98};
//        int val1 = arr[0];
//        for (int i = 0; i <= arr.length-1; i++) {
//            if (val1<arr[i]) {
//                val1 = arr[i];
//            }
//        }
//        System.out.println("In this array, Largest number is:- "+val1);


////        3.===> Smallest Number Find Karo
//        int arr[] = {21,65,5,62,2,98};
//        int val1 = arr[0];
//        for (int i = 0; i <= arr.length-1; i++) {
//            if (val1>arr[i]) {
//                val1 = arr[i];
//            }
//        }
//        System.out.println("In this array, Smallest number is:- "+val1);


////        4.===> Array Reverse Karo
//        int arr[] = {25,26,27,28,29,30};
//        for (int i = arr.length-1; i >= 0; i--) {
//            System.out.print(arr[i]+" ");
//        }


////        5.===> Even Numbers Print Karo
//        int arr[]={52,85,1,6,8,63};
//        int n = arr.length;
//        int count = 1;
//        for (int i = 0; i <= n-1; i++) {
//            if (arr[i]%2 == 0) {
//                System.out.println("In this array "+count+" Even number:- "+arr[i]);
//                count++;
//            }
//        }


////        6.===> Odd Numbers Print Karo
//        int arr[]={2,5,8,6,9,4};
//        int count = 1;
//        for (int i = 0; i <= arr.length-1; i++) {
//            if (arr[i]%2 != 0){
//                System.out.println("In this array "+count+" Odd number:- "+arr[i]);
//                count++;
//            }
//        }


////        7.===> Array ke Sare Elements ko 2 se multiplication kar do
//        ++>Method-1<++
//        int arr[]={5,2,6,9,7};
//        int n = arr.length;
//        for (int i = 0; i <= n-1; i++) {
//            System.out.print(arr[i]*2+" ");
//        }

//        ++>Method-2<++
//        int arr1[]={5,2,6,9,7};
//        for (int num : arr1){
//            System.out.print(num*2+" ");
//        }


////        8.===> Check Karo Number Array me Hai Ya Nahi
//        Scanner sc = new Scanner(System.in);
//        int arr[]={5,6,9,8,7,4,1,2,3,0};
//        System.out.print("Enter Any one number:- ");
//        int num = sc.nextInt();
//        boolean value = false;
//        for (int i = 0; i <= arr.length-1; i++) {
//            if (arr[i] == num) {
//                value = true;
//                break;
//            }
//        }
//        System.out.println(value);


////        9.===> Count Even Numbers
//        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12};
//        int count = 0;
//        for (int i = 0; i <= arr.length-1; i++) {
//            if (arr[i]%2==0){
//                count++;
//            }
//        }
//        System.out.println("In this Array, We have "+count+" Even number.");


////        10.===> Remove Duplicates
//        int arr[] = {5,8,9,4,4,5,6,6,2};
//        for (int i = 0; i <= arr.length-1; i++) {
//            boolean duplicate = false;
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    duplicate = true;
//                    break;
//                }
//            }
//            if (!duplicate) {
//                System.out.print(arr[i]+" ");
//            }
//        }


////          11.===> Second Largest Number Find Karo
//        int arr[] = {-14, -15, -26, -48, -23, -12};
//        int num1 = arr[0];
//        int num2 = arr[0];
//        for (int i = 0; i <= arr.length - 1; i++) {
//            if (arr[i] > num1) {
//                num1 = arr[i];
//            }
//        }
//        for (int i = 0; i <= arr.length - 1; i++) {
//            if (arr[i] > num2 && arr[i] < num1) {
//                num2 = arr[i];
//            }
//        }
//        System.out.println(num2);


//        12.===> Array Sort Karo (Ascending)
        int arr[] = {12, 52, 25, 1, 54};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for ( int num : arr){
            System.out.print(num+" ");
        }



    }
}
