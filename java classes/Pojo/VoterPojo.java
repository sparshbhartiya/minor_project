/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author saura
 */
public class VoterPojo {
    private String userId;
    private String password;
    private String userType;
    private String userBranch;
    private String userfName;
    private String userlName;

    public VoterPojo() {
    }

    public VoterPojo(String userId, String password, String userType, String userBranch) {
        this.userId = userId;
        this.password = password;
        this.userType = userType;
        this.userBranch = userBranch;
    }

    @Override
    public String toString() {
        return "VoterPojo{" + "userId=" + userId + ", password=" + password + ", userType=" + userType + ", userBranch=" + userBranch + ", userfName=" + userfName + ", userlName=" + userlName + '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserBranch() {
        return userBranch;
    }

    public void setUserBranch(String userBranch) {
        this.userBranch = userBranch;
    }

    public String getUserfName() {
        return userfName;
    }

    public void setUserfName(String userfName) {
        this.userfName = userfName;
    }

    public String getUserlName() {
        return userlName;
    }

    public void setUserlName(String userlName) {
        this.userlName = userlName;
    }

    
}
