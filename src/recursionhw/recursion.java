package recursionhw;



public class recursion {
    public static void countDown(int number) {
        if (number != 0) {
            System.out.printf("%d...", number);
            countDown(number - 1);
        }
        else{
            System.out.print("GO!");
        }

     }
    public static void alphaBackwords(char letter){
        if (letter != 'a'){
            System.out.printf("%c ", letter);
            alphaBackwords((char) (letter-1));
        }
        else{
            System.out.print('a');
        }
    }
}

