/*
 * Person
 *
 * Description: This source file is a part of Java game program,
 * that generates a random integer. Then prompts a user to guess
 * the value by giving certain hints and guides.
 * 
 * By: Alyona Korzhakova 
 *
 * Created: 2018/03/01
 * 
 * Updated: 2018/03/06
 */
package ua.training;

import java.time.LocalDate;
import java.util.ArrayList;

public class Person {

	private String lastName;
	private String firstName;
	private String secondName;
	private String shortName;
	private String nickname;
	private String comment;
	ArrayList<Groups> groups = new ArrayList<Groups>();
	private String homePhoneNumber;
	private String mobilePhoneNumber;
	private String mobilePhoneNumber2;
	private String email;
	private String skype;
	private Address address;
	private String fullAddress;
	private String created;
	private String updated;


	public void setLastName(String lastName) {
		this.lastName = lastName;
    }

    public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
    }

    public String getSecondName() {
		return secondName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
    }

    public String getShortName() {
		return shortName;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
    }

    public String getNickname() {
		return nickname;
	}

	public void setComment(String comment) {
		this.comment = comment;
    }

    public String getComment() {
		return comment;
	}

	public void setGroups(Groups x) {
		groups.add(x);
    }

    public ArrayList<Groups> getGroups() {
		return groups;
	}

	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
    }

    public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber2(String mobilePhoneNumber2) {
		this.mobilePhoneNumber2 = mobilePhoneNumber2;
    }

    public String getMobilePhoneNumber2() {
		return mobilePhoneNumber2;
	}

	public void setEmail(String email) {
		this.email = email;
    }

    public String getEmail() {
		return email;
	}

	public void setSkype(String skype) {
		this.skype = skype;
    }

    public String getSkype() {
		return skype;
	}

    public Address getAddress() {
        return address;
    }

	public void setAddress(Address address) {
		this.address = address;
    }

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
    }

    public String getFullAddress() {
		return fullAddress;
	}

	public void setCreated(String created) {
		this.created = created;
    }

    public String getCreated() {
		return created;
	}

	public void setUpdated(LocalDate updated) {
		this.updated = updated.toString();
    }

    public String getUpdated() {
		return updated;
	}

}
