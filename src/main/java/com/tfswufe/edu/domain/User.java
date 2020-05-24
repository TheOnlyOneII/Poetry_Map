package com.tfswufe.edu.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String user_id;
    private String user_name;
    private String user_password;
    private String user_gender;
    private String user_phone;
    private String user_address;
    private String user_heading;
    private int user_role;
    private int user_status;
    private Date user_last_login;
    private Date user_now_login;
    private int user_ip;

    public User() {
    }

    public User(String user_id, String user_name, String user_password, String user_gender, String user_phone, String user_address, String user_heading, int user_role, int user_status, Date user_last_login, Date user_now_login, int user_ip) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_gender = user_gender;
        this.user_phone = user_phone;
        this.user_address = user_address;
        this.user_heading = user_heading;
        this.user_role = user_role;
        this.user_status = user_status;
        this.user_last_login = user_last_login;
        this.user_now_login = user_now_login;
        this.user_ip = user_ip;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_heading() {
        return user_heading;
    }

    public void setUser_heading(String user_heading) {
        this.user_heading = user_heading;
    }

    public int getUser_role() {
        return user_role;
    }

    public void setUser_role(int user_role) {
        this.user_role = user_role;
    }

    public int getUser_status() {
        return user_status;
    }

    public void setUser_status(int user_status) {
        this.user_status = user_status;
    }

    public Date getUser_last_login() {
        return user_last_login;
    }

    public void setUser_last_login(Date user_last_login) {
        this.user_last_login = user_last_login;
    }

    public Date getUser_now_login() {
        return user_now_login;
    }

    public void setUser_now_login(Date user_now_login) {
        this.user_now_login = user_now_login;
    }

    public int getUser_ip() {
        return user_ip;
    }

    public void setUser_ip(int user_ip) {
        this.user_ip = user_ip;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_gender='" + user_gender + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_address='" + user_address + '\'' +
                ", user_heading='" + user_heading + '\'' +
                ", user_role=" + user_role +
                ", user_status=" + user_status +
                ", user_last_login=" + user_last_login +
                ", user_now_login=" + user_now_login +
                ", user_ip=" + user_ip +
                '}';
    }
}
