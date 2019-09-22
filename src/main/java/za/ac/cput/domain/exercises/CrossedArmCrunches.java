package za.ac.cput.domain.exercises;

public class CrossedArmCrunches {
    private String weightC;
    private String bmiC;

    public String getWeightC() {
        return weightC;
    }

    public void setWeightC(String weightC) {
        this.weightC = weightC;
    }

    public String getBmiC() {
        return bmiC;
    }

    public void setBmiC(String bmiC) {
        this.bmiC = bmiC;
    }

    @Override
    public String toString() {
        return "CrossedArmCrunches{" +
                "weightC='" + weightC + '\'' +
                ", bmiC='" + bmiC + '\'' +
                '}';
    }
}
