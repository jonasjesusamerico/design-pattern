package code;

import java.util.HashMap;

class EmployeeFactory {
    private static final HashMap<String, Employee> m = new HashMap<>();

    public static Employee getEmployee(String type) {
        Employee p = null;
        if(m.get(type) != null) {
            p = m.get(type);
        } else {
            switch (type) {
                case "code.Developer" -> {
                    System.out.println("code.Developer Created");
                    p = new Developer();
                }
                case "code.Tester" -> {
                    System.out.println("code.Tester Created");
                    p = new Tester();
                }
                default -> System.out.println("No Such Employee");
            }

            m.put(type, p);
        }
        return p;
    }
}