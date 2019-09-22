package za.ac.cput.domain.exercises;

public class DeadBug {
    private String weightD;
    private String bmiD;


    public String getWeightD() {
        return weightD;
    }

    public void setWeightD(String weightD) {
        this.weightD = weightD;
    }

    public String getBmiD() {
        return bmiD;
    }

    public void setBmiD(String bmiD) {
        this.bmiD = bmiD;
    }

    @Override
    public String toString() {
        return "DeadBug{" +
                "weightD='" + weightD + '\'' +
                ", bmiD='" + bmiD + '\'' +
                '}';
    }
}
