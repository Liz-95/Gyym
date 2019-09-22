package za.ac.cput.domain.seasonalfood;

public class WinterLunch {
    private String ingridientsWl;
    private String dishNameWl;
    private double aCaloriesWl;

    public String getIngridientsWl() {
        return ingridientsWl;
    }

    public void setIngridientsWl(String ingridientsWl) {
        this.ingridientsWl = ingridientsWl;
    }

    public String getDishNameWl() {
        return dishNameWl;
    }

    public void setDishNameWl(String dishNameWl) {
        this.dishNameWl = dishNameWl;
    }

    public double getaCaloriesWl() {
        return aCaloriesWl;
    }

    public void setaCaloriesWl(double aCaloriesWl) {
        this.aCaloriesWl = aCaloriesWl;
    }

    @Override
    public String toString() {
        return "WinterLunch{" +
                "ingridientsWl='" + ingridientsWl + '\'' +
                ", dishNameWl='" + dishNameWl + '\'' +
                ", aCaloriesWl=" + aCaloriesWl +
                '}';
    }
}
