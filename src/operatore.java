public class operatore{
    public static void main(){


//        ==> Arithmetic Operatore <==
        int solveThisWeek = 25;
        int solveLastWeek = 15;

        int Total = solveThisWeek + solveLastWeek;
        int difference = solveThisWeek - solveLastWeek;
        int multiplie = solveThisWeek * solveLastWeek;
        int divide = solveThisWeek / solveLastWeek;
        int remaining = solveThisWeek % solveLastWeek;

        System.out.println(Total);
        System.out.println(difference);
        System.out.println(multiplie);
        System.out.println(divide);
        System.out.println(remaining);



//        ==> Relational Operatore <==
        int first_value = 52;
        int second_value = 12;

        System.out.println(first_value == second_value);
        System.out.println(first_value != second_value);
        System.out.println(first_value > second_value);
        System.out.println(first_value < second_value);
        System.out.println(first_value >= second_value);
        System.out.println(first_value <= second_value);


//        ==> Relational Operatore <==
        int a = 25;
        int b = 14;
        boolean value = false;

        System.out.println(a>b && b>a);
        System.out.println(!value);
        System.out.println(a>b || b>a);


//        ==> Assignment Operatore <==
        int Assine_value = 25;

        Assine_value += 5;
        System.out.println(Assine_value);
        Assine_value -= 5;
        System.out.println(Assine_value);
        Assine_value *= 5;
        System.out.println(Assine_value);
        Assine_value /= 5;
        System.out.println(Assine_value);
        Assine_value %= 5;
        System.out.println(Assine_value);



//        ==> Unary Inc / Dec Operatore <==
        int increment = 100;

        int prefix = ++increment;
        int postfix = increment++;

        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(increment);


    }
}