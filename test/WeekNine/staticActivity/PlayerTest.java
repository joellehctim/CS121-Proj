package WeekNine.staticActivity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @BeforeEach
    public void setUp(){
        Player ron = new Player("Ron", 14, 5);
        Player don = new Player("Don", 7, 3);
    }

    @Test
    public void testInstanceCount() {
        int instances = Player.getInstanceCount();
        assertEquals(2, instances);

    }
}