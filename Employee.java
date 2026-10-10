public class Employee {
    
    int e_id;
    String name, gender;
    float salary;

    Employee(int e_id,String name, String gender, float salary){
        this.e_id=e_id;
        this.name=name;
        this.gender=gender;
        this.salary=salary;
    }
    void display_employee(){
        System.out.print("\nemployee id: "+e_id+"\nemployee name: "+ name+"\nGender: "+ gender+"\nsalary: "+ salary);
    }
    

}
