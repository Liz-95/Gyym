package za.ac.cput.domain.seasonalfood;

public class WinterBreakfast {
    private String ingridientsWb;
    private String dishNameWb;
    private double aCaloriesWb;

    public String getIngridientsWb() {
        return ingridientsWb;
    }

    public void setIngridientsWb(String ingridientsWb) {
        this.ingridientsWb = ingridientsWb;
    }

    public String getDishNameWb() {
        return dishNameWb;
    }

    public void setDishNameWb(String dishNameWb) {
        this.dishNameWb = dishNameWb;
    }

    public double getaCaloriesWb() {
        return aCaloriesWb;
    }

    public void setaCaloriesWb(double aCaloriesWb) {
        this.aCaloriesWb = aCaloriesWb;
    }

    @Override
    public String toString() {
        return "WinterBreakfast{" +
                "ingridientsWb='" + ingridientsWb + '\'' +
                ", dishNameWb='" + dishNameWb + '\'' +
                ", aCaloriesWb=" + aCaloriesWb +
                '}';
    }
}
