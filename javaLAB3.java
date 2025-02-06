import java.util.Scanner;
public class javaLAB3 {
    // TASK 1 CLASS
    static class Employee{
        private final String name;
        private final double basePay;
        private final int hoursWorked;

        public Employee(String name, double basePay, int hoursWorked) {
            this.name = name;
            this.basePay = basePay;
            this.hoursWorked = hoursWorked;
        }

        public double calculateSalary(){
            if(basePay < 8.00 || hoursWorked > 60){
                return -1;
            }
            int overTimeHours = Math.max(0, hoursWorked - 40);
            return (hoursWorked - overTimeHours) * basePay + overTimeHours * basePay * 1.5;
        }
    }
    // END OF THE TASK 1 CLASS

    public static void main(String[] args) {
        // TASK 1
        /*
        Employee[] employees = {
                new Employee("Employee 1", 7.50, 35),
                new Employee("Employee 2", 8.20, 47),
                new Employee("Employee 3", 10.00, 73)
        };

        for(Employee emp: employees){
            double salary = emp.calculateSalary();

            if(salary == -1){
                System.out.println(emp.name + " has no salary");
            }else{
                System.out.println(emp.name + " has a salary of " + salary);
            }
        }
         */
        // END OF THE TASK 1

        // TASK 2
        String[] names = {
                "Alibek",
                "Almaz",
                "Nursultan",
                "Madiyar",
                "Madiyar2",
                "Dauren",
                "Dauren2",
                "Batyr",
                "Nailya",
                "Dayana",
                "Yersultan",
                "Saltanat",
                "Aizhan",
                "Aizhan2",
                "Arai",
                "Dana"
        };

        int[] times = {
                347,
                361,
                423,
                351,
                383,
                354,
                356,
                350,
                419,
                451,
                349,
                424,
                439,
                444,
                440,
                430
        };

        sortStudents(names, times);

        for (int i = 0; i < names.length; i++) {
            if(names[i].equals("Alibek")){
                System.out.println("The fastest student is: " + names[i] + " his time is " + times[i] + "\n");
                i = 1;
            }

            System.out.println("Then there goes: " + names[i] + " with the time " + times[i] + "\n");
        }

        // END OF THE TASK 2
    }

    //TASK 2 METHOD
    public static void sortStudents(String[] names, int[] times){
        int n = times.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(times[j] < times[i]){
                    // Here i am swapping times
                    int tempTime = times[i];
                    times[i] = times[j];
                    times[j] = tempTime;

                    // Now turn for the names of the students
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
    }
    // END OF THE TASK 2 METHOD
}
