package pattern.demo.composite;

import java.util.ArrayList;

public class Company {
    private Employee president = new Manager("President");
    public Company() {
        //construct the company org-chat
        Employee vpSales = new Manager("VPSales");
        ((Manager)president).addSubordinate(vpSales);
        Employee vpOperations = new Manager("VPOperations");
        ((Manager)president).addSubordinate(vpOperations);

        Employee vpSalsePerson1 = new SalesPerson("VPSalse1");
        Employee vpSalsePerson2 = new SalesPerson("VPSalse2");
        Employee vpSalsePerson3 = new SalesPerson("VPSalse3");
        ((Manager)vpSales).addSubordinate(vpSalsePerson1);
        ((Manager)vpSales).addSubordinate(vpSalsePerson2);
        ((Manager)vpSales).addSubordinate(vpSalsePerson3);

        Employee canadianOperations = new Manager("CanadianOperations");
        Employee frenchOperations = new Manager("FrenchOperations");
        Employee germanOperations = new Manager("GermanOperations");
        ((Manager)vpOperations).addSubordinate(canadianOperations);
        ((Manager)vpOperations).addSubordinate(frenchOperations);
        ((Manager)vpOperations).addSubordinate(germanOperations);

        Employee canadianSalsePerson = new SalesPerson("CanadianSalsePerson");
        Employee ottawaHotel = new Manager("OttawaHotel");
        Employee markhamHotel = new Manager("MarkhamHotel");
        ((Manager)canadianOperations).addSubordinate(canadianSalsePerson);
        ((Manager)canadianOperations).addSubordinate(ottawaHotel);
        ((Manager)canadianOperations).addSubordinate(markhamHotel);

        Employee parisHotel = new Manager("ParisHotel");
        ((Manager)frenchOperations).addSubordinate(parisHotel);

        Employee germanClerk = new Clerk("GermanClerk");
        Employee germanConcierge = new Concierge("GermanConcierge");
        Employee germanSalesPerson = new SalesPerson("GermanSalesPerson");
        Employee berlinHotel = new Manager("BerlinHotel");
        ((Manager)germanOperations).addSubordinate(germanClerk);
        ((Manager)germanOperations).addSubordinate(germanConcierge);
        ((Manager)germanOperations).addSubordinate(germanSalesPerson);
        ((Manager)germanOperations).addSubordinate(berlinHotel);

        Employee ottawaClerk1 = new Clerk("OttawaClerk1");
        Employee ottawaClerk2 = new Clerk("OttawaClerk2");
        Employee ottawaConcierge1 = new Concierge("OttawaConcierge1");
        Employee ottawaConcierge2 = new Concierge("OttawaConcierge2");
        ((Manager)ottawaHotel).addSubordinate(ottawaClerk1);
        ((Manager)ottawaHotel).addSubordinate(ottawaClerk2);
        ((Manager)ottawaHotel).addSubordinate(ottawaConcierge1);
        ((Manager)ottawaHotel).addSubordinate(ottawaConcierge2);

        Employee markhamClerk1 = new Clerk("MarkhamClerk1");
        Employee markhamClerk2 = new Clerk("MarkhamClerk2");
        Employee markhamConcierge = new Concierge("MarkhamConcierge");
        ((Manager)markhamHotel).addSubordinate(markhamClerk1);
        ((Manager)markhamHotel).addSubordinate(markhamClerk2);
        ((Manager)markhamHotel).addSubordinate(markhamConcierge);

        Employee parisClerk1 = new Clerk("ParisClerk1");
        Employee parisClerk2 = new Clerk("ParisClerk2");
        Employee parisConcierge = new Concierge("ParisConcierge");
        ((Manager)parisHotel).addSubordinate(parisClerk1);
        ((Manager)parisHotel).addSubordinate(parisClerk2);
        ((Manager)parisHotel).addSubordinate(parisConcierge);
    }

    public double calculateCompanyPay () {
        return president.calculateDeptPay();
    }

    //other methods
}
