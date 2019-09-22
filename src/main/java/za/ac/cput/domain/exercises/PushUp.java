package za.ac.cput.domain.exercises;

public class PushUp {
    private String weightUp;
    private String bmiUp;

    public String getWeightUp() {
        return weightUp;
    }

    public void setWeightUp(String weightUp) {
        this.weightUp = weightUp;
    }

    public String getBmiUp() {
        return bmiUp;
    }

    public void setBmiUp(String bmiUp) {
        this.bmiUp = bmiUp;
    }

    @Override
    public String toString() {
        return "PushUp{" +
                "weightUp='" + weightUp + '\'' +
                ", bmiUp='" + bmiUp + '\'' +
                '}';
    }
}
