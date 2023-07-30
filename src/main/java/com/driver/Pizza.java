package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";
    private Boolean isCheeseAdded;
    private Boolean isToppingsAdded;
    private Boolean isTakeAway;

    private int vegPizzaBasePrice = 300;
    private int nonVegPizzaBasePrice = 400;
    private int extraCheesePrice = 80;
    private int extraToppingsVegPrice = 70;
    private int extraToppingsNonVegPrice = 120;
    private int PaperBagPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            price += 300;
            this.bill += "Base Price Of The Pizza: " + vegPizzaBasePrice + "\n";
        }else{
            price += 400;
            this.bill += "Base Price Of The Pizza: " + nonVegPizzaBasePrice + "\n";
        }
        isCheeseAdded = false;
        isToppingsAdded = false;
        isTakeAway = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(isCheeseAdded)return;
        else{
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(isToppingsAdded)return;
        else{
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(isTakeAway)return;
        else{
            isTakeAway = true;
        }
    }

    public String getBill(){

        if(isCheeseAdded){
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
            price += extraCheesePrice;
        }
        if(isToppingsAdded && isVeg){
            bill += "Extra Toppings Added: " + extraToppingsVegPrice + "\n";
            price += extraToppingsVegPrice;
        }else if(isToppingsAdded && !isVeg){
            bill += "Extra Toppings Added: " + extraToppingsNonVegPrice + "\n";
            price += extraToppingsNonVegPrice;
        }
        if(isTakeAway){
            bill += "Paperbag Added: " + PaperBagPrice + "\n";
            price += PaperBagPrice;
        }
        bill += "Total price: " + getPrice() +"\n";
        return this.bill;
    }
}
