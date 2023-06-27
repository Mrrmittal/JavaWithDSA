package dsawithjava;

public class SameEmployee {
    public static void main(String[] args) {
        employees myEmployee = new employees();
        employees myEmployee2 = new employees();
        myEmployee.setEmpId(1);
        myEmployee.setEmpName("Jatin");
        myEmployee2.setEmpId(1);
        myEmployee2.setEmpName("Jatin");
        if(myEmployee.equals(myEmployee2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        if(myEmployee==myEmployee2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.println(myEmployee2.hashcode());
        System.out.println(myEmployee.hashcode());
    }
}

class employees{
    private int empId;
    private String empName;

    public void setEmpId(int empId){
        this.empId = empId;
    }
    public int getEmpId(){
        return empId;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public String getEmpName(){
        return empName;
    }

    @Override
    public boolean equals(Object Obj) {
        employees obj1 = (employees) Obj;
        if (this.empName == obj1.empName && this.empId == obj1.empId) {
            return true;
        }
        return false;
    }
        public int hashcode(){
            return empId * empName.hashCode();
        }
    }
