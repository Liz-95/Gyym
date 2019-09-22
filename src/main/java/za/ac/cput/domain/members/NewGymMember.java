package za.ac.cput.domain.members;

public class NewGymMember {

    private String firstName, lastName, gender, emailAddress;
    private int gymId;

    public String getFirstName() {
        return firstName;
    }
    //GETTERS
    public String getLastName() {
        return lastName;
    }

    public int getGymId() {
      return getGymId();
    }

    public String getGender(){
        return gender;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    //SETTERS
    public void setLastName(String firstName){
        this.firstName=firstName;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "NewGymMember{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", gymId=" + gymId +
                '}';
    }
}
