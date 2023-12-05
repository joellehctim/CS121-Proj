package overLoaded.packageDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetailTest {

    @Test
    void getStaff() {
        Retail Target = new Retail("John", 4);
        int staff = Target.getStaff();
        assertEquals(4, staff);

    }


    @Test
    void getManager() {
        Retail Walmart = new Retail("Brian");
        String manager = Retail.getManager();
        assertEquals("Brian", manager);

    }
}