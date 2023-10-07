package oopproject;

public class Item{

    String nameOfItem;
    int price;

    public Item (String nameOfItem, int price){
        this.nameOfItem = nameOfItem;
        this.price = price;
    }

    public int getPrice(){ //just getter for Amazon

        return price;
    }

    public String getItemName(){ //just getter for Amazon

        return nameOfItem;
    }

}
