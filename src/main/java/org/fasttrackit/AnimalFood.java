package org.fasttrackit;
import java.util.Date;

public class AnimalFood {

    String name;
    double price;
    double amount;
    Date expirationDate;
    double remainingStock;
    String foodType; //HERBIVORE, CARNIVORE, OMNIVORES, INSECTIVORE
    String dryOrWetFood;
    boolean bulkOrPackaged;
    String allergy;



    public AnimalFood(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getRemainingStock() {
        return remainingStock;
    }

    public void setRemainingStock(double remainingStock) {
        this.remainingStock = remainingStock;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getDryOrWetFood() {
        return dryOrWetFood;
    }

    public void setDryOrWetFood(String dryOrWetFood) {
        this.dryOrWetFood = dryOrWetFood;
    }

    public boolean isBulkOrPackaged() {
        return bulkOrPackaged;
    }

    public void setBulkOrPackaged(boolean bulkOrPackaged) {
        this.bulkOrPackaged = bulkOrPackaged;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    @Override
    public String toString() {
        return "AnimalFood{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", expirationDate=" + expirationDate +
                ", remainingStock=" + remainingStock +
                ", foodType='" + foodType + '\'' +
                ", dryOrWetFood='" + dryOrWetFood + '\'' +
                ", bulkOrPackaged=" + bulkOrPackaged +
                ", allergy='" + allergy + '\'' +
                '}';
    }
}
