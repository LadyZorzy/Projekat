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
@Table(name = "pas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pas.findAll", query = "SELECT p FROM Pas p")
    , @NamedQuery(name = "Pas.findByPasId", query = "SELECT p FROM Pas p WHERE p.pasId = :pasId")
    , @NamedQuery(name = "Pas.findByIme", query = "SELECT p FROM Pas p WHERE p.ime = :ime")
    , @NamedQuery(name = "Pas.findByDatumstenjenja", query = "SELECT p FROM Pas p WHERE p.datumstenjenja = :datumstenjenja")
    , @NamedQuery(name = "Pas.findByRasa", query = "SELECT p FROM Pas p WHERE p.rasa = :rasa")
    , @NamedQuery(name = "Pas.findByBrojMikrocipa", query = "SELECT p FROM Pas p WHERE p.brojMikrocipa = :brojMikrocipa")
    , @NamedQuery(name = "Pas.findByMajka", query = "SELECT p FROM Pas p WHERE p.majka = :majka")
    , @NamedQuery(name = "Pas.findByOtac", query = "SELECT p FROM Pas p WHERE p.otac = :otac")
    , @NamedQuery(name = "Pas.findByPotomci", query = "SELECT p FROM Pas p WHERE p.potomci = :potomci")
    , @NamedQuery(name = "Pas.findBySampionati", query = "SELECT p FROM Pas p WHERE p.sampionati = :sampionati")})
public class Pas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PAS_ID")
    private String pasId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "IME")
    private String ime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATUMSTENJENJA")
    @Temporal(TemporalType.DATE)
    private Date datumstenjenja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "RASA")
    private String rasa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "BROJ_MIKROCIPA")
    private String brojMikrocipa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "MAJKA")
    private String majka;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "OTAC")
    private String otac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "POTOMCI")
    private String potomci;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "SAMPIONATI")
    private String sampionati;
    @JoinColumn(name = "USERS_ID", referencedColumnName = "USERS_ID")
    @ManyToOne
    private Users usersId;

    public Pas() {
    }

    public Pas(String pasId) {
        this.pasId = pasId;
    }

    public Pas(String pasId, String ime, Date datumstenjenja, String rasa, String brojMikrocipa, String majka, String otac, String potomci, String sampionati) {
        this.pasId = pasId;
        this.ime = ime;
        this.datumstenjenja = datumstenjenja;
        this.rasa = rasa;
        this.brojMikrocipa = brojMikrocipa;
        this.majka = majka;
        this.otac = otac;
        this.potomci = potomci;
        this.sampionati = sampionati;
    }

    public String getPasId() {
        return pasId;
    }

    public void setPasId(String pasId) {
        this.pasId = pasId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Date getDatumstenjenja() {
        return datumstenjenja;
    }

    public void setDatumstenjenja(Date datumstenjenja) {
        this.datumstenjenja = datumstenjenja;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getBrojMikrocipa() {
        return brojMikrocipa;
    }

    public void setBrojMikrocipa(String brojMikrocipa) {
        this.brojMikrocipa = brojMikrocipa;
    }

    public String getMajka() {
        return majka;
    }

    public void setMajka(String majka) {
        this.majka = majka;
    }

    public String getOtac() {
        return otac;
    }

    public void setOtac(String otac) {
        this.otac = otac;
    }

    public String getPotomci() {
        return potomci;
    }

    public void setPotomci(String potomci) {
        this.potomci = potomci;
    }

    public String getSampionati() {
        return sampionati;
    }

    public void setSampionati(String sampionati) {
        this.sampionati = sampionati;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pasId != null ? pasId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pas)) {
            return false;
        }
        Pas other = (Pas) object;
        if ((this.pasId == null && other.pasId != null) || (this.pasId != null && !this.pasId.equals(other.pasId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ime:" + ime + " ]";
    }
    
}
