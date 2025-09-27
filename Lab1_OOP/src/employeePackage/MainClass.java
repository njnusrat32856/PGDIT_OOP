package employeePackage;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Java Programming");
		
		
		Resume resume_1 = new Resume();
		resume_1.printPersonalInformation();
		
		System.out.println(resume_1.personal_information.getAge());
		
		if(resume_1.personal_information.getAge() > 30) {
			resume_1.printPersonalInformation();
		}
		
		
//		PersonClass person1 = new PersonClass();	
//		PersonClass person2 = new PersonClass();
		
//		Mahade.setName("Md Mahade Hasan");
//		System.out.println(Mahade.getName());
//		System.out.println(Mahade.name);
//		
//		Rahman.setName("Md Rahman");
//		System.out.println(Rahman.getName());
		
		//System.out.println(hasan.getName());
	}

}
