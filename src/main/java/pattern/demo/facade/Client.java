package pattern.demo.facade;

public class Client {
    public void operates() throws Exception {
        ReservationServiceFacade rs = new ReservationServiceFacade();
        rs.makeReservation("Endora", "13800001234");
        //other things to do
    }
    //other methods
}
