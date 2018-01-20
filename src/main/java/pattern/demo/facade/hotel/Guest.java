package pattern.demo.facade.hotel;

public class Guest {
    private String name;
    private String tel;

    public Guest () {
        System.out.println("A new guest comes to book a room.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void updateProfile (String name, String tel) {
        this.name = name;
        this.tel = tel;
        System.out.println("Update the guest's profile. Name=" + name + ", tel=" + tel);
    }
}
