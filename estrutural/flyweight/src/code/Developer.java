package code;

class Developer implements Employee {

    private final String JOB;
    private String skill;

    public Developer() {
        JOB = "Fix the issue";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("code.Developer with skill: " + this.skill + " with Job: " + JOB);
    }

}