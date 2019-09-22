package za.ac.cput.domain.members;

import java.security.KeyStore;

public class GymMember {

    private String firstName, lastName, emailAddresss;
    private int gymId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddresss() {
        return emailAddresss;
    }

    public void setEmailAddresss(String emailAddresss) {
        this.emailAddresss = emailAddresss;
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    @Override
    public String toString() {
        return "GymMember{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddresss='" + emailAddresss + '\'' +
                ", gymId=" + gymId +
                '}';
    }
}
