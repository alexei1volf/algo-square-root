public class Main {

    public static void main(String[] args) {
        int result = getSquare(25);
        System.out.println(result);
    }

    public static int getSquare(int input) {
        int res = input;
        while (res * res >= input) {
            res = res - 1;
        }

        return res;
    }

}
