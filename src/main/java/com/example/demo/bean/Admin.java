package com.example.demo.bean;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "id")
    private int id;

    @Column(name = "account")
    private String account;

    @Column(name = "passwd")
    private String passwd;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }


    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}
