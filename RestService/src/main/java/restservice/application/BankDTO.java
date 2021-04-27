package restservice.application;

import com.infosys.serviceBuilder.model.banks;

public class BankDTO {

    String name;
    String bik;
    String address;

    public BankDTO(banks bank) {
        this.name = bank.getBank_name();
        this.bik = bank.getBik();
        this.address = bank.getAddress();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBik() {
        return bik;
    }

    public void setBik(String bik) {
        this.bik = bik;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
