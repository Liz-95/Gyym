package za.ac.cput.domain.seasonalfood;

public class SummerBreakfast {
    private String ingridientsBb;
    private String dishNameBb;
    private double aCaloriesBb;

    public String getIngridientsBb() {
        return ingridientsBb;
    }

    public void setIngridientsBb(String ingridientsBb) {
        this.ingridientsBb = ingridientsBb;
    }

    public String getDishNameBb() {
        return dishNameBb;
    }

    public void setDishNameBb(String dishNameBb) {
        this.dishNameBb = dishNameBb;
    }

    public double getaCaloriesBb() {
        return aCaloriesBb;
    }

    public void setaCaloriesBb(double aCaloriesBb) {
        this.aCaloriesBb = aCaloriesBb;
    }

    @Override
    public String toString() {
        return "SummerBreakfast{" +
                "ingridientsBb='" + ingridientsBb + '\'' +
                ", dishNameBb='" + dishNameBb + '\'' +
                ", aCaloriesBb=" + aCaloriesBb +
                '}';
    }
}
