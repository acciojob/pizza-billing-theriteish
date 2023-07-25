package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int totalPrice;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isPacketNeeded;
    private boolean isbillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.totalPrice += 300;
            this.isCheeseAdded = false;
            this.isToppingAdded = false;
        }else{
            this.price = 400;
            this.totalPrice += 400;
            this.isCheeseAdded = false;
            this.isToppingAdded = false;
        }
    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.isCheeseAdded == false){
            this.totalPrice += 80;
            this.isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isToppingAdded == false){

            if(this.isVeg) {
                this.totalPrice += 70;
                this.isToppingAdded = true;
            }else{
                this.totalPrice += 120;
                this.isToppingAdded = true;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.isPacketNeeded = true;
        this.totalPrice += 20;
    }

    public String getBill(){
        // your code goes here
        if(isbillGenerated == false){
            //for pizza price
            if(isVeg)this.bill = "Base Price Of The Pizza: 300" + "\n";
            else this.bill = "Base Price Of The Pizza: 400" + "\n";

            //for extra chize
            if (isCheeseAdded)this.bill += "Extra Cheese Added: 80" + "\n";
            //for extra toppings added or not
            if (isToppingAdded){
                //if veg then toppings price
                if (isVeg)this.bill += "Extra Toppings Added: 70" + "\n";
                    //if no veg then topping price
                else this.bill += "Extra Toppings Added: 120" + "\n";
            }
            //for packet
            if (isPacketNeeded)this.bill += "Paperbag Added: 20" + "\n";

            this.bill += "Total Price: " + this.totalPrice + "\n";
        }
        this.isbillGenerated = true;
        return this.bill;
    }
}