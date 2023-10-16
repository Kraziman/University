public class itemArray {
    item[] items;

    public itemArray(int arrLength){
        items = new item[arrLength];
    }

    String calculateAveragePrice(){
        double total = 0;
        int itemCount = 0;
        for (int i = 0; i < items.length; i++){
            if(items[i] == null){
                continue;
            }
            total+= items[i].getPrice() * items[i].getQuantity();
            itemCount += items[i].getQuantity();
        }

        return "\nAverage Item Price: " + (double)total/itemCount;
    }
}
