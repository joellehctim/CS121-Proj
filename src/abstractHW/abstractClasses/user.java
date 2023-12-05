package abstractHW.abstractClasses;

public abstract class user {
    private String email, password;

    public user(String email, String password){
        this.email = email;
        this.password = password;}

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;}

    public void setPassword(String password){
        this.password = password;

    }
@Override
    public String toString(){
        return String.format("Email: %s \n Password %s\n", getEmail(), getPassword());
    }
    public abstract String createuserID();
}
