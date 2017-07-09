package tw.mike.beans;

import java.io.Serializable;

/*javabean rules
 * implements Serialiaagle
 * publc ckass
 * field memeber can  not a punlic
 * getter&setter
 * none argument 
 */
public class Member  implements Serializable{
	private String id,name;
	public Member() {
		System.out.println("Member()");
		
	}
	public Member(String id,String name) {
		
		this.id=id;this.name=name;
		System.out.println("Member()" + id +name);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void m1() {
		System.out.println("test");
	}
	@Override
	public String toString() {
		return id+ ":" +name;
	}
}
	
