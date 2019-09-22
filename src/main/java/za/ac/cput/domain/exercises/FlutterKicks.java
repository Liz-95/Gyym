package za.ac.cput.domain.exercises;

public class FlutterKicks {
    private String weightF;
    private String bmiF;

    public String getWeightF() {
        return weightF;
    }

    public void setWeightF(String weightF) {
        this.weightF = weightF;
    }

    public String getBmiF() {
        return bmiF;
    }

    public void setBmiF(String bmiF) {
        this.bmiF = bmiF;
    }

    @Override
    public String toString() {
        return "FlutterKicks{" +
                "weightF='" + weightF + '\'' +
                ", bmiF='" + bmiF + '\'' +
                '}';
    }
}
