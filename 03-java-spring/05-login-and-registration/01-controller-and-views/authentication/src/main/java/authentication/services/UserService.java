package authentication.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import authentication.models.User;
import authentication.repositories.UserRepository;

@Service

public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public User add (User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return userRepo.save(user);
	}
	
	public User getById(Long userId) {
		return userRepo.findById(userId).get();
	}
	
	public User getByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	public boolean authenticatUser(String email, String password) {
		User user = userRepo.findByEmail(email);
		
		if(user == null) {
			return false;
		} else {
			if(BCrypt.checkpw(password, user.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}

}
