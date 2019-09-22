package za.ac.cput.domain.seasonalfood;

public class SummerDinner {
    private String ingridientsDd;
    private String dishNameDd;
    private double aCaloriesDd;

    public String getIngridientsDd() {
        return ingridientsDd;
    }

    public void setIngridientsDd(String ingridientsDd) {
        this.ingridientsDd = ingridientsDd;
    }

    public String getDishNameDd() {
        return dishNameDd;
    }

    public void setDishNameDd(String dishNameDd) {
        this.dishNameDd = dishNameDd;
    }

    public double getaCaloriesDd() {
        return aCaloriesDd;
    }

    public void setaCaloriesDd(double aCaloriesDd) {
        this.aCaloriesDd = aCaloriesDd;
    }

    @Override
    public String toString() {
        return "SummerDinner{" +
                "ingridientsDd='" + ingridientsDd + '\'' +
                ", dishNameDd='" + dishNameDd + '\'' +
                ", aCaloriesDd=" + aCaloriesDd +
                '}';
    }
}
