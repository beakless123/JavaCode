package Data;

public class User {
    private String userName;
    private String userPass;

    public User() {
    }

    public User(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return userPass
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * 设置
     * @param userPass
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String toString() {
        return "Data.User{userName = " + userName + ", userPass = " + userPass + "}";
    }
}
