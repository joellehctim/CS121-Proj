package abstractHW.abstractClasses;

public class userTest {
    public static void main(String[] args) {
        employee employee1 = new employee("Joe@gmail.com", "1234", 101);
        customer customer1 = new customer("John@gmail.com", "4321", 1500);
        System.out.println(employee1.createuserID());
        System.out.println(customer1.createuserID());

    }



}
