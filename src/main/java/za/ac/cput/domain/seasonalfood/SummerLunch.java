package za.ac.cput.domain.seasonalfood;

public class SummerLunch {
    private String ingridientsLL;
    private String dishNameLl;
    private double aCaloriesLl;

    public String getIngridientsLL() {
        return ingridientsLL;
    }

    public void setIngridientsLL(String ingridientsLL) {
        this.ingridientsLL = ingridientsLL;
    }

    public String getDishNameLl() {
        return dishNameLl;
    }

    public void setDishNameLl(String dishNameLl) {
        this.dishNameLl = dishNameLl;
    }

    public double getaCaloriesLl() {
        return aCaloriesLl;
    }

    public void setaCaloriesLl(double aCaloriesLl) {
        this.aCaloriesLl = aCaloriesLl;
    }

    @Override
    public String toString() {
        return "SummerLunch{" +
                "ingridientsLL='" + ingridientsLL + '\'' +
                ", dishNameLl='" + dishNameLl + '\'' +
                ", aCaloriesLl=" + aCaloriesLl +
                '}';
    }
}
