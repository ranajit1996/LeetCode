public class DivisorGame {

    static boolean divisorGameRecursive(int n) {
        if (n == 1 || n == 2) {
            return true;
        }

        boolean result = false;
        for (int x = 1; x <= Math.sqrt(n); x++) {
            if (n%x == 0) {
                for (int y = 1; y <= Math.sqrt(n-x); y++) {
                    if ((n-x)%y == 0) {
                        result = result || divisorGameRecursive(n-x-y);
                    }
                }
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        int n = 3;
        System.out.println(divisorGameRecursive(n));
    }
}
