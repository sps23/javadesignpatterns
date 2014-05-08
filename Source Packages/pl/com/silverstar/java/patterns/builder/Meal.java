package pl.com.silverstar.java.patterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sylwester.stocki
 */
public class Meal {

    private final List<MealItem> mealItems = new ArrayList<>();

    public void addMealItem(MealItem mealItem) {
        mealItems.add(mealItem);
    }

    public float getCost() {
        float cost = 0.0f;
        cost = mealItems.stream().map((item) -> item.price()).reduce(cost, (accumulator, _item) -> accumulator + _item);
        return cost;
    }

    public void showItems() {
        mealItems.stream().map((item) -> {
            System.out.print("MealItem : " + item.name());
            return item;
        }).map((item) -> {
            System.out.print(", Packing : " + item.packing().pack());
            return item;
        }).forEach((item) -> {
            System.out.println(", Price : " + item.price());
        });
    }
}
