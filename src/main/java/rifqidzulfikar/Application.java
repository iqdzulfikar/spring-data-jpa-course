package rifqidzulfikar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rifqidzulfikar.model.Student;
import rifqidzulfikar.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
//		return args -> {
//			Student rifqi = new Student(
//					"Rifqi",
//					"Dzulfikar",
//					"rifqidzulfikar2000@gmail.com",
//					22);
//			studentRepository.save(rifqi);
//		};
//	}

}
