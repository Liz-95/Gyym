package za.ac.cput.domain.seasonalfood;

public class WinterDinner {
    private String ingridientsWd;
    private String dishNameWd;
    private double aCaloriesWd;

    public String getIngridientsWd() {
        return ingridientsWd;
    }

    public void setIngridientsWd(String ingridientsWd) {
        this.ingridientsWd = ingridientsWd;
    }

    public String getDishNameWd() {
        return dishNameWd;
    }

    public void setDishNameWd(String dishNameWd) {
        this.dishNameWd = dishNameWd;
    }

    public double getaCaloriesWd() {
        return aCaloriesWd;
    }

    public void setaCaloriesWd(double aCaloriesWd) {
        this.aCaloriesWd = aCaloriesWd;
    }

    @Override
    public String toString() {
        return "WinterDinner{" +
                "ingridientsWd='" + ingridientsWd + '\'' +
                ", dishNameWd='" + dishNameWd + '\'' +
                ", aCaloriesWd=" + aCaloriesWd +
                '}';
    }
}
