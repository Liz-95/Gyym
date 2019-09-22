package za.ac.cput.domain.seasonalfood;

public class SpringBreakfast {
    private String ingridientsSb;
    private String dishNameSb;
    private double aCaloriesSb;

    public String getIngridientsSb() {
        return ingridientsSb;
    }

    public void setIngridientsSb(String ingridientsSb) {
        this.ingridientsSb = ingridientsSb;
    }

    public String getDishNameSb() {
        return dishNameSb;
    }

    public void setDishNameSb(String dishNameSb) {
        this.dishNameSb = dishNameSb;
    }

    public double getaCaloriesSb() {
        return aCaloriesSb;
    }

    public void setaCaloriesSb(double aCaloriesSb) {
        this.aCaloriesSb = aCaloriesSb;
    }

    @Override
    public String toString() {
        return "SpringBreakfast{" +
                "ingridientsSb='" + ingridientsSb + '\'' +
                ", dishNameSb='" + dishNameSb + '\'' +
                ", aCaloriesSb=" + aCaloriesSb +
                '}';
    }
}
