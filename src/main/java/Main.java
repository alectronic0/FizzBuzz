
public class Main {
    public static void main(String... args){
        for(int i=0; i < 100; i++){
            System.out.println(i + " = " + FizzBuzz.getFizzBuzz(i));
        }
    }

    public static class FizzBuzz{
        public static final String FIZZBUZZ = "FizzBuzz";
        public static final String FIZZ = "Fizz";
        public static final String BUZZ = "Buzz";
        public static final String NONFIZZBUZZ = "";

        public static String getFizzBuzz(int i){return isBuzzFizz(i) ? FIZZBUZZ  : isFizz(i) ? FIZZ : isBuzz(i) ? BUZZ : NONFIZZBUZZ;}
        private static boolean isBuzzFizz(int i){return isFizz(i) && isBuzz(i);}
        private static boolean isFizz(int i){return 0 == (i % 3);}
        private static boolean isBuzz(int i){return 0 == (i % 5);}
    }
}
