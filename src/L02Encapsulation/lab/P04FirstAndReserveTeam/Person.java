package L02Encapsulation.lab.P04FirstAndReserveTeam;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if(salary < 460.0) {
            throw new IllegalArgumentException("Salary cannot be less than 460.0 leva");
        }
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() < 3) {
            throw new IllegalArgumentException("Fist name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age <= 0) {
            throw new IllegalArgumentException("Age cannot be less than or 0");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva",
                this.getFirstName(),
                this.getLastName(),
                this.getSalary());
    }

    public void increaseSalary(double bonusPercentage) {
        if(this.getAge() < 30 ) {
            this.setSalary(this.getSalary() + (this.getSalary() * bonusPercentage / 200));
        } else {
            this.setSalary(this.getSalary() + (this.getSalary() * bonusPercentage / 100));
        }
    }
}

