package besinciGunOdev.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import besinciGunOdev.business.abstracts.AuthService;
import besinciGunOdev.entities.concretes.User;

public class AuthManager implements AuthService {

	@Override
	public boolean validateName(User user) {	
		boolean isTrue = false;
		
		if(!(user.getFirstName().length() < 3)) {
			isTrue = true;}
		
		else {
			isTrue = false;}
		
		return isTrue;
	}

	private String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	private Pattern pattern = Pattern.compile(regex);
	private Matcher matcher;
	private boolean matchFound;
	@Override
	public boolean validateMail(User user) {
		matcher = pattern.matcher(user.getMail());
		matchFound = matcher.find();
		
		if(!matchFound) {
			System.out.println("Geçersiz E-Posta Adresi !");
			return false;		
		}
		return true; 
	}

	@Override
	public boolean validatePassword(User user) {
		boolean isTrue = false;
		
		if(!(user.getPassword().length() < 6)) {
			isTrue = true;}
		
		else {
			System.out.println("Þifre 6 karakterden az olamaz !!!");
			isTrue = false;}
		
		return isTrue;
		
	}

	@Override
	public boolean validateIsThereUser(User user) {
		
		return true;
	}

	


}
