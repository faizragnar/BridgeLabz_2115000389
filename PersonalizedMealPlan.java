import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    String getMealName();
}

class VegetarianMeal implements MealPlan {
    private String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }
}

class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }
}

class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }
}

class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }
}

class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public List<T> getMeals() {
        return meals;
    }
}

class MealPlanUtil {
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generated meal plan: " + meal.getMealName());
    }
}

public class PersonalizedMealPlan {
    public static void main(String[] args) {
        Meal<VeganMeal> veganMealPlan = new Meal<>();
        veganMealPlan.addMeal(new VeganMeal("Vegan Salad"));
        veganMealPlan.addMeal(new VeganMeal("Tofu Stir-fry"));

        Meal<HighProteinMeal> highProteinMealPlan = new Meal<>();
        highProteinMealPlan.addMeal(new HighProteinMeal("Grilled Chicken"));
        highProteinMealPlan.addMeal(new HighProteinMeal("Protein Shake"));

        System.out.println("Vegan Meal Plan:");
        for (VeganMeal meal : veganMealPlan.getMeals()) {
            MealPlanUtil.generateMealPlan(meal);
        }

        System.out.println("\nHigh Protein Meal Plan:");
        for (HighProteinMeal meal : highProteinMealPlan.getMeals()) {
            MealPlanUtil.generateMealPlan(meal);
        }
    }
}
