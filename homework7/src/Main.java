
public class Main {
    public static void main(String[] args) {

        // test class 1
        Account a1 = new Account("444","mohammed");
        System.out.println(a1.toString());
        a1.debit(100);
        System.out.println(a1.toString());
        a1.credit(50);
        System.out.println(a1.toString());
        Account a2 = new Account("555","Ali");
        System.out.println(a2.toString());
        a1.transferTo(a2,20);
        System.out.println(a2.toString());
        System.out.println(a1.toString());

        // test class 2
        System.out.println("______________");
        Employee e1 = new Employee("4","saad",5000);
        System.out.println(e1.toString());
        System.out.println(e1.getAnnualSalary());
        e1.raisedSalary(10);
        System.out.println(e1.toString());



    }
}