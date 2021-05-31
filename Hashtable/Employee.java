package udemy.Hashtable;

public class Employee {
    private String firstname;
    private String lastname;
    private int id;


    public Employee(String firstname, String lastname, int id){
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public int getid(){
        return id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setid(int id){
        this.id = id;
    }
}
