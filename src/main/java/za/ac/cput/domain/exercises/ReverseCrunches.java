package za.ac.cput.domain.exercises;

public class ReverseCrunches {

    private String weightRc;
    private String bmiRc;

    public String getWeightRc() {
        return weightRc;
    }

    public void setWeightRc(String weightRc) {
        this.weightRc = weightRc;
    }

    public String getBmiRc() {
        return bmiRc;
    }

    public void setBmiRc(String bmiRc) {
        this.bmiRc = bmiRc;
    }

    @Override
    public String toString() {
        return "ReverseCrunches{" +
                "weightRc='" + weightRc + '\'' +
                ", bmiRc='" + bmiRc + '\'' +
                '}';
    }
}
