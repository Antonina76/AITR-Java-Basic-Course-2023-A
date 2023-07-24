package practice.dao.test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.dao.model.Employee;
import practice.dao.model.SalesManager;
import practice.dao.model.Manager;
import practice.dao.model.WageEmployee;
import practice.dao.CompanyImpl;
import practice.dao.Company;

public class CompanyImplTest {
Company company;
Employee [] firm;
   @BeforeEach
    void setUp() {
        company = new CompanyImpl();
        firm = new Employee[4];
        firm[0] = new Manager(100, "John","Smith",174,5000,5);
        firm[1] = new SalesManager(101, "Bread", "Pitt", 174, 300000, 0.1);
        firm[2] = new SalesManager(102, "Julia", "Roberts", 174, 300000, 0.1);
        firm[3] = new WageEmployee(103, "Robert", "Robert", 80,20 );

        for (int i = 0; i < firm.length; i++) {
            company.addEmployee(firm[i]);
        }
    }



   @Test
    void addEmployee() {
    }

    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
    }

    @Test
    void size() {
    }

    @Test
    void printEmployees() {
    }


    }
