package com.tencent.entity;


import java.util.Date;

import com.tencent.aspectj.MyTag;

/**
 * @ClassName: Person 
 * @Description: 实体类
 * @author: zhang.xiaoming
 * @date: 2018.6.27 10:57:59
 */
public class Person {
	@MyTag(isPK=true,length="11")
	private Integer personId;
	@MyTag(isPK=false,length="2")
	private Integer age;
	@MyTag(isPK=false,length="50")
	private String name;
	@MyTag(isPK=false,length="50")
	private String nickName;
	@MyTag(isPK=false)
	private Date birthday;
	@MyTag(isPK=false,length="1")
	private Boolean isAdmin;
	@MyTag(isPK=false,length="11,2")
	private Double wealth;
	
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		if (personId != null) {
			this.personId = personId;
		}
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		if (age != null) {
			this.age = age;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		if (nickName != null) {
			this.nickName = nickName;
		}
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		if (birthday != null) {
			this.birthday = birthday;
		}
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		if (isAdmin != null) {
			this.isAdmin = isAdmin;
		}
	}
	public Double getWealth() {
		return wealth;
	}
	public void setWealth(Double wealth) {
		if (wealth != null) {
			this.wealth = wealth;
		}
	}
}
