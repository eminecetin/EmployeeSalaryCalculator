
public class Employee {
	
	 private String name;
     private double salary;
     private int workHours, hireDate;
     
     Employee(int hireDate, int workHours, double salary, String name){
  	   this.name=name;
  	   this.salary=salary;
  	   this.workHours=workHours;
  	   this.hireDate=hireDate;
  	   
     }
     public double tax() {
  	   if(this.salary>=1000) {
  		   return salary*0.03;
  	   }
  	   return 0.0;
     }
     public double bonus() {
  	   int exHours=this.workHours-40;
  	   if(exHours>0) {
  	   return 30*exHours;
  	   }
  	   return 0.0;
     }
     public double raiseSalary(){
  	   
  	   int year =2021-this.hireDate;
  	   if(year<10) {
  		   return salary;
  	   }else if(year>=10 && year<20) {
  		   return salary*0.10;
  	   }else {
  		   return salary*0.15;
  	   }
     }
     
     
     public void toString(Employee emp1) {
  	   System.out.println("Name: " + name);
  	   System.out.println("Salary: " + salary);
  	   System.out.println("Work Hourse: " + workHours);
  	   System.out.println("Hire Year: " + hireDate);
  	   System.out.println("Tax: " + emp1.tax());
  	   System.out.println("Bonus: " + emp1.bonus());
  	   System.out.println("Raise Salary: " + emp1.raiseSalary());
  	   double totaSalary=emp1.salary-emp1.tax()+emp1.bonus();
  	   System.out.println("Total salary with tax and bonus:  " + totaSalary );
  	   System.out.println("Total salary: "+ (emp1.salary+emp1.raiseSalary()+emp1.bonus()-emp1.tax()));

     }

}
