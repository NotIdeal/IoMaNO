package interface_segregation.good;

public class GrillStation implements GrillMeal {
    public Meal grillMeal() {
        return new Meal("barbecue");
    }
}
