package interface_segregation.good;

public class FryerStation implements FryMeal{
    public Meal fryMeal() {
        return new Meal("stake");
    }
}
