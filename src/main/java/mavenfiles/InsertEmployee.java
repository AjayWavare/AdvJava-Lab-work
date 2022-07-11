package mavenfiles;
import java.time.LocalDate;

import java.util.List;
public class InsertEmployee {

	public static void main(String[] args) {

		/*Employee emp=new Employee();
		emp.setEmpno(102);
		emp.setName("ravi");
		emp.setSalary(100);
		emp.setDateOfJoining(LocalDate.of(2022, 10, 10));
		
		EmployeeDao empdao = new EmployeeDao();
		empdao.add(emp);*/
		
		/*EmployeeDao empdao = new EmployeeDao();
		Employee empl=empdao.fetch(102);//here we are searching 102 and in employeeDao it will return emp object we are catching herre
		System.out.println(empl.getName() + " " + empl.getSalary());*/
		
		/*EmployeeDao empdao = new EmployeeDao();
		List<Employee> list = empdao.fetchAll();//here it will give a list as we are fechting all data
		for(Employee emp : list)//for each loop is taken to print each line of list
			System.out.println(emp.getEmpno() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDateOfJoining());*/
		/*EmployeeDao empdao = new EmployeeDao();
		List<String> names =empdao.fetchAllNames();
		for(String name:names)
		System.out.println(name);*/
		
		EmployeeDao empdao = new EmployeeDao();
		List<Object[]> namesal =empdao.fetchNameandSalaries();
		for(Object[]arr:namesal)
			System.out.println(arr[0]+" "+arr[1]);	
	}
}
