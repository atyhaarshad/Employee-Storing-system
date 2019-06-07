package staff;

public abstract class Employee {

    String name;
    String NI;
    Double salary;

    public Employee(String name, String NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public Employee(){

    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double amount){
        if (amount <= 0){
            return this.salary;
        } else {
            this.salary += amount;
                return salary;
        }

    }

    public double payBonus(){
        double amount = 0.01 * this.salary;
        return amount;
    }

    public void setName(String name) {
        if (name != null){
            this.name = name;
        }
    }
}
