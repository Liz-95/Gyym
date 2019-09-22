package za.ac.cput.domain.seasonalfood;

public class WinterSnack {
    private String ingridientsWs;
    private String dishNameWs;
    private double aCaloriesWs;


    public String getIngridientsWs() {
        return ingridientsWs;
    }

    public void setIngridientsWs(String ingridientsWs) {
        this.ingridientsWs = ingridientsWs;
    }

    public String getDishNameWs() {
        return dishNameWs;
    }

    public void setDishNameWs(String dishNameWs) {
        this.dishNameWs = dishNameWs;
    }

    public double getaCaloriesWs() {
        return aCaloriesWs;
    }

    public void setaCaloriesWs(double aCaloriesWs) {
        this.aCaloriesWs = aCaloriesWs;
    }

    @Override
    public String toString() {
        return "WinterSnack{" +
                "ingridientsWs='" + ingridientsWs + '\'' +
                ", dishNameWs='" + dishNameWs + '\'' +
                ", aCaloriesWs=" + aCaloriesWs +
                '}';
    }
}
