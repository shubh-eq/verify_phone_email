import validation.*;

public class Person {
    String name;
    Address address;
    String email;
    String phone;
    String salary;
    Person manager;

    private void verifyEmail(String email){
        if(!EmailValidation.isValid(email)){
            throw new IllegalArgumentException("Invalid Email ID");
        }
    }

    private void verifyPhone(String phone){
        if(!PhoneValidation.isValid(phone)){
            throw new IllegalArgumentException("Invalid Phone");
        }
    }

    public void printPersonHierarchy(Person p){
        if(p==null){
            return;
        }
        printPersonHierarchy(p.manager);
        System.out.println(p.name);
        if(!p.equals(this)){
            System.out.println("   ↓   ");
        }
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

    //Used for Creating Initial Manager
    public Person(String name,Address address, String email, String phone, String salary){
        //Verification of email
        verifyEmail(email);

        //Verification of phone
        verifyPhone(phone);

        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.manager = null;
    }

}
