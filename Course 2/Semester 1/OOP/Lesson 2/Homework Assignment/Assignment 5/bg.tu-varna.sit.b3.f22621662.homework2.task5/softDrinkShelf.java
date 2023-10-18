public class softDrinkShelf {
    private softDrink[] drinks;

    public softDrinkShelf(softDrink[] drinks) {
        this.drinks = drinks;
    }

    public softDrink getMostFrequentSoftDrink() {
        if (drinks.length == 0) {
            return null;
        }

        softDrink mostFrequent = drinks[0];
        int maxCount = 1;

        for (int i = 0; i < drinks.length; i++) {
            int count = 1;

            for (int j = i + 1; j < drinks.length; j++) {
                if (drinks[i].equals(drinks[j])) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = drinks[i];
            }
        }

        return mostFrequent;
    }
}