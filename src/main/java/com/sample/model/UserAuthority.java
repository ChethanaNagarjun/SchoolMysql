package com.sample.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.sample.model.Authority;
import com.sample.model.User;

@Entity
@Table(name = "user_authority")

public class UserAuthority implements Serializable {
	 
	    private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Basic(optional = false)
        @Column(name = "id")
        private Integer id;
	    @JoinColumn(name = "fkey_authority_id", referencedColumnName = "id")
	    @ManyToOne(optional = false)
	    private Authority fkeyAuthorityId;
	    @JoinColumn(name = "fkey_user_id", referencedColumnName = "id")
	    @ManyToOne(optional = false)
	    private User fkeyUserId;

	    public UserAuthority() {
	    }


	    public UserAuthority(Integer id) {
			this.id = id;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public Authority getFkeyAuthorityId() {
	        return fkeyAuthorityId;
	    }

	    public void setFkeyAuthorityId(Authority fkeyAuthorityId) {
	        this.fkeyAuthorityId = fkeyAuthorityId;
	    }

	    public User getFkeyUserId() {
	        return fkeyUserId;
	    }

	    public void setFkeyUserId(User fkeyUserId) {
	        this.fkeyUserId = fkeyUserId;
	    }

	}
	
	

