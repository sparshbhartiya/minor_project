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
public class VoterRegisterPojo {
    String firstName;
    String lastName;
    String voterId;
    String dob;
    String branch;
    String year;
    String gender;
    String votertype;
    String phone;
    String email;
    String password;
    String aadharno;

    public VoterRegisterPojo(String firstName, String lastName, String voterId, String dob, String branch, String year, String gender, String votertype, String phone, String email, String password,String aadharno) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.voterId = voterId;
        this.dob = dob;
        this.branch = branch;
        this.year = year;
        this.gender = gender;
        this.votertype = votertype;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public String getAadharno() {
        return aadharno;
    }

    public void setAadharno(String aadharno) {
        this.aadharno = aadharno;
    }

    @Override
    public String toString() {
        return "VoterRegisterPojo{" + "firstName=" + firstName + ", lastName=" + lastName + ", voterId=" + voterId + ", dob=" + dob + ", branch=" + branch + ", year=" + year + ", gender=" + gender + ", votertype=" + votertype + ", phone=" + phone + ", email=" + email + ", password=" + password + '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getVotertype() {
        return votertype;
    }

    public void setVotertype(String votertype) {
        this.votertype = votertype;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
}
