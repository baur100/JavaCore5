package hw12;

import org.w3c.dom.ls.LSOutput;

public class StartUp implements ManualTester, AutomationTester{
    private String level;
    private String reference;
    private int salary;

    public StartUp(String level, String reference, int salary) {
        this.level = level;
        this.reference = reference;
        this.salary = salary;
    }

    public void hired(){
        System.out.println("Hired");
    }
    public void fired(){
        System.out.println("Fired");
    }

    @Override
    public String toString() {
        return "StartUp{" +
                "level='" + level + '\'' +
                ", reference='" + reference + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void autoScripts() {
        System.out.println("I can write Auto Scripts");
    }
    public void bugReports() {
        System.out.println("I can write bug reports");
    }

    public void testCases() {
        System.out.println("I can write test cases");
    }
}
