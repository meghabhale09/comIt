package accounts;

public class Person {
    private String firstName;
    private String lasttName;
    private  int phoneNumber;

    public Person(String firstName, String lasttName, int phoneNumber) throws Exception {
        this.firstName = firstName;
        this.lasttName = lasttName;
        if(chkphoneNumber(phoneNumber)){
           this.phoneNumber = phoneNumber;
        }else
            throw new Exception("Invalid Phone Number");
    }

    public boolean chkphoneNumber(int phoneNumber){
        String strPhoneNum = String.valueOf(phoneNumber);
       return strPhoneNum.length()==9;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lasttName='" + lasttName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
