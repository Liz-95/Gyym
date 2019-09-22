package za.ac.cput.domain.seasonalfood;

public class AutumnDinner {

    private String ingridientsAd;
    private String dishNameAd;
    private double aCaloriesAd;

    public String getIngridientsAd() {
        return ingridientsAd;
    }

    public void setIngridientsAd(String ingridientsAd) {
        this.ingridientsAd = ingridientsAd;
    }

    public String getDishNameAd() {
        return dishNameAd;
    }

    public void setDishNameAd(String dishNameAd) {
        this.dishNameAd = dishNameAd;
    }

    public double getaCaloriesAd() {
        return aCaloriesAd;
    }

    public void setaCaloriesAd(double aCaloriesAd) {
        this.aCaloriesAd = aCaloriesAd;
    }

    @Override
    public String toString() {
        return "AutumnDinner{" +
                "ingridientsAd='" + ingridientsAd + '\'' +
                ", dishNameAd='" + dishNameAd + '\'' +
                ", aCaloriesAd=" + aCaloriesAd +
                '}';
    }
}
