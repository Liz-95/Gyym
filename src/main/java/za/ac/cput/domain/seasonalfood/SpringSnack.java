package za.ac.cput.domain.seasonalfood;

public class SpringSnack {
    private String ingridientsSs;
    private String dishNameSs;
    private double aCaloriesSs;

    public String getIngridientsSs() {
        return ingridientsSs;
    }

    public void setIngridientsSs(String ingridientsSs) {
        this.ingridientsSs = ingridientsSs;
    }

    public String getDishNameSs() {
        return dishNameSs;
    }

    public void setDishNameSs(String dishNameSs) {
        this.dishNameSs = dishNameSs;
    }

    public double getaCaloriesSs() {
        return aCaloriesSs;
    }

    public void setaCaloriesSs(double aCaloriesSs) {
        this.aCaloriesSs = aCaloriesSs;
    }

    @Override
    public String toString() {
        return "SpringSnack{" +
                "ingridientsSs='" + ingridientsSs + '\'' +
                ", dishNameSs='" + dishNameSs + '\'' +
                ", aCaloriesSs=" + aCaloriesSs +
                '}';
    }
}
