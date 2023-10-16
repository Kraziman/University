public class application {
    public static void main(String[] args) {
        item item1 = new item("Bread", 3, 1.50, 3);
        System.out.print(item1.print());
        item item2 = new item("Milk", 1, 3.49, 7);
        item item3 = new item("Coffee", 3, 6.49, 31);
        item item4 = new item("Butter", 2, 4.59, 23);
        item item5 = new item("Eggs", 1, 3.29, 14);

        itemArray itemArray1 = new itemArray(50);

        itemArray1.items[1] = item1;
        itemArray1.items[2] = item2;
        itemArray1.items[3] = item3;
        itemArray1.items[4] = item4;
        itemArray1.items[5] = item5;

        System.out.println(itemArray1.calculateAveragePrice());
    }

}
