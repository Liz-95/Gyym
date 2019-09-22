package za.ac.cput.domain.seasonalfood;



public class AutumnBreakfast {

    private String ingridients;
    private String dishName;
    private double aCalories;

    public String getIngridients() {
        return ingridients;
    }

    public void setIngridients(String ingridients) {
        this.ingridients = ingridients;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getaCalories() {
        return aCalories;
    }

    public void setaCalories(double aCalories) {
        this.aCalories = aCalories;
    }

    @Override
    public String toString() {
        return "AutumnBreakfast{" +
                "ingridients='" + ingridients + '\'' +
                ", dishName='" + dishName + '\'' +
                ", aCalories=" + aCalories +
                '}';
    }
}
