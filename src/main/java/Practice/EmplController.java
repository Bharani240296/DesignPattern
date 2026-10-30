package Practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmplController {
    private EmplService emplService;
public EmplController(EmplService emplService){
    this.emplService=emplService;
}
@GetMapping("/emp")
public Employee getEmplName(){
    System.out.println();
    return emplService.getEmplService();
}
}
