package addressbook;

public class Function {
	final int MAX = 100;
	Human[] person = new Human[MAX]; // 배열생성
	public int count; // 주소록 배열에 접근하기 위한 데이터필드, 주소록 객체의 갯수
	
	//메뉴
	public static void Menu()
	{
		//메뉴 보여주기 (주의사항 : 종료에 해당하는 메뉴 만들기)
	}
	
	
	
	//삭제
	public void deleteAddress(int count) 
	{
		//입력된 내용을 바탕으로 순서대로 출력하고, 삭제할 데이터 순서를 확인하고, 그 순서를 입력 받을 예정
		//예) 출력 : 1.김씨 2.이씨 3.박씨 -> 삭제할 데이터는 : 2(입력 받기) -> deleteAddress(2)
	}
	
	
	//검색
	public void scanSearch(int num)
	{
		//검색하고자 하는 부분의 번호를 받아 검색하기
		//예) 1.이름 2.번호 -> 검색하고자 하는 데이터 : 1(입력받기) -> searchName() 함수 호출
	}
	
	public void searchName(String name)
	{
		//입력한 이름에 해당하는 주소록이 있는지 확인
	}
	
	public void searchPhone(String phone)
	{
		//입력한 번호에 해당하는 주소록이 있는지 확인
	}
	
	
	
	//수정
	public void scanModify(int num) 
	{
		//수정하고자 하는 부분의 번호를 받아 수정하기
		//예) 1.이름 2.번호 3.관계 4.생일 -> 수정하고 싶은 부분 : 3(입력받기) -> modifyRelation() 함수 호출 
	}
	
	public void modifyName(int count,String name)
	{
		//deleteAddress()와 같은 방식으로 순서를 입력 받고, 입력받은 이름으로 수정하기
	}
	
	public void modifyPhone(int count,String phone)
	{
		//deleteAddress()와 같은 방식으로 순서를 입력 받고, 입력받은 번호으로 수정하기
	}
	
	public void modifyRelation(int count,String relation)
	{
		//deleteAddress()와 같은 방식으로 순서를 입력 받고, 입력받은 관계로 수정하기
	}
	
	public void modifyBirth(int count,String birth)
	{
		//deleteAddress()와 같은 방식으로 순서를 입력 받고, 입력받은 생일로 수정하기
	}
	
}
