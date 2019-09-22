package za.ac.cput.domain.seasonalfood;

public class SummerSnack {
    private String ingridientsSm;
    private String dishNameSm;
    private double aCaloriesSm;

    public String getIngridientsSm() {
        return ingridientsSm;
    }

    public void setIngridientsSm(String ingridientsSm) {
        this.ingridientsSm = ingridientsSm;
    }

    public String getDishNameSm() {
        return dishNameSm;
    }

    public void setDishNameSm(String dishNameSm) {
        this.dishNameSm = dishNameSm;
    }

    public double getaCaloriesSm() {
        return aCaloriesSm;
    }

    public void setaCaloriesSm(double aCaloriesSm) {
        this.aCaloriesSm = aCaloriesSm;
    }

    @Override
    public String toString() {
        return "SummerSnack{" +
                "ingridientsSm='" + ingridientsSm + '\'' +
                ", dishNameSm='" + dishNameSm + '\'' +
                ", aCaloriesSm=" + aCaloriesSm +
                '}';
    }
}
