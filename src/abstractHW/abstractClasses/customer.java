package abstractHW.abstractClasses;

public class customer extends user {
 private int loyaltyPoints;
private String email, password;
    public customer(String email, String password, int loyaltyPoints) {
        super(email, password);
        this.loyaltyPoints = loyaltyPoints;}
    public int getLoyaltyPoints(){
        return loyaltyPoints;}

    public void setLoyaltyPoints(int loyaltyPoints){
        this.loyaltyPoints = loyaltyPoints;}

    @Override
    public String toString() {
        return String.format("Email: %s \nPassword %s\nLoyalty Points: %d", getEmail(), getPassword(), getLoyaltyPoints());
    }
    @Override
    public String createuserID(){
        return String.format("%s1234",getEmail());
    }
    }

