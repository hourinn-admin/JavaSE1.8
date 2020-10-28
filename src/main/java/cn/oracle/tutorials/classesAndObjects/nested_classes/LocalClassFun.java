package cn.oracle.tutorials.classesAndObjects.nested_classes;

class Validation{
	
	
	
	private  static final String REGEX_PHONE = "[0-9]+";
	
	public  static void PhoneNumberValidation(String phoneNumber) {
		
		int phoneLength = 11;
		
		class PhoneNumber {
			String originalNumber;
			String formattedNumber;
			 
			public PhoneNumber(String number) {
				this.originalNumber = number;
			 
			}
			 
			boolean validatelength() {
				formattedNumber = phoneNumber.replace("-", "");
				return formattedNumber.length() == phoneLength;
			}
			
			boolean validateOthers() {
				return formattedNumber.matches(REGEX_PHONE) ;
			}
			 
			String getNumber() {
				 return this.formattedNumber;
			}
			 
			void print() {
				 System.out.println(formattedNumber);
			}
		}
		
		PhoneNumber number = new PhoneNumber(phoneNumber);
		
		if(number.validatelength()) {
			if(number.validateOthers()) {
				number.print();
			}else {
				System.out.println("invalid phoneNumber:other errors");
			}
		}else {
			System.out.println("invalid phoneNumber:length is not equal 11");
		}
	}
}

public class LocalClassFun {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validation.PhoneNumberValidation("070-4283");
		Validation.PhoneNumberValidation("070-428a-510b");
		Validation.PhoneNumberValidation("070-4283-5109");
	}
}
