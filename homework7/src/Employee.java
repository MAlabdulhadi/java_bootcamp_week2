public class Employee {

    private String id ;
    private String name ;
    private double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAnnualSalary(){
        return (int) this.salary * 12;


    }

    public int raisedSalary(int percent)throws Exception{
        if (percent<0){
            throw new Exception("percent must be > 0");
        }else {
            int salaryAfterPercent = (int) (getSalary() + (getSalary()*percent/100));
            this.salary = salaryAfterPercent;
            return (int) this.salary;
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
