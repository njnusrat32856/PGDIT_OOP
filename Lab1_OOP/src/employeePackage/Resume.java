package employeePackage;

public class Resume {
	
//	PersonClass personal_information;
	
	PersonClass personal_information = new PersonClass("Nusrat ", 24, " Khilgaon ", " Dhaka ", " 3242343424");
	

	
	public void printPersonalInformation() {
		System.out.println(
				this.personal_information.getName() +
				this.personal_information.getAge() +
				this.personal_information.getAddress() +
				this.personal_information.getDistrict() +
				this.personal_information.getPhone()
				);
	}
	


}
