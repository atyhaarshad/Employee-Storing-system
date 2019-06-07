package management;

public class Director extends Manager {

    Double budget;

    public Director(String name, String NI, double salary, String deptName, double budget) {
        super(name, NI, salary, deptName);
        this.budget = budget;
    }


    public Double getBudget() {
        return budget;
    }

    @Override
    public double payBonus() {
        return getSalary() * 0.02;
    }
}
