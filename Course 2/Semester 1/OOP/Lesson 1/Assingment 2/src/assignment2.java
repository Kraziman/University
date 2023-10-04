public class assignment2 {
    public static void main(String[]args){
        int[] QuantityOfCassettes = {5, 6, 7, 9};
        double[] PriceOfCassettes = {2.5, 3.6, 8.9, 7.5};
        double PriceOfAll = 0;

        for(int i = 0; i < 4; i++){
            PriceOfAll+= QuantityOfCassettes[i] * PriceOfCassettes[i];
        }
        System.out.println("Цената на всички касети заедно е " + PriceOfAll);
    }
}