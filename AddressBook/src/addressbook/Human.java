package addressbook;

public class Human {
	private String name;
	private String phone;
	private String relation;
	private String birth;
	
	
	Human(String name, String phone, String relation, String birth) // 이름, 번호, 관계, 생일 정보를 모두 알 때
	{
		this.name = name;
		this.phone = phone;
		this.relation = relation;
		this.birth = birth;
	}
	
	Human(String name, String phone, String relation) // 이름, 번호, 관계 정보만을 알 때
	{
		this.name = name;
		this.phone = phone;
		this.relation = relation;
	}
	
	Human(String name, String phone) // 이름, 번호 정보만을 알 때
	{
		this.name = name;
		this.phone = phone;
	}
	
	
	// name에 대한 접근자, 설정자 함수
	public String getName() 
	{
		return name;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	// phone에 대한 접근자, 설정자 함수
	public String getPhone() 
	{
		return phone;
	}
	
	void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	// relation에 대한 접근자, 설정자 함수
	public String getRelation() 
	{
		return relation;
	}
	
	void setRelation(String relation)
	{
		this.relation = relation;
	}
	
	// birth에 대한 접근자, 설정자 함수
	public String getBirth() 
	{
		return birth;
	}
	
	void setBirth(String birth)
	{
		this.birth = birth;
	}
	
}
