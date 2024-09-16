public class Depertment {
    private String deptName;
    private int deptCode;
    private String facaulty;
    public static void main(String[] args) {
        Depertment dept1 = new Depertment();
        dept1.deptName = "SWE";
        dept1.deptCode = 32;
        dept1.facaulty = "ABS";
        Depertment dept2 = new Depertment();
        dept2.deptName = "CSE";
        dept2.deptCode = 30;
        dept2.facaulty = "Shakeel";

        System.err.println( "Depertment 1:  Name: "+ dept1.deptName + " Dept code : "+dept1.deptCode  + " Dept Facaulty: "+dept1.facaulty);
        System.err.println( "Depertment 2:  Name: "+ dept2.deptName + " Dept code : "+dept2.deptCode  + " Dept Facaulty: "+dept2.facaulty);
    }
}
