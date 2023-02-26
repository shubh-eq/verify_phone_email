public class Main {
    public static void main(String[] args) {
        //Creating Address
        Address addr = new Address("Near X road","Chennai","Tamil Nadu","600127");

        try{
            //Creating Manager 1
            Person manager1 = new Person("manager1",addr,"manager1@example.com","9123456789","1000");

            //Creating Employee 1
            Person employee1 = new Person("person1",addr,"employee1@example.com","9132456789","100",manager1);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}