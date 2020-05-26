public class User {
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String userName;
    private String password;
    public final static String TAG = "hahahahahhahahaha";

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(){
    }

    private Boolean passwordIsCorrect(String password,User user){
        if (password==user.password){
            return true;
        }else {
            return false;
        }
    }

    public String printf(){
        return "用户名："+getUserName()+"\n"+"密码："+getPassword();
    }

}
