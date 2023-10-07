package com.java.class44;

enum Days{


    SUNDAY(0),MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

    //SUNDAY("Holiday),MONDAY("Working"), TUESDAY("Working"), WEDNESDAY("Working"), THURSDAY("Working"), FRIDAY("Working"), SATURDAY("Holiday");
    //  Days(String day){
    //        this.day = day;

//    public String getDayWorkStatus(){
//        return day;
//    }

    int day;

    Days(int day){
        this.day = day;
    }
    //@Override
    //will return number of the week
    // public static void main(String[] args) {
    // System.out.println(Days.TUESDAY.toString());

    //    public String toString(){
    //        return String.valueOf(day);
    //}

    public int getDyNum(){
        return day;
    }
}


public class EnumExample {

    public static void main(String[] args) {
        System.out.println(Days.TUESDAY.toString());
        //to.String --> all variables convert to String
        //will print TUESDAY a word

        System.out.println(Days.TUESDAY.getDyNum());
        //will return number of the day -->2


        //working with String
       // System.out.println(Days.TUESDAY.getDayWorkStatus());
    }
}
