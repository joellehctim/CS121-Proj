package WeekThree;
import javax.swing.* ;
public class SwitchActivity {
    public static void main(String[] args) {
        String planet = JOptionPane.showInputDialog("Enter a planet to determine distance from sun:");

        switch (planet.toUpperCase()) {
            case "EARTH":
                System.out.println("Earth is 93 million miles from sun");
                break;
            case "JUPITER":
                System.out.println("Jupiter is 484 million miles from sun");
                break;
            case "SATURN":
                System.out.println("Saturn is 907 million miles from sun");
                break;
            case "VENUS":
                System.out.println("Venus is 67 million miles from sun");
                break;
            case "MARS":
                System.out.println("Mars is 151 million miles from sun");
                break;
            case "MERCURY":
                System.out.println("Mercury is 32 million miles from sun");
                break;
            case "NEPTUNE":
                System.out.println("Neptune is 2.8 billion miles from sun");
                break;
            case "URANUS":
                System.out.println("Uranus is 1.8 billion miles from sun");
                break;
        }
    }
}