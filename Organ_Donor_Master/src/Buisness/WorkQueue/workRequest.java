/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.WorkQueue;

import Buisness.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author patel
 */
public abstract class workRequest {
    
    private String request;
    private String response;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
   // private Date requestdate;
    //private Date resolvedate;

    public workRequest() {
        
        //requestdate = new Date();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

   /* public Date getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(Date requestdate) {
        this.requestdate = requestdate;
    }

    public Date getResolvedate() {
        return resolvedate;
    }

    public void setResolvedate(Date resolvedate) {
        this.resolvedate = resolvedate;
    }
    */

    @Override
    public String toString() {
        return this.request;
    }

  
    
    
}
