public class Fizzbuzz {
    public static void main(String[] args) {
    }

    public static String checknumber(int a) {
        if (a % 15 == 0) { return "Fizzbuzz";
        } else if (a % 5 == 0) {return "Fizz";
        } else if (a % 3 == 0) {return "Buzz";
        } else {return Integer.toString(a);}
    }
}
