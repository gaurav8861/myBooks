package com.myBooks.model.VO;

import java.util.List;

import org.dozer.Mapping;

import com.myBooks.model.dto.AddressDTO;
import com.myBooks.model.dto.EmailDTO;
import com.myBooks.model.dto.PhoneDTO;

public class UserVOResponse {
	
	@Mapping("firstName")
	private String firstName;
	@Mapping("lastName")
	private String lastName;
	
	private String email;
	private String phoneNumber;
	
	@Mapping("imageLogo")
	private String imageLogo;
	@Mapping("dateOfBirth")
	private String dateOfBirth;
	@Mapping("gender")
	private String gender;
	@Mapping("profileId")
	private String profileId;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getImageLogo() {
		return imageLogo;
	}
	public void setImageLogo(String imageLogo) {
		this.imageLogo = imageLogo;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	
	

}
