public class application5 {
    public static void main(String[] args) {
        softDrink drink1 = new softDrink("Coca-Cola", "2023-12-31", 330, 10.6);
        softDrink drink2 = new softDrink("Pepsi", "2023-12-31", 330, 11.2);
        softDrink drink3 = new softDrink("Sprite", "2023-12-31", 330, 9.5);
        softDrink drink4 = new softDrink("Coca-Cola", "2023-12-31", 330, 10.6);

        softDrink[] drinks = {drink1, drink2, drink3, drink4};

        softDrinkShelf shelf = new softDrinkShelf(drinks);

        softDrink mostFrequent = shelf.getMostFrequentSoftDrink();

        if (mostFrequent != null) {
            System.out.println("Most frequent soft drink:");
            System.out.println(mostFrequent.getDescription());
        } else {
            System.out.println("No soft drinks found.");
        }
    }
}