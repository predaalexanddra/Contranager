package ro.ase.contranager.Contranager;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EntityScan(basePackages = "ro/ase/contranager/Contranager/entities")
@EnableWebMvc
@ComponentScan(basePackages = "ro.ase.contranager.Contranager")
@EnableAutoConfiguration
@SpringBootApplication
public class ContranagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContranagerApplication.class, args);
		String salt = BCrypt.gensalt(12);
		System.out.println( BCrypt.hashpw("user", salt));

	}
}
