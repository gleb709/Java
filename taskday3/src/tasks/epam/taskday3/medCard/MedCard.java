package tasks.epam.taskday3.medCard;

public class MedCard {
    private int personID;
    private String personName;
    private String getPersonSurname;
    private String personAddress;
    private long personPhoneNumber;
    private int personMedCardNumber;
    private String personDiagnosis;

    public MedCard(){}

    @Override
    public String toString() {
        return "MedCard" +
                " Имя: " + personName +
                " Фамилия: " + getPersonSurname +
                " Адрес: " + personAddress +
                " Номер телефона: " + personPhoneNumber +
                " Номер мед.карты: " + personMedCardNumber +
                " Диагноз: " + personDiagnosis;
    }

    public MedCard(int personID, String personName, String getPersonSurname,
                   String personAddress, long personPhoneNumber, int personMedCardNumber, String personDiagnosis) {
        this.personID = personID;
        this.personName = personName;
        this.getPersonSurname = getPersonSurname;
        this.personAddress = personAddress;
        this.personPhoneNumber = personPhoneNumber;
        this.personMedCardNumber = personMedCardNumber;
        this.personDiagnosis = personDiagnosis;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSurname() {
        return getPersonSurname;
    }

    public void setPersonSurname(String getPersonSurname) {
        this.getPersonSurname = getPersonSurname;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public long getPersonPhoneNumber() {
        return personPhoneNumber;
    }

    public void setPersonPhoneNumber(long personPhoneNumber) {
        this.personPhoneNumber = personPhoneNumber;
    }

    public int getPersonMedCardNumber() {
        return personMedCardNumber;
    }

    public void setPersonMedCardNumber(int personMedCardNumber) {
        this.personMedCardNumber = personMedCardNumber;
    }

    public String getPersonDiagnosis() {
        return personDiagnosis;
    }

    public void setPersonDiagnosis(String personDiagnosis) {
        this.personDiagnosis = personDiagnosis;
    }
}
