public class Method {


    //      ==> Program-1 (Normal Method's Example && Method with No-Parameter) <==
////    Declaration \ definition
//    static void Twokatable() {
//        for (int i = 1; i <= 10; i++) {
//            int value = 2 * i;
//            System.out.println("=> " + value);
//        }
//    }
//    static void main() {
//        System.out.println("Hey");
////        Method call
//        Twokatable();
//        Printsum(5,10);
//        System.out.println("Byy...");
//    }


//      ==> Program-2 (Method with parameter) <==
//    static void Printsum(int x,int y){
//        System.out.println("Sum: "+(x+y));
//    }
//    static void main() {
//        System.out.println("Hey");

    /// /        Method call
//        Printsum(5,10);
//        System.out.println("Byy...");
//    }
//}


//      ==> Program-3 (Static Method without void) <==  ((Without void matlab void ni jagya par int, boolean, char etc. aavse))
//    static void PrintWelcome() {
//        System.out.println("Welcome to Harsh World");
//    }
//
//    static int calculateTotal(int number1, int number2) {
//        return number1 + number2;
//    }
//
//    static boolean isEligible(int YourAge) {
//        return YourAge >= 18;
//    }
//
//    static void main() {
//
//        PrintWelcome();
//
//        int FinalScore = calculateTotal(25, 12);
//        System.out.println(FinalScore);
//
//        boolean FinalVote = isEligible(20);
//        System.out.println("Eligible for Voting:- " + FinalVote);
//    }


//      ==> Program-4 (Method Overloading) <== "Method have same name but different Parameter it's call Method OverLoading "
//    static int add(int x, int y){
//        return x + y;
//    }
//
//    static int add(int x, int y, int z){
//        return x + y + z;
//    }
//
//    static void main() {
//        System.out.println("Helloo....");
//        System.out.println("Summation of Two number:- "+add(25,10));
//        System.out.println("Summation of Three number:- "+add(25,12,10));
//    }


//      ==> Program-5(Call by Value) <==
    static void solve(int num) {
        System.out.println("Inside solve:- " + num);
        num = num * 10;
        System.out.println("Inside solve:- " + num);
    }

    static void main() {
        int num = 5;
        System.out.println("Inside main:- " + num);
//        "num" ke value me num ki copy value jati he jise call-by-value kehte he
        solve(num);
        System.out.println("Inside main:- " + num);
    }

}