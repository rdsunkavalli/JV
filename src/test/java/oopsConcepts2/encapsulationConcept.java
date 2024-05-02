package oopsConcepts2;

public class encapsulationConcept {

    private int ssn;
    private String empName ;
    private int empAge;

    public int getSsn() {
        return ssn;
    }
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getEmpAge() {
        return empAge;
    }
    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
    public static void main(String[] args) {
        encapsulationConcept empData = new encapsulationConcept();
        empData.setSsn(123456);
        empData.setEmpName("tom");
        empData.setEmpAge(25);
        System.out.println("Employee name is: "+ empData.getEmpName());
        System.out.println("Employee age is: "+ empData.getEmpAge());
        System.out.println("Employee ssn is: "+ empData.getSsn());




    }

}
