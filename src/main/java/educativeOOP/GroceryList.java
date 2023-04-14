package educativeOOP;

//Grocery list
//        In this coding exercise, you are required to implement a class called GroceryList that will keep track of
//        groceries to buy. This class will have the following member variables:
//        numberOfItems: This variable will be equal to current grocery items inside the list.
//        items: It will also contain an array of strings that holds the names of items. You can assume that it can
//        hold 20 items at maximum.
//        The GroceryList class should also contain the following methods:
//        insertItem: This function will take the name of an item as input and insert it into the grocery list.
//        printList: This function will not take in any input. It will print out the items currently present in the list.
//        Make sure that it does not print any empty strings.
//        The following code in the main() method should give the output mentioned below.


class GroceryList {
    private int numberOfItems;
    private String[] items;

    public GroceryList() {
        numberOfItems = 0;
        items = new String[20];
    }

    public void insertItem(String item) {
        if (numberOfItems < 20) {
            items[numberOfItems] = item;
            numberOfItems++;
        }
    }

    public void printList() {
        for (int i = 0; i < numberOfItems; i++) {
            if (items[i] != null && !items[i].isEmpty()) {
                System.out.println(items[i]);
            }
        }
    }
}
