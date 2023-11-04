package com.example.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "Rqst_sys")
@Table(name = "RQST_SYS")
public class RequestSystemId {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RQST_SYS_ID")
    private int id;

    @Column(name = "CREA_TS")
    @Temporal(TemporalType.DATE)
    private Date createTimestamp;

    @Column(name = "CREA_ID")
    private String createId;

    @Column(name = "UPDT_TS")
    @Temporal(TemporalType.DATE)
    private Date updateTimestamp;

    @Column(name = "UPDT_ID")
    private String updateId;

    @Column(name = "SYS_NM")
    private String systemName;

    @Column(name = "SOAP_CLBK_URL_TXT")
    private String soapCallbackUrlText;

    @Column(name = "SOAP_CLBK_VRSN_NBR")
    private String soapCallbackVersionNumber;

    @Column(name = "EMAIL_ADDR_TXT")
    private String emailAddrText;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSoapCallbackUrlText() {
        return soapCallbackUrlText;
    }

    public void setSoapCallbackUrlText(String soapCallbackUrlText) {
        this.soapCallbackUrlText = soapCallbackUrlText;
    }

    public String getSoapCallbackVersionNumber() {
        return soapCallbackVersionNumber;
    }

    public void setSoapCallbackVersionNumber(String soapCallbackVersionNumber) {
        this.soapCallbackVersionNumber = soapCallbackVersionNumber;
    }

    public String getEmailAddrText() {
        return emailAddrText;
    }

    public void setEmailAddrText(String emailAddrText) {
        this.emailAddrText = emailAddrText;
    }

    @Override
    public String toString() {
        return "RequestSystemId [SYS_NM=" + this.systemName + "]";
    }

}
