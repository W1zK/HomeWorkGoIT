
public class Users {
    private int userId;
    private String userName;
    private String email;
    private String signUp;
    boolean ifSend;


    public Users(int userId, String userName, String email, String signUp, boolean sender) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.signUp = signUp;
        this.ifSend = sender;
    }

    public int getUserId() {
        return userId;
    }


    public String getUserName() {
        return userName;
    }


    public String getEmail() {
        return email;
    }


}
