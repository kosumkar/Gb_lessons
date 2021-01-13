public class Employee {


    private String FullName;
    private String WorkPosition;
    private String Email;
    private String PhoneNumber;
    private int Salary;
    private int Age;

    public Employee(String FullName, String WorkPosition, String Email, String PhoneNumber, int Salary, int Age) {
        this.FullName = FullName;
        this.WorkPosition = WorkPosition;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Salary = Salary;
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }


    public void InfoSysOut() {
        System.out.printf("Данные сотрудника %s :%n", FullName);
        System.out.printf("Возраст: %s. Работает в позиции: %s. Зарплата: %s. Email: %s. Номер: %s %n", Age, WorkPosition, Salary, Email, PhoneNumber);
        System.out.println(" ");
    }


}

