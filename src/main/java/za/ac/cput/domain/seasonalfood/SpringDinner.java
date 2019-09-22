package za.ac.cput.domain.seasonalfood;

public class SpringDinner {
    private String ingridientsSd;
    private String dishNameSd;
    private double aCaloriesSd;


    public String getIngridientsSd() {
        return ingridientsSd;
    }

    public void setIngridientsSd(String ingridientsSd) {
        this.ingridientsSd = ingridientsSd;
    }

    public String getDishNameSd() {
        return dishNameSd;
    }

    public void setDishNameSd(String dishNameSd) {
        this.dishNameSd = dishNameSd;
    }

    public double getaCaloriesSd() {
        return aCaloriesSd;
    }

    public void setaCaloriesSd(double aCaloriesSd) {
        this.aCaloriesSd = aCaloriesSd;
    }

    @Override
    public String toString() {
        return "SpringDinner{" +
                "ingridientsSd='" + ingridientsSd + '\'' +
                ", dishNameSd='" + dishNameSd + '\'' +
                ", aCaloriesSd=" + aCaloriesSd +
                '}';
    }
}
