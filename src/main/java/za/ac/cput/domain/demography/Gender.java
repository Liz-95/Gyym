package za.ac.cput.domain.demography;



public class Gender {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id='" + id + '\'' +
                '}';
    }
}
