package dev.sgp.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banque {
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private int id;
	    private String banque;
	    private String bic;
	    private String iban;
	    

	        
	    //CONSTRUCTORS
	    public Banque() {}
	    
	    
	    public Banque(String banque, String bic, String iban) {
	            super();
	            this.banque = banque;
	            this.bic = bic;
	            this.iban = iban;
	        }
	    
	    //**************
	    
	    //GETTERS AND SETTERS
	        
	    
	    public String getBanque() {
	        return banque;
	    }
	    
	    public void setBanque(String banque) {
	        this.banque = banque;
	    }
	    
	    public String getBic() {
	        return bic;
	    }
	    
	    public void setBic(String bic) {
	        this.bic = bic;
	    }
	    public String getIban() {
	        return iban;
	    }
	    
	    public void setIban(String iban) {
	        this.iban = iban;
	    }


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}

}
