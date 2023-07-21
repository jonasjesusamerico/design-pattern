package code;

import java.util.Random;

public class Main {

    private static final String[] employeeType = {"code.Developer", "code.Tester"};
    private static final String[] skills = {"Java", "C++", ".Net", "Python"};

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Employee e = EmployeeFactory.getEmployee(getRandEmployee());

            e.assignSkill(getRandSkill());

            e.task();
        }
    }

    public static String getRandEmployee() {
        Random r = new Random();
        int randInt = r.nextInt(employeeType.length);

        return employeeType[randInt];
    }

    public static String getRandSkill() {
        Random r = new Random();
        int randInt = r.nextInt(skills.length);

        return skills[randInt];
    }

}