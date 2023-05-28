package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {

    public void calculateSalary(int salary) {
        if(salary > 0 ){
            if(salary <= 10000) {
                int tax = (int) (salary * 0.15);
                float salaryWithTax = salary - tax;
                System.out.println(salaryWithTax);
            }
            if(salary > 10000 && salary <= 20000) {
                int tax = (int) (salary * 0.18);
                float salaryWithTax = salary - tax;
                System.out.println(salaryWithTax);
            }
            if(salary > 20000) {
                int tax = (int) (salary * 0.20);
                float salaryWithTax = salary - tax;
                System.out.println(salaryWithTax);
            }
        }else {
            System.out.println("wrong input!");
        }
    }
}
