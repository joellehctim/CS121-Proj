package abstractHW.abstractClasses;

public class employee extends user{
 private int id;
    public employee(String email, String password, int id) {
        super(email, password);
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String toString() {
        return String.format("Email: %s \n Password %s\nID:%d\n", getEmail(), getPassword(),id );
    }
    @Override
    public String createuserID(){
        return String.format("%s%s",getEmail(),id);
    }


}
