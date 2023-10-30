public class Main {

    // Question 1 - calculateGrade
    static char calculateGrade(int grade){
    if (grade >= 90) {
            return 'A';
        }
    if ((grade >=80) && (grade <= 89)) {
        return 'B';
        }
    else if ((grade >=70) && (grade <=79)){
        return 'C';
        }
    else if ((grade >=60) && (grade <=69)){
        return 'D';
        }
    else if ((grade >=50) && (grade <=59)){
        return 'E';
        }
    else return 'F';
}
    // Question 2 - fizzBuzz
    static String fizzBuzz(int a){
        if ((a%3==0) && (a%5==0)){
            return "fizzbuzz";
        }
        if (a%3==0){
            return "fizz";
        }
        else if (a%5==0){
            return "buzz";
        }
        else return "unlucky";
    }
    // Question 3 - frontBack
    static String frontBack(String str){
        if (str.length() > 2){
            return str.substring(0,2)+str+str.substring(0,2);
        }
        if (str.length() == 2) {
            return str + str + str;
        }
        else return str;
    }
    // Question 4 - twoAsOne
    static boolean twoAsOne (int a, int b, int c){
        if (a+b==c){
            return true;
        }
        if (b+c==a){
            return true;
        }
        else return false;
    }
    // Question 5 - endUp
    static String endUp(String str){
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        else return str.substring(0,str.length() - 3)+str.substring(str.length() - 3).toUpperCase();
        }
    }