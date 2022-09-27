package Domashka__7;

public class Main {
    static HungryCat[] Cat;
    static Plate plate;
    static boolean deprivedcat;

    public static void main(String[] args) {
        Cat = new HungryCat[3];
        Cat[0] = new HungryCat("Младший", 17, 0);
        Cat[1] = new HungryCat("Средний", 15, 0);
        Cat[2] = new HungryCat("Старший", 171, 0);

        System.out.println("Кормление котов");

        plate = new Plate(150);


            for (HungryCat i : Cat){
                if (fillTheBowl()) {
                    try {
                        plate.addFoodPlate(30);
                        CatsEat();
                        System.out.println("В миске осталось " + plate.getCurrentFilling() + " единиц еды.");
                    } catch (PlateCustom e) {
                        System.out.println(e);
                    }
                }
            }
    }
    public static void CatsEat() {
        for (int i = 0; i < Cat.length; i++) {
            if (Cat[i].catFood(plate)) {
                System.out.println(" Кот по имени " + Cat[i].name + " наелся. Сытость увеличена до " + (100 - ((double) (Cat[i].appetite - Cat[i].hunger) / Cat[i].appetite) * 100) + "%");
            }
        }
    }

    public static boolean fillTheBowl() {
        for (int i = 0; i < Cat.length; i++) {
            if (Cat[i].isHungry()) {
                System.out.println("Эти коты "+Cat[i].name+" остались голодными");
                return true;
            }
        }
        return false;
    }
}
