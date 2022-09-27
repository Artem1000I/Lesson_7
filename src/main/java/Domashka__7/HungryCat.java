package Domashka__7;

public class HungryCat {
    protected String name;                // Имя кота
    protected int appetite;               // Аппетит сколько может сьесть еды
    protected int hunger;                 // Голод кота

    public HungryCat(String name, int appetite, int hunger) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = hunger;
    }

    public boolean catFood(Plate plate) { //Кот ест, и наедается.
        if (100 - ((double) (appetite - hunger) / appetite) * 100 <= 0 && plate.getCurrentFilling() >= appetite - hunger) {
            this.hunger += plate.feedReduction(this.appetite - this.hunger);
            return true;
        }
        // не хватает корма
        return false;
    }

    public boolean isHungry() {
        return 100 - ((double) (appetite - hunger) / appetite) * 100 <= 0;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getCurrentFilling() {
        return hunger;
    }
}

