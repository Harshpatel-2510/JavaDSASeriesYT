import java.util.Scanner;

public class Array {
    static void main() {


//        ============================>>  1-D Array  <<==================================
////        declaration
//        int arr[];
//
////        Allocation
//        arr = new int[5];
//
////        Initialisation
//        int arr1[]= {1,2,3,4,5};


//        ===> 'for loop' for Array <===
//        int arr1[]= {1,2,3,4,5};
//
//        int n = arr1.length;        //for finding length of Array
//        for (int i = 0; i <= n-1; i++) {
//            System.out.println(arr1[i]);
//        }

//        ===> for-Each loop (Second method to declare Array in for loop)<===
//        int arr1[] = {1,2,3,4,5,6,7,8,9};
//        for (int val:arr1){
//            System.out.println(val);
//        }


//        ===> Taking input in an Array <===
//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        for (int i = 0; i <= n-1; i++) {
//            System.out.println("Give me one number for index "+i);
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Your Array's Value:-");
//        for (int value:arr){
//            System.out.println(value);
//        }


//        ====> Q.1 || Print Array's value using For-loop
//        int arr[] = {12, 13, 14, 15, 16};
//        int n = arr.length;
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.println("Your " + i + "'th index value:- " + arr[i]);
//        }


//        ====> Q.2 || Print Sum of all Array's value
//        int arr[] = {22, 25, 26, 8, 64};
//        int n = arr.length;
//        int sum = 0;
//        for (int i = 0; i <= n - 1; i++) {
//            sum = sum + arr[i];
//        }
//        System.out.println("Final Ans. of array's Sum:- " + sum);


//        ====> Q.3 || Print Multiplication of all Array's value
//        int arr[] = {2,5,3,6,7};
//        int n = arr.length;
//        int mul = 1;
//        for (int i = 0; i <= n-1; i++) {
//            mul = mul*arr[i];
//        }
//        System.out.println("Total multiplication of Array's value:- "+mul);


//        ====> Q.4 || Find the Maximum value from Array
//        int arr[] = {12,8,99,4,6,25};
//        int n = arr.length;
//        int Maxvalue = arr[0];
//        for (int i = 0; i <= n-1; i++) {
//            if (arr[i] > Maxvalue) {
//                Maxvalue = arr[i];
//            }
//        }
//        System.out.println("Maximum value from in Array:- "+Maxvalue);


//        ====> Q.5 || Find the Minimum value from Array
//        int arr[]= {55,12,99,43,25,1};
//        int n = arr.length;
//        int min = arr[0];
//        for (int i = 0; i <= n-1; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println("Minimum value is:- "+min);



//      ============================>>  2-D Array  <<==================================

////        Declaration
//        int[][] arr;
//
////        Allocation
//        int[][] arr1 = new int[2][3];
//
////        Initialisation
//        int[][] arr2 = {{1,2,2},{5,3,4},{5,2,1}};

//        ===> How to Print 2-D Array (Same number of row and same number of column)
//        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
//        int row_length = arr1.length;
//        int col_length = arr1[0].length;
//        for (int i = 0; i <= row_length-1; i++) {
//            for (int j = 0; j <= col_length-1; j++) {
//                System.out.print(arr1[i][j]+" ");
//            }
//            System.out.println();
//        }


//        ===> How to Print 2-D Array (Same number of row and different number of column)
//        int[][] arr1 = {{1,2},{4,5,6},{7,8,9,5},{2}};
//        int row_length = arr1.length;
//
//        for (int i = 0; i <= row_length-1; i++) {
//            int col_length = arr1[i].length;
//            for (int j = 0; j <= col_length-1; j++) {
//                System.out.print(arr1[i][j]+" ");
//            }
//            System.out.println();
//        }


//        ===> Input / Output in 2D Array
//        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[3][4];
//        for (int i = 0; i <= arr.length-1; i++) {
//            for (int j = 0; j <= arr[i].length-1; j++) {
//                System.out.print("Enter value for row="+i+" and column="+j+" :-");
//                arr[i][j] = sc.nextInt();
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i <= arr.length-1; i++) {
//            for (int j = 0; j <= arr[i].length-1; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }



//        ===>practice Question
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print("Enter value "+i+" :-");
            arr[i] = sc.nextInt();
        }
int mid = arr.length/2;
        for (int i = 0; i <= arr.length-1; i++) {
            if (i < mid) {
                sum1 = sum1 + arr[i];
            }else {
                sum2 = sum2 + arr[i];
            }
        }

        if (sum1 == sum2) {
            System.out.println("First 3-element's summation:- "+sum1);
            System.out.println("Last 3-element's summation:- "+sum2);
            System.out.println("Array's first 3-element's summation and last 3-element's summation is same.");
        }else if (sum1 > sum2) {
            int value = sum1 - sum2;
            System.out.println("First 3-element's summation:- "+sum1);
            System.out.println("Last 3-element's summation:- "+sum2);
            System.out.println("Difference Between this two Summation:- "+value);
        }else {
            int value = sum2 - sum1;
            System.out.println("First 3-element's summation:- "+sum1);
            System.out.println("Last 3-element's summation:- "+sum2);
            System.out.println("Difference Between this two Summation:- "+value);
        }






    }
}
