package za.ac.cput.domain.seasonalfood;

public class AutumnSnack {
    private String ingridientsAs;
    private String dishNameAs;
    private double aCaloriesAs;

    public String getIngridientsAs() {
        return ingridientsAs;
    }

    public void setIngridientsAs(String ingridientsAs) {
        this.ingridientsAs = ingridientsAs;
    }

    public String getDishNameAs() {
        return dishNameAs;
    }

    public void setDishNameAs(String dishNameAs) {
        this.dishNameAs = dishNameAs;
    }

    public double getaCaloriesAs() {
        return aCaloriesAs;
    }

    public void setaCaloriesAs(double aCaloriesAs) {
        this.aCaloriesAs = aCaloriesAs;
    }

    @Override
    public String toString() {
        return "AutumnSnack{" +
                "ingridientsAs='" + ingridientsAs + '\'' +
                ", dishNameAs='" + dishNameAs + '\'' +
                ", aCaloriesAs=" + aCaloriesAs +
                '}';
    }
}
