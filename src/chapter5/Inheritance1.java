package chapter5;

public class Inheritance1 {
    public static void main(String[] args) {
        Meal meal = new Meal("humburger", 7.99);
        System.out.println(meal.toString());

        DeluxeMeal dexuleMeal = new DeluxeMeal("burrito", "chips", "lemonade",7.99);
        System.out.println(dexuleMeal.toString());
    }
}
