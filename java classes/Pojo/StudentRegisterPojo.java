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
public class StudentRegisterPojo {
    String firstName;
    String lastName;
    String studentId;
    String dob;
    String department;
    String qualification;
    String doj;
    String gender;
    String mobileNo;
    String email;
    String bio;
    String type;

    public StudentRegisterPojo(String firstName, String lastName, String studentId, String dob, String department, String qualification, String doj, String gender, String mobileNo, String email, String bio, String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.dob = dob;
        this.department = department;
        this.qualification = qualification;
        this.doj = doj;
        this.gender = gender;
        this.mobileNo = mobileNo;
        this.email = email;
        this.bio = bio;
        this.type = type;
    }

    @Override
    public String toString() {
        return "StudentRegisterPojo{" + "firstName=" + firstName + ", lastName=" + lastName + ", studentId=" + studentId + ", dob=" + dob + ", department=" + department + ", qualification=" + qualification + ", doj=" + doj + ", gender=" + gender + ", mobileNo=" + mobileNo + ", email=" + email + ", bio=" + bio + ", type=" + type + '}';
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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
