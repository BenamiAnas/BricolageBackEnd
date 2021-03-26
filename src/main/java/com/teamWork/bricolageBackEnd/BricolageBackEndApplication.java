package com.teamWork.bricolageBackEnd;

import com.teamWork.bricolageBackEnd.models.ERole;
import com.teamWork.bricolageBackEnd.models.Metier;
import com.teamWork.bricolageBackEnd.models.Role;
import com.teamWork.bricolageBackEnd.repository.MetierRepository;
import com.teamWork.bricolageBackEnd.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BricolageBackEndApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BricolageBackEndApplication.class, args);
	}
    @Autowired
	private RoleRepository roleRepository;
	@Autowired
	private MetierRepository metierRepository;
	private ERole roleName;
	@Override
	public void run(String... args) throws Exception {
		Role user = new Role();
		user.setName(roleName.ROLE_USER);
		roleRepository.save(user);
		Role bricoleur = new Role();
		bricoleur.setName(roleName.ROLE_BRICOLEUR);
		roleRepository.save(bricoleur);
		Role admin = new Role();
		admin.setName(roleName.ROLE_ADMIN);
		roleRepository.save(admin);
		Metier plombrie = new Metier(null,"tous ce qui est en relaion avec l'eau","Plombrie",null);
		metierRepository.save(plombrie);
		Metier aliminium = new Metier(null,"tous ce qui est en relaion avec l'aliminuim","Aliminuim",null);
		metierRepository.save(aliminium);
	}
}
