package qlhdnk.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="DangKy")
public class RegistersEntity {
	@Id
	@GeneratedValue
	private String idRegister;
	
	@ManyToOne
	@JoinColumn(name="maHoatDong")
	private ActivitiesEntity activityRegis;
	
	@ManyToOne
	@JoinColumn(name="maTaiKhoan")
	private AccountsEntity registrant;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern="HH:mm:ss dd/MM/yyyy")
	@Column(name="thoiGian")
	private Date timeRegister;

	@Column(name="flagDK")
	private boolean flagDK;

	public RegistersEntity() {
	}

	public String getIdRegister() {
		return idRegister;
	}

	public void setIdRegister(String idRegister) {
		this.idRegister = idRegister;
	}

	public ActivitiesEntity getActivityRegis() {
		return activityRegis;
	}

	public void setActivityRegis(ActivitiesEntity activityRegis) {
		this.activityRegis = activityRegis;
	}

	public AccountsEntity getRegistrant() {
		return registrant;
	}

	public void setRegistrant(AccountsEntity registrant) {
		this.registrant = registrant;
	}

	public Date getTimeRegister() {
		return timeRegister;
	}

	public void setTimeRegister(Date timeRegister) {
		this.timeRegister = timeRegister;
	}

	public boolean isFlagDK() {
		return flagDK;
	}

	public void setFlagDK(boolean flagDK) {
		this.flagDK = flagDK;
	}
	
	
}