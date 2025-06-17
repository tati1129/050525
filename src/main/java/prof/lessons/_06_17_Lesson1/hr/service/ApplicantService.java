package prof.lessons._06_17_Lesson1.hr.service;

import prof.lessons._06_17_Lesson1.hr.UserInputStatic;
import prof.lessons._06_17_Lesson1.hr.entity.Aplicant;
import prof.lessons._06_17_Lesson1.hr.entity.Department;
import prof.lessons._06_17_Lesson1.hr.entity.Person;
import prof.lessons._06_17_Lesson1.hr.repositorii.AplicantRepository;


public class ApplicantService {

    private AplicantRepository aplicantRepository;
    private DepartmentService departmentService;

    public ApplicantService(AplicantRepository aplicantRepository, DepartmentService departmentService) {
        this.aplicantRepository = aplicantRepository;
        this.departmentService = departmentService;
    }


    public void addNewAplicant() {
        int newApplicantId = UserInputStatic.inputInt("Введите номер анкеты соискателя:");
        String newApplicantName = UserInputStatic.inputText("Введите имя соискателя:");
        String newApplicantSpeciality = UserInputStatic.inputText("Введите специальность соискателя:");
        String newApplicantDepartmentName = UserInputStatic.inputText("Введите наименование отдела для соискателя:");

        Person newPerson = new Person(newApplicantName, newApplicantSpeciality);
        Department departmentForApplicant = departmentService.findByName(newApplicantDepartmentName);

        if (departmentForApplicant == null) {
            System.out.println("такого отдела нет в нашей компании");
            return;
        }

        Aplicant newApplicant = new Aplicant(newApplicantId, newPerson, departmentForApplicant);

        System.out.println(aplicantRepository.add(newApplicant));

    }

    public Aplicant findById(int applicantIdForSearch) {
        return aplicantRepository.findById(applicantIdForSearch);
    }


    public Person personFromAplicant(int aplicantId) {
        Aplicant foundedAplicant = findById(aplicantId);
        if (foundedAplicant != null) {
            return foundedAplicant.getPerson();
        } else {
            return null;
        }
    }

    public Department departmentFromAplicant(int aplicantId) {
        Aplicant foundedAplicant = findById(aplicantId);
        if (foundedAplicant != null) {
            return foundedAplicant.getDepartment();
        } else {
            return null;
        }
    }


    public void approveCandidate(int aplicantId) {
        Aplicant foundedAplicant = findById(aplicantId);
        if (foundedAplicant != null) {
            foundedAplicant.setAprove(true);
        }
    }

    public void printAll() {
        Aplicant[] all = aplicantRepository.findAll();
        for (Aplicant aplicant: all){
            System.out.println(aplicant);
        }
    }

}


