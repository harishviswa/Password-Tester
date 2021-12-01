//Harish Viswa
//Worked alongside Anwith during class
public class Password {

		public static boolean isValid = false;
		private String password;
		private boolean hasUpper = false;
		private boolean hasLower = false ;
		private boolean hasDigit = false;
		private boolean hasSpecial = false;
		
		public Password() {
			password = "Abc@123";
			validate();
		}
		
		public Password(String newPassword) {
			password = newPassword;
			validate();
		}
		
		public boolean isValid() {
			return isValid;
		}
		
		public void validate() {
			if(password.length() < 5 || password.length() > 17) {
				isValid = false;
				return;
			}
			if(password.contains(" ")) {
				isValid = false;
				return;
			}
			for(int i = 0; i < password.length(); i++) {
				char c = password.charAt(i);
				if(c > 64 && c < 91) {
					hasUpper = true;
				}
				if(c > 98 && c < 123) {
					hasLower = true;
				}
				if(c > 47 && c < 58) {
					hasDigit = true;
				}
				if(c > 32 && c < 48) {
					hasSpecial = true;
				}
				if(c == 64) {
					hasSpecial = true;
				}
			}
			if(!hasUpper || !hasLower) {
				isValid = false;
				return;
			}
			if(!hasDigit) {
				isValid = false;
				return;
			}
			if(!hasSpecial) {
				isValid = false;
				return;
			}else {
				isValid = true;
			}
			
			
			
			
		}
		
		public void changePassword(String newPass) {
			password = newPass;
			validate();
		}
		
		
		
}
