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
public class ViewResultPojo {
    String id;
    String fname;
    String lname;
    String vcount;    

    public ViewResultPojo() {
        
    }

    @Override
    public String toString() {
        return "ViewResultPojo{" + "id=" + id + ", fname=" + fname + ", lname=" + lname + ", vcount=" + vcount + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getVcount() {
        return vcount;
    }

    public void setVcount(String vcount) {
        this.vcount = vcount;
    }
    
    
}
