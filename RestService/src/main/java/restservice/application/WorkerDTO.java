package restservice.application;

import com.infosys.serviceBuilder.model.staff_roster;

public class WorkerDTO extends StuffDTO {

    String position;
    String employmentDate;
    int salary;
    String workPhoneNumber;
    String mobilePhoneNumber;
    String bank;
    boolean archiveStatus;

    public WorkerDTO(staff_roster str) {
        super(str);
        this.position = str.getPosition();
        this.employmentDate = str.getEmployment_date().toString();
        this.salary = str.getSalary();
        this.workPhoneNumber = str.getWork_phone_num();
        this.mobilePhoneNumber = str.getMobile_phone_num();
        this.bank = str.getBank();
        this.archiveStatus = str.isArchive();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public boolean isArchiveStatus() {
        return archiveStatus;
    }

    public void setArchiveStatus(boolean archiveStatus) {
        this.archiveStatus = archiveStatus;
    }
}
