package za.ac.cput.domain.exercises;

public class SwimmerAndSuperman {
    private String weightS;
    private String bmiS;

    public String getWeightS() {
        return weightS;
    }

    public void setWeightS(String weightS) {
        this.weightS = weightS;
    }

    public String getBmiS() {
        return bmiS;
    }

    public void setBmiS(String bmiS) {
        this.bmiS = bmiS;
    }

    @Override
    public String toString() {
        return "SwimmerAndSuperman{" +
                "weightS='" + weightS + '\'' +
                ", bmiS='" + bmiS + '\'' +
                '}';
    }
}
