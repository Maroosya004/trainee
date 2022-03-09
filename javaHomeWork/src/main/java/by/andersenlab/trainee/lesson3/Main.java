package by.andersenlab.trainee.lesson3;

public class Main {

    public static void main(String[] args) {
        Employee[] employeeArray = {
                new Employee("Jonah", "Lawyer", "Jonah@gmail.com", "+10764367844",
                7000, 35),
                new Employee("Aaron", "Doctor", "Aaron@gmail.com", "+10976423168",
                        10000, 30),
                new Employee("Jakob", "Engineer", "Jakob@gmail.com", "+1234567890",
                        6500, 45),
                new Employee("Pacey", "Vet", "Pacey@gmail.com", "+1097542579",
                        8000, 27),
                new Employee("Nate", "Accountant", "Nate@gmail.com", "+1089753256",
                        7900, 49)
        };

        for (Employee employee : employeeArray) {
            if (employee.getAge() > 40){
                System.out.println(employee);
            }
        }
    }
}
