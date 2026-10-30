package Practice;

import org.springframework.stereotype.Service;

@Service
public class EmplService {
    private Employee emplService;
    public EmplService(Employee emplService) {
        this.emplService = emplService;
    }
    public Employee getEmplService() {
        emplService.setName("Sriram");
        emplService.setSalary(95000);
        emplService.setEmpId(2);
        System.out.println(emplService.toString());
        return emplService;
    }
}
