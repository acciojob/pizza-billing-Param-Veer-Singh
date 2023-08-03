package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";
    private Boolean isCheeseAdded;
    private Boolean isToppingsAdded;
    private Boolean isTakeAway;
    private Boolean isBillGenerated;
    private int vegPizzaBasePrice = 300;
    private int nonVegPizzaBasePrice = 400;
    private int extraCheesePrice = 80;
    private int extraToppingsVegPrice = 70;
    private int extraToppingsNonVegPrice = 120;
    private int PaperBagPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price += 300;
            this.bill += "Base Price Of The Pizza: " + vegPizzaBasePrice + "\n";
        }else{
            this.price += 400;
            this.bill += "Base Price Of The Pizza: " + nonVegPizzaBasePrice + "\n";
        }
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeAway = false;
        this.isBillGenerated = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(this.isCheeseAdded)return;
        else{
            this.isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(this.isToppingsAdded)return;
        else{
            this.isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(this.isTakeAway)return;
        else{
            this.isTakeAway = true;
        }
    }

    public String getBill(){
        if(isBillGenerated)return bill;
        if(this.isCheeseAdded){
            this.bill += "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            this.price += this.extraCheesePrice;
        }
        if(this.isToppingsAdded && this.isVeg){
            this.bill += "Extra Toppings Added: " + this.extraToppingsVegPrice + "\n";
            this.price += this.extraToppingsVegPrice;
        }else if(this.isToppingsAdded && !this.isVeg){
            this.bill += "Extra Toppings Added: " + this.extraToppingsNonVegPrice + "\n";
            this.price += this.extraToppingsNonVegPrice;
        }
        if(this.isTakeAway){
            this.bill += "Paperbag Added: " + this.PaperBagPrice + "\n";
            this.price += this.PaperBagPrice;
        }
        this.bill += "Total price: " + getPrice() +"\n";
        this.isBillGenerated = true;
        return this.bill;
    }
}
