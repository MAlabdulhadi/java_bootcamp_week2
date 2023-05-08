
public class Main {
    public static void main(String[] args) {

        // test class 1
        try {
            Account a1 = new Account("444","mohammed");
            System.out.println("info about account "+a1.getName());
            System.out.println(a1.toString());
            a1.debit(100);
            System.out.println("info after debit");
            System.out.println(a1.toString());
            a1.credit(100); // throws
            System.out.println("info after credit");
            System.out.println(a1.toString());

            Account a2 = new Account("555","Ali");
            System.out.println("info about account "+a2.getName());
            System.out.println(a2.toString());
            System.out.println("transfer form "+a1.getName()+" to "+a2.getName());
            a1.transferTo(a2,20000);// throws
            System.out.println("info about account "+a2.getName()+" after transfer");
            System.out.println(a2.toString());
            System.out.println("info about account "+a1.getName()+" after transfer");
            System.out.println(a1.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        // test class 2

        try {
            System.out.println("______________");

            Employee e1 = new Employee("4","saad",5000);
            System.out.println("info employee "+e1.getName());
            System.out.println(e1.toString());
            System.out.println("AnnualSalary : ");
            System.out.println(e1.getAnnualSalary());
            e1.raisedSalary(-1);//throws
            System.out.println("info employee after raised Salary : by 10% ");
            System.out.println(e1.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}