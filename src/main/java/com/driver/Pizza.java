package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean isCheeseAdded;
    private Boolean isToppingsAdded;
    private Boolean isTakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            price = 300;
        }else{
            price = 400;
        }
        bill = "";
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
            price += 80;
        }
    }

    public void addExtraToppings(){
        if(isToppingsAdded)return;
        else{
            if(isVeg){
                price += 70;
            }else{
                price += 120;
            }
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(isTakeAway)return;
        else{
            price += 20;
            isTakeAway = true;
        }
    }

    public String getBill(){
        if (isVeg){
            bill += "Base Price Of The Pizza: 300 \n";
        }else{
            bill += "Base Price Of The Pizza: 400 \n";
        }
        if(isCheeseAdded){
            bill += "Extra Cheese Added: 80 \n";
        }
        if(isToppingsAdded && isVeg){
            bill += "Extra Toppings Added: 70 \n";
        }else if(isToppingsAdded && !isVeg){
            bill += "Extra Toppings Added: 120 \n";
        }
        if(isTakeAway){
            bill += "Paperbag Added: 20 \n";
        }
        bill += "Total price: " + getPrice() +"\n";
        return this.bill;
    }
}
