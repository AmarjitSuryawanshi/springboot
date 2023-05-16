package dockerExample.docker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@GetMapping("/result")
	public ResponseEntity<String> responseSample(){
		System.out.println("response....");
		return new ResponseEntity("Response form controller..",HttpStatus.OK);
		
	}
}
