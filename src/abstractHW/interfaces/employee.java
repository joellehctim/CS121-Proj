package abstractHW.interfaces;

import abstractHW.abstractClasses.user;

public class employee implements userID {
 private int id;
 private String email, password;
    public employee(String email, String password, int id) {
        this.email = email;
        this.password = password;
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
        return String.format("Email: %s \n Password %s\nID:%d\n", email, password,id );
    }
    @Override
    public String createuserID(){
        return String.format("%s%s",email,id);
    }


}
