package pattern.demo.composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyCompositeTest {
    @Test
    public void calculateCompanyPay() throws Exception {
        Company company = new Company();
        double companyPay = company.calculateCompanyPay();
        System.out.println("The total pay of the company is " + companyPay + ".");
    }

}