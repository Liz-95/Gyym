package za.ac.cput.domain.exercises;

public class Yoga {
    private String weightY;
    private String bmiY;

    public String getWeightY() {
        return weightY;
    }

    public void setWeightY(String weightY) {
        this.weightY = weightY;
    }

    public String getBmiY() {
        return bmiY;
    }

    public void setBmiY(String bmiY) {
        this.bmiY = bmiY;
    }

    @Override
    public String toString() {
        return "Yoga{" +
                "weightY='" + weightY + '\'' +
                ", bmiY='" + bmiY + '\'' +
                '}';
    }
}
