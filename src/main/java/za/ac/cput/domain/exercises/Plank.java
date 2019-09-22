package za.ac.cput.domain.exercises;

public class Plank {
    private String weightP;
    private String bmiP;

    public String getWeightP() {
        return weightP;
    }

    public void setWeightP(String weightP) {
        this.weightP = weightP;
    }

    public String getBmiP() {
        return bmiP;
    }

    public void setBmiP(String bmiP) {
        this.bmiP = bmiP;
    }

    @Override
    public String toString() {
        return "Plank{" +
                "weightP='" + weightP + '\'' +
                ", bmiP='" + bmiP + '\'' +
                '}';
    }
}
