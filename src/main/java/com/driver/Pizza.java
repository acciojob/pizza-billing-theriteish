package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePrice;

    private int extraCheese;

    private int extraToppings;

    private int takeAway;

    private boolean isCheeseAdded = false;
    private boolean isToppingsAdded = false;
    private boolean isTakeaway = false;
    private boolean isBillGenerated = false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg){
            this.basePrice = 300;
            this.price = 300;
            this.extraToppings = 70;
        }else{
            this.basePrice = 400;
            this.price = 400;
            this.extraToppings = 120;
        }

        this.extraCheese = 80;

        this.takeAway = 20;
        this.bill = "Base Price Of The Pizza: "+basePrice+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(!this.isCheeseAdded){
            this.price += this.extraCheese;
            this.isCheeseAdded = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here

        if(!this.isToppingsAdded){
            this.price += this.extraToppings;
            this.isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isTakeaway){
            this.price += this.takeAway;
            this.isTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!this.isBillGenerated){
            //make bill structure:
            if(this.isCheeseAdded){
                this.bill +="Extra Cheese Added: "+this.extraCheese+"\n";
            }

            if(this.isToppingsAdded){
                this.bill += "Extra Toppings Added: "+this.extraToppings+"\n";
            }

            if(this.isTakeaway){
                this.bill +="Paperbag Added: "+this.takeAway+"\n";
            }
            this.bill += "Total Price: "+this.price;
        }
        return this.bill;
    }
}
