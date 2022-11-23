package com.itheima.dome1.StudentManageSystem2;

public class StudentPlus {
    private String userName;
    private String password;
    private String identity;
    private String phone;

    public StudentPlus() {
    }

    public StudentPlus(String userName, String password, String identity, String phone) {
        this.userName = userName;
        this.password = password;
        this.identity = identity;
        this.phone = phone;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * 设置
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "StudentPlus{userName = " + userName + ", password = " + password + ", identity = " + identity + ", phone = " + phone + "}";
    }
}
