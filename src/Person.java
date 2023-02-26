public class Person {
    String name;
    Address address;
    String email;
    String phone;
    String salary;
    Person manager = null;

    private void verifyEmail(String email){
//        throw new IllegalArgumentException("Invalid Email ID");
    }

    private void verifyPhone(String phone){
//        throw new IllegalArgumentException("Invalid Phone");
    }

    public Person(String name,Address address, String email, String phone, String salary, Person manager){
        //Verification of email
        verifyEmail(email);

        //Verification of phone
        verifyPhone(phone);

        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.manager = manager;
    }
}
