public class pattern {
    static void main() {

//        Solid square Pattern
//        int n = 4;
//        for (int row = 1; row < n; row++) {
//            for (int col = 1; col < n; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Rectangle Pattern
//        int a = 4;
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Right-side Angle Triangle Pattern
//        int a= 5;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Pattern-4
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Pattern-5
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= 6-i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Pattern-6
//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n-row; col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <= 2*row-1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Pattern-7
//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row-1; col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <= 2*n-2*row+1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Pattern-8
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= 6; j++) {
//                if (i == 1 || i == 4) {
//                    System.out.print("* ");
//                }else {
//                    if (j == 1 || j == 6) {
//                        System.out.print("* ");
//                    }else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }


//        Pattern-9
//        ==> Method-1
//        int a = 5;
//        for (int row = 1; row <= a; row++) {
//            if (row == 1 || row == 2 || row == 5) {
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//
//                for (int col = 1; col <= row-2 ; col++) {
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        ==> Method-2
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                if (row == 1 || row == 2 || row == 5) {
//                    System.out.print("* ");
//                }else if (row == 3) {
//                    if (col == 1 || col == 3) {
//                        System.out.print("* ");
//                    }else {
//                        System.out.print("  ");
//                    }
//                } else if (row == 4) {
//                    if (col == 1 || col == 4) {
//                        System.out.print("* ");
//                    }else {
//                        System.out.print("  ");
//                    }
//                }else {
//                    System.out.print("Error");
//                }
//            }
//            System.out.println();
//        }


//        Pattern-10
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            //part-1
//            for (int i = 1; i <= n-row; i++) {
//                System.out.print("  ");
//            }
//            //part-2
//            if (row == 1 || row == n) {
//                for (int i = 1; i <= 2*row-1 ; i++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//                for (int i = 1; i <= 2*row-3; i++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Pattern-11
//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n-row; col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <= 2*row-1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int row = 1; row <= n; row++) {
//            if (row == 1) {
//                continue;
//            }
//            for (int col = 1; col <= row-1; col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <= 2*n-2*row+1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Pattern-12
//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            //part-1
//            for (int i = 1; i <= n-row; i++) {
//                System.out.print("  ");
//            }
//            //part-2
//            if (row == 1) {
//                for (int i = 1; i <= 2*row-1 ; i++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//                for (int i = 1; i <= 2*row-3; i++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int row = 1; row <= (n-1); row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("  ");
//            }
//            if (row == (n-1)) {
//                System.out.print("* ");
//            }else {
//                System.out.print("* ");
//                for (int col = 1; col <= 2*(n-row)-3; col++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



//        Pattern-13
//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            for (int col = 1; col <= (n*2)-(row*2); col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= (n+1)-row; col++) {
//                System.out.print("* ");
//            }
//            for (int col = 1; col <= (2*row)-2; col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <= (n+1)-row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Pattern-14
//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            for (int col = 1; col <= (n*2)-(row*2); col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int row = 1; row <= n; row++) {
//            if (row == 1) {
//                continue;
//            }
//            for (int col = 1; col <= (n+1)-row; col++) {
//                System.out.print("* ");
//            }
//            for (int col = 1; col <= (2*row)-2; col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <= (n+1)-row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        Pattern-15
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }


//        Pattern-16
//        int n = 5;
//        int count = 1;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }


//        Pattern-17
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                int a = col;
//                int b = ('A' - 1);
//                int ans = a+b;
//                char finalAns = (char)ans;
//                System.out.print(finalAns+" ");
//            }
//            System.out.println();
//        }


//        Pattern-18
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                int a = n-col;
//                int b = 'A';
//                int ans = a+b;
//                char FinalAns = (char)ans;
//                System.out.print(FinalAns+" ");
//            }
//            System.out.println();
//        }


//        Pattern-19
        int n = 4;
        for (int row = 1; row <= n; row++) {

        }




    }
}
