public class Employee {
    // variables
    // methods
    // blocks
    // constructors
    int empNo; //0 default value
    String empName; // null default value

    //String s=""; using literal
    // String s= new String() ; using new operator



    static String company="Infosys";

  public Employee(){
      System.out.println("default constructor");
  }

    public Employee(int empNo, String empName) {
        this.empNo = empNo; //123
        this.empName = empName; //"sudheer"
    }

    public Employee(int empNo, String empName,String company) {
        this.empNo = empNo; //123
        this.empName = empName; //"sudheer"
        this.company= company;
    }


    public static void main(String[] args) {
        int i=10; //local
        System.out.println(i);

        //className ref= new className();
        Employee employee= new Employee();
        // to access instance variables we use obj.variablename
        System.out.println(employee.empNo);
        System.out.println(employee.empName);
        System.out.println(Employee.company);
        System.out.println("=========================");
        Employee employee1= new Employee(123,"sudheer");
        System.out.println(employee1.empNo);
        System.out.println(employee1.empName);
        System.out.println(Employee.company);
        System.out.println("=========================");
        Employee employee2= new Employee(153,"abhi");
        System.out.println(employee2.empNo);
        System.out.println(employee2.empName);
        System.out.println(Employee.company);

    }
}
