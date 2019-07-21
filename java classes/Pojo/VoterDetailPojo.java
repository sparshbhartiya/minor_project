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
public class VoterDetailPojo {
    private String voterId;
    private String voterType;
    private String voterBranch;
    private String voterfName;
    private String voterlName;

    public VoterDetailPojo(String voterId, String voterType, String voterBranch, String voterfName, String voterlName) {
        this.voterId = voterId;
        this.voterType = voterType;
        this.voterBranch = voterBranch;
        this.voterfName = voterfName;
        this.voterlName = voterlName;
    }

    

    @Override
    public String toString() {
        return "VoterDetailPojo{" + "voterId=" + voterId + ", voterType=" + voterType + ", voterBranch=" + voterBranch + ", voterfName=" + voterfName + ", voterlName=" + voterlName + '}';
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getVoterType() {
        return voterType;
    }

    public void setVoterType(String voterType) {
        this.voterType = voterType;
    }

    public String getVoterBranch() {
        return voterBranch;
    }

    public void setVoterBranch(String voterBranch) {
        this.voterBranch = voterBranch;
    }

    public String getVoterfName() {
        return voterfName;
    }

    public void setVoterfName(String voterfName) {
        this.voterfName = voterfName;
    }

    public String getVoterlName() {
        return voterlName;
    }

    public void setVoterlName(String voterlName) {
        this.voterlName = voterlName;
    }

}