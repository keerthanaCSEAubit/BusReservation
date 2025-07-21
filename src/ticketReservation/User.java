package ticketReservation;

public class User extends Person {
    public User(Double id, String name, String email, String phoneNumber){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    public Double getId(){
        return this.id;
    }
    public void setId(Double id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String  getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setId(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public void getDetails() {

    }
}
