package za.ac.cput.domain.seasonalfood;

public class AutumnLunch {
    private String ingridientsAl;
    private String dishNameAl;
    private double aCaloriesAl;

    public String getIngridientsAl() {
        return ingridientsAl;
    }

    public void setIngridientsAl(String ingridientsAl) {
        this.ingridientsAl = ingridientsAl;
    }

    public String getDishNameAl() {
        return dishNameAl;
    }

    public void setDishNameAl(String dishNameAl) {
        this.dishNameAl = dishNameAl;
    }

    public double getaCaloriesAl() {
        return aCaloriesAl;
    }

    public void setaCaloriesAl(double aCaloriesAl) {
        this.aCaloriesAl = aCaloriesAl;
    }

    @Override
    public String toString() {
        return "AutumnLunch{" +
                "ingridientsAl='" + ingridientsAl + '\'' +
                ", dishNameAl='" + dishNameAl + '\'' +
                ", aCaloriesAl=" + aCaloriesAl +
                '}';
    }
}
