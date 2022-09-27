package Domashka__7;

public class Plate {
    private int capacity;
    private int currentFilling;

    //Конструктор.
    public Plate(int capacity) {
        this.capacity = capacity;
        currentFilling = 0;
    }

    //состояние  миски
    public int getCurrentFilling() {
        return currentFilling;
    }

    //Добавляем еду в миску
    public void addFoodPlate(int amountOfFood) throws PlateCustom {
        if (amountOfFood > 0 && this.currentFilling + amountOfFood <= capacity) {
            this.currentFilling += amountOfFood;
            System.out.println("Количество еды в миске увеличено до " + this.currentFilling);
        } else {

            throw new PlateCustom("Миска полная");
        }
    }

    //Коты едят из миски, уменьшение корма
    public int feedReduction(int amountFood) throws PlateCustom {
        if (amountFood > 0 && this.currentFilling - amountFood >= 0) {
            this.currentFilling -= amountFood;
            return amountFood;
        } else {

            throw new PlateCustom("Не достаточно еды");
        }
    }
}
