package restservice.application;

import com.infosys.serviceBuilder.model.staff_roster;

public class StuffDTO {

    int id;
    String lastName;
    String firstName;
    String middleName;
    String birthDate;

    public StuffDTO(staff_roster str) {
        this.id = str.getWorker_id();
        this.lastName = str.getLast_name();
        this.firstName = str.getFirst_name();
        this.middleName = str.getMiddle_name();
        this.birthDate = str.getBirth_date().toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
