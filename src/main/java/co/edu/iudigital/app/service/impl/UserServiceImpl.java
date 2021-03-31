package co.edu.iudigital.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.User;
import co.edu.iudigital.app.model.repository.UserRepository;
import co.edu.iudigital.app.service.iface.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public  void create(User user) {
		//TODO implementar
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
