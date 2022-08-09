package tw.com.aitc.sa.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpintgCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpintgCloudApplication.class, args);
	}

}
