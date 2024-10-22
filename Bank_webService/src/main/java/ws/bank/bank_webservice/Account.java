package ws.bank.bank_webservice;

import java.util.Date;

public class Account {
    private Long id; // make fields private
    private double montant;
    private Date dateCreation;

    public Account() {
    }

    public Account(Long id, double montant, Date dateCreation) {
        this.id = id;
        this.montant = montant;
        this.dateCreation = dateCreation;
    }

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for montant
    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    // Getter and Setter for dateCreation
    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
