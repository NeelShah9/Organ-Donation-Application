/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class WorkQueue {
    
    private ArrayList<workRequest> workrequestList;
    private ArrayList<workRequest> opoDoctorTodonorlist;
    private ArrayList<workRequest> adminToLegalReportList;
    private ArrayList<workRequest> adminToDoctorlist;
    private ArrayList<workRequest> doctorToDriverList;
    private ArrayList<workRequest> informDoctorlist;

    public WorkQueue() {
        this.workrequestList = new ArrayList<>();
        this.opoDoctorTodonorlist = new ArrayList<>();
        this.adminToLegalReportList = new ArrayList<>();
        this.adminToDoctorlist = new ArrayList<>();
        this.doctorToDriverList = new ArrayList<>();
        this.informDoctorlist = new ArrayList<>();
    }

    public ArrayList<workRequest> getInformDoctorlist() {
        return informDoctorlist;
    }
    

    public ArrayList<workRequest> getDoctorToDriverList() {
        return doctorToDriverList;
    }

    
    public ArrayList<workRequest> getWorkrequestList() {
        return workrequestList;
    }

    public ArrayList<workRequest> getOpoDoctorTodonorlist() {
        return opoDoctorTodonorlist;
    }

    public void setOpoDoctorTodonorlist(ArrayList<workRequest> opoDoctorTodonorlist) {
        this.opoDoctorTodonorlist = opoDoctorTodonorlist;
    }

    public ArrayList<workRequest> getAdminToLegalReportList() {
        return adminToLegalReportList;
    }

    public ArrayList<workRequest> getAdminToDoctorlist() {
        return adminToDoctorlist;
    }

    public void setAdminToDoctorlist(ArrayList<workRequest> adminToDoctorlist) {
        this.adminToDoctorlist = adminToDoctorlist;
    }
    
    public void DeleteDoctorOrganRequest(DoctorOrganRequest request){
        
       workrequestList.remove(request);
    }
    
}
