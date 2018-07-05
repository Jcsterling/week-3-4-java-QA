
public class Class2 {

    public static void main(String[] args) {
        //System.out.println(blackJack(22,22));
        //System.out.println(uniqueSum(1, 2, 3));
        System.out.println(tooHot(100, false));
    }

    public static int blackJack(int a, int b) {

        if (a > 21 && b > 21) {
            return 0;
        }

        if (a <= 21 && b > 21) {
            return a;
        }

        if (b <= 21 && a > 21) {
            return b;

        }
        if (a <= 21 && b <= 21) {

            int a_variable = 21 - a;
            int b_variable = 21 - b;

            if (a_variable > b_variable) {
                return b;
            } else {
                return a;
            }
        } else {
            return 0;
        }
    }

    public static int uniqueSum(int a, int b, int c) {

        if (a == b && b == c && c == a) {
            return 0;
        } else if (a == b && b != c) {
            return 0 + c;
        } else if (a == c && c != b) {
            return 0 + b;
        } else if (b == c && c != a) {
            return 0 + a;
        } else {
            return a + b + c;

        }
    }

    public static boolean tooHot(int temp, boolean isSummer) {
        if (isSummer == false) {
            if (60 <= temp && temp <= 90) {
                return true;
            } else {
                return false;
            }
        }
        if (isSummer == true) {
            if (60 <= temp && temp <= 100) {
                return true;
            } else {
                return false;
            }

        }else return false;
    }
}







