public class Assingment5 {
    public static void main(String[] args) {
        int numLim = 300;
        for (int i = 0; i < numLim; i ++){
            if (i == 0 || i == 1){
                System.out.println(i + " is not a prime number");
            }
            else {
                int j = 2;
                boolean isPrime = true;
                do {
                    if (i % j == 0 && i != j){
                        isPrime = false;
                        break;
                    }
                    j++;
                } while(j < i);

                if (isPrime){
                    System.out.println(i + " is a prime number");
                }
            }
        }
    }
}
