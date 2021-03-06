package org.tianjyan.pwd.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Password extends RealmObject {
    @PrimaryKey
    private String id;
    private long publish;
    private String title;
    private String userName;
    private String password;
    private String payPassword;
    private String note;
    private String groupName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getPublish() {
        return publish;
    }

    public void setPublish(long publish) {
        this.publish = publish;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

}
