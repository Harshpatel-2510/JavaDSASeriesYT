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
//    static void solve(int num) {
//        System.out.println("Inside solve:- " + num);
//        num = num * 10;
//        System.out.println("Inside solve:- " + num);
//    }
//
//    static void main() {
//        int num = 5;
//        System.out.println("Inside main:- " + num);

    /// /        "num" ke value me num ki copy value jati he jise call-by-value kehte he
    ///
    /// @return
//        solve(num);
//        System.out.println("Inside main:- " + num);
//    }


//    HW====> "Practice Questions" <====
//      Program-1==>    Create a Method "printWelcomeMessage()" that print a Greeting

//    static void printWelcomeMessage(){
//        System.out.println("Hello Family..! This is my fisrt practice Question for Methods");
//    }
//
//    static void main() {
//        printWelcomeMessage();
//    }


//      Program-2==>    Create a Method ADD(int A,int B) That returns the sum.
//    static int Add(int A, int B) {
//        return A + B;
//    }
//
//    static void main() {
//        int sum = Add(25, 12);
//        System.out.println("Value of sum is " + sum);
//    }


//      Program-3==>    Create a Method isEven(int number) that return true if number is Even.
//    static boolean isEven(int number){
//        if (number%2 == 0) {
//            return true;
//        }
//        return false;
//    }
//
//    static void main() {
//        boolean value = isEven(25);
//        System.out.println("Your Entered number is Even:- "+value);
//    }


//      Program-4==>    Create a Method GetMaximum(int A, int B) that return the larger number.
//    static int GetMaximum(int A, int B) {
//        if (A > B) {
//            return A;
//        } else {
//            return B;
//        }
//    }
//
//    static void main() {
//        int num1 = 10;
//        int num2 = 25;
//        if (num1 == num2) {
//            System.out.println("Your Entered both number is Same, so larger number is " + num1);
//        } else {
//            int value = GetMaximum(num1, num2);
//            System.out.println("Between this two number, Larger number is " + value);
//        }
//    }


//      Program-5==>    Create a Method CalculatePercentage(int Obtained, int total).
//    static double CalculatePercentage(double Obtained, int total){
//        if (Obtained == 0) {
//            return 0.0;
//        }else {
//            return ((double) Obtained / total)*100;
//        }
//    }
//
//    static void main() {
//        double given_num = 452;
//        int total = 500;
//        double result = CalculatePercentage(given_num,total);
//        System.out.println("Your Percentage:- "+result);
//    }


    //      Program-6==>    Create an Overloaded method display() with one int parameter or one string parameter.
//    static void display(int a){
//        System.out.println("Your Entered number:- "+a);
//    }
//    static void display(String name){
//        System.out.println("Your Entered name:- "+name);
//    }
//
//    static void main() {
//        display(25);
//        display("Harsh");
//    }


//      Program-7==>    Write a Method UpdateValue(int x) and verify that original variable in Main() does not change.
    static void UpdateValue(int x){
        System.out.println("Before update value:- "+x);
        x=x*2;
        System.out.println("After update valye:- "+x);
    }

    static void main() {
        int x = 10;
        System.out.println("Main Value of X:- "+x);
        UpdateValue(x);
        System.out.println("After performing Method program:- "+x);
    }


}