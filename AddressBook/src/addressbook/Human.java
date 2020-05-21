package addressbook;

public class Human {
	private String name;
	private String phone;
	private String relation;
	private String birth;
	
	
	Human(String name, String phone, String relation, String birth) // �̸�, ��ȣ, ����, ���� ������ ��� �� ��
	{
		this.name = name;
		this.phone = phone;
		this.relation = relation;
		this.birth = birth;
	}
	
	Human(String name, String phone, String relation) // �̸�, ��ȣ, ���� �������� �� ��
	{
		this.name = name;
		this.phone = phone;
		this.relation = relation;
	}
	
	Human(String name, String phone) // �̸�, ��ȣ �������� �� ��
	{
		this.name = name;
		this.phone = phone;
	}
	
	
	// name�� ���� ������, ������ �Լ�
	public String getName() 
	{
		return name;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	// phone�� ���� ������, ������ �Լ�
	public String getPhone() 
	{
		return phone;
	}
	
	void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	// relation�� ���� ������, ������ �Լ�
	public String getRelation() 
	{
		return relation;
	}
	
	void setRelation(String relation)
	{
		this.relation = relation;
	}
	
	// birth�� ���� ������, ������ �Լ�
	public String getBirth() 
	{
		return birth;
	}
	
	void setBirth(String birth)
	{
		this.birth = birth;
	}
	
}
