package addressbook;

public class Function {
	final int MAX = 100;
	Human[] person = new Human[MAX]; // �迭����
	public int count; // �ּҷ� �迭�� �����ϱ� ���� �������ʵ�, �ּҷ� ��ü�� ����
	
	//�޴�
	public static void Menu()
	{
		//�޴� �����ֱ� (���ǻ��� : ���ῡ �ش��ϴ� �޴� �����)
	}
	
	
	
	//����
	public void deleteAddress(int count) 
	{
		//�Էµ� ������ �������� ������� ����ϰ�, ������ ������ ������ Ȯ���ϰ�, �� ������ �Է� ���� ����
		//��) ��� : 1.�达 2.�̾� 3.�ھ� -> ������ �����ʹ� : 2(�Է� �ޱ�) -> deleteAddress(2)
	}
	
	
	//�˻�
	public void scanSearch(int num)
	{
		//�˻��ϰ��� �ϴ� �κ��� ��ȣ�� �޾� �˻��ϱ�
		//��) 1.�̸� 2.��ȣ -> �˻��ϰ��� �ϴ� ������ : 1(�Է¹ޱ�) -> searchName() �Լ� ȣ��
	}
	
	public void searchName(String name)
	{
		//�Է��� �̸��� �ش��ϴ� �ּҷ��� �ִ��� Ȯ��
	}
	
	public void searchPhone(String phone)
	{
		//�Է��� ��ȣ�� �ش��ϴ� �ּҷ��� �ִ��� Ȯ��
	}
	
	
	
	//����
	public void scanModify(int num) 
	{
		//�����ϰ��� �ϴ� �κ��� ��ȣ�� �޾� �����ϱ�
		//��) 1.�̸� 2.��ȣ 3.���� 4.���� -> �����ϰ� ���� �κ� : 3(�Է¹ޱ�) -> modifyRelation() �Լ� ȣ�� 
	}
	
	public void modifyName(int count,String name)
	{
		//deleteAddress()�� ���� ������� ������ �Է� �ް�, �Է¹��� �̸����� �����ϱ�
	}
	
	public void modifyPhone(int count,String phone)
	{
		//deleteAddress()�� ���� ������� ������ �Է� �ް�, �Է¹��� ��ȣ���� �����ϱ�
	}
	
	public void modifyRelation(int count,String relation)
	{
		//deleteAddress()�� ���� ������� ������ �Է� �ް�, �Է¹��� ����� �����ϱ�
	}
	
	public void modifyBirth(int count,String birth)
	{
		//deleteAddress()�� ���� ������� ������ �Է� �ް�, �Է¹��� ���Ϸ� �����ϱ�
	}
	
}
