package za.ac.cput.domain.exercises;

public class BirdDog {
    private String weight;
    private String bmi;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    @Override
    public String toString() {
        return "BirdDog{" +
                "weight='" + weight + '\'' +
                ", bmi='" + bmi + '\'' +
                '}';
    }
}

