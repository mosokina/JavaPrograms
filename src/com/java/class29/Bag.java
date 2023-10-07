package com.java.class29;


public class  Bag { //parent class

    private int price; //instance  variables
    private int annualPrice;
    private int choose;
    private int item;
    private String name;

    public Bag() { //no argument constructor
    }
    public Bag(String name, int price, int annualPrice){
        //parameterized constructor
        this.name =  name;
        this.price = price;
        this.annualPrice = annualPrice;
    }
    public  Bag(int item, int choose){
        //parameterized constructor
        this.item = item;
        this.choose = choose;
    }
    //Getters and setters  for private variables below_________________

    public int getPrice() {return price;}
    public void setPrice(int price) {
        this.price = price;}

    public int getChoose() {return choose;}
    public void setChoose(int choose) {
        this.choose = choose;}

    public int getAnnualPrice() {return annualPrice;}
    public void setAnnualPrice(int annualPrice) {
        this.annualPrice = annualPrice;}

    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;}

    public int getItem() { return item;}
    public void setItem(int item) {
        this.item = item;}
}






