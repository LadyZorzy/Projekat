/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "leglo")
@XmlRootElement

public class Leglo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "LEGLO_ID")
    private Integer legloId;

    @Basic(optional = false)
    @NotNull
    @Column(name = "DATUMSTENJENJA")
    @Temporal(TemporalType.DATE)
    private Date datumstenjenja;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "OTAC")
    private String otac;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "MAJKA")
    private String majka;

    @JoinColumn(name = "USERS_ID", referencedColumnName = "USERS_ID")
    @ManyToOne
    private Users usersId;

    public Leglo() {
    }

    public Leglo(Integer legloId) {
        this.legloId = legloId;
    }

    public Leglo(Integer legloId, Date datumstenjenja, String otac, String majka) {
        this.legloId = legloId;
        this.datumstenjenja = datumstenjenja;
        this.otac = otac;
        this.majka = majka;
    }

    public Integer getLegloId() {
        return legloId;
    }

    public void setLegloId(Integer legloId) {
        this.legloId = legloId;
    }

    public Date getDatumstenjenja() {
        return datumstenjenja;
    }

    public void setDatumstenjenja(Date datumstenjenja) {
        this.datumstenjenja = datumstenjenja;
    }

    public String getOtac() {
        return otac;
    }

    public void setOtac(String otac) {
        this.otac = otac;
    }

    public String getMajka() {
        return majka;
    }

    public void setMajka(String majka) {
        this.majka = majka;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
    }

    @Override
    public String toString() {
        return "bean.Leglo[ legloId=" + legloId + " ]";
    }

}
