package nvc.it.benzzee.newton;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import nvc.it.benzzee.newton.model.Camera;
import nvc.it.benzzee.newton.repository.CameraRepository;
import nvc.it.benzzee.newton.repository.EventRepository;


@SpringBootApplication
public class NewtonApplication implements CommandLineRunner{

	private final CameraRepository cameraRepository;


	public  NewtonApplication (CameraRepository cameraRepository, EventRepository eventRepository){
		this.cameraRepository = cameraRepository;

	}

	@Override
	public void run (String... args) throws Exception{
		Camera camera1 = new Camera("192.168.1.11", "CAM-001", "Machine 1");
		Camera camera2 = new Camera("192.168.1.12", "CAM-002", "Machine 2");
		cameraRepository.saveAll(Arrays.asList(camera1,camera2));
	}





	public static void main(String[] args) {
		SpringApplication.run(NewtonApplication.class, args);
	}

}
