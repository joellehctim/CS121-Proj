package abstractHW.interfaces;

import abstractHW.abstractClasses.customer;
import abstractHW.abstractClasses.employee;

public class userTest {
    public static void main(String[] args) {
        abstractHW.abstractClasses.employee employee1 = new employee("Joe@gmail.com", "1234", 101);
        abstractHW.abstractClasses.customer customer1 = new customer("John@gmail.com", "4321", 1500);

        System.out.println(customer1.createuserID());

    }



}
