public class main{
    public static void main(String[]args){
        int QuantityOfCassettes[4] = {5, 6, 7, 9};
        double PriceOfCassettes[4] = {2.5, 3.6, 8.9, 7.5};
        double PriceOfAll = 0;

        for(int i = 0; i < 4; i++){
            PriceOfAll+= QuantityOfCassettes * PriceOfCassettes;
        }
        System.out.println(PriceOfAll);

        return 0;
    }
}