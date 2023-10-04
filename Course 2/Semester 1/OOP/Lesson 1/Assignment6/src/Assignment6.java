public class Assignment6 {
    public static void main(String[] args) {
        int numLim = 300;
        for (int i = 2; i < numLim; i ++){
            int j = 2;
            boolean isPrime = true;
            boolean canDivide = false;

            do {
                if (i % j == 0 && i != j){
                    isPrime = false;
                    break;
                }
                j++;
            } while(j < i);

            for (int k = 1; k < 300; k++){
                if (isPrime){
                    if (k % i == 0){
                        canDivide = true;
                    }
                }

                if (canDivide){
                    System.out.println(k + " is divisible by a prime number in the range of 1 to 300");
                    break;
                }
            }
        }
    }
}
