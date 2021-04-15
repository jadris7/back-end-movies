package co.edu.iudigital.app.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.User;
import co.edu.iudigital.app.model.repository.ProfileRepository;
import co.edu.iudigital.app.model.repository.UserRepository;
import co.edu.iudigital.app.service.iface.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository; 
	
	@Autowired
	private ProfileRepository profileRepository;
	
	@Override
	public  void create(User user) {
		//TODO implementar
		boolean existsProfiler = profileRepository.existsById(user.getProfile_id().getId());
		if (existsProfiler) {
			user.setCreate_At(LocalDateTime.now());
			userRepository.save(user);
		}		
				
		
	}
	
	@Override
	public User login(User user) throws Exception{
		/**
		 * El findBy se crea con la primera en mayúscula el atributo y se crea el metodo en el repositorio
		 */
		User existsUser = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if(existsUser == null) {
			throw new Exception("Usuario y/0 Contraseña invalido");
		}
		return existsUser;
		
	}

}
