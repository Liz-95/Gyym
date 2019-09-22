package za.ac.cput.domain.seasonalfood;

public class SpringLunch {
    private String ingridientsSl;
    private String dishNameSl;
    private double aCaloriesSl;

    public String getIngridientsSl() {
        return ingridientsSl;
    }

    public void setIngridientsSl(String ingridientsSl) {
        this.ingridientsSl = ingridientsSl;
    }

    public String getDishNameSl() {
        return dishNameSl;
    }

    public void setDishNameSl(String dishNameSl) {
        this.dishNameSl = dishNameSl;
    }

    public double getaCaloriesSl() {
        return aCaloriesSl;
    }

    public void setaCaloriesSl(double aCaloriesSl) {
        this.aCaloriesSl = aCaloriesSl;
    }

    @Override
    public String toString() {
        return "SpringLunch{" +
                "ingridientsSl='" + ingridientsSl + '\'' +
                ", dishNameSl='" + dishNameSl + '\'' +
                ", aCaloriesSl=" + aCaloriesSl +
                '}';
    }
}
