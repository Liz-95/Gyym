package za.ac.cput.domain.exercises;

public class RussianTwist {
    private String weightRt;
    private String bmiRt;

    public String getWeightRt() {
        return weightRt;
    }

    public void setWeightRt(String weightRt) {
        this.weightRt = weightRt;
    }

    public String getBmiRt() {
        return bmiRt;
    }

    public void setBmiRt(String bmiRt) {
        this.bmiRt = bmiRt;
    }

    @Override
    public String toString() {
        return "RussianTwist{" +
                "weightRt='" + weightRt + '\'' +
                ", bmiRt='" + bmiRt + '\'' +
                '}';
    }
}
