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
public class CandDetailPojo {
    private String candId;
    private String candType;
    private String candFname;

    public CandDetailPojo(String candId, String candType, String candFname, String candLname) {
        this.candId = candId;
        this.candType = candType;
        this.candFname = candFname;
        this.candLname = candLname;
    }

    @Override
    public String toString() {
        return "CandDetailPojo{" + "candId=" + candId + ", candType=" + candType + ", candFname=" + candFname + ", candLname=" + candLname + '}';
    }

    public String getCandId() {
        return candId;
    }

    public void setCandId(String candId) {
        this.candId = candId;
    }

    public String getCandType() {
        return candType;
    }

    public void setCandType(String candType) {
        this.candType = candType;
    }

    public String getCandFname() {
        return candFname;
    }

    public void setCandFname(String candFname) {
        this.candFname = candFname;
    }

    public String getCandLname() {
        return candLname;
    }

    public void setCandLname(String candLname) {
        this.candLname = candLname;
    }
    private String candLname;

}
