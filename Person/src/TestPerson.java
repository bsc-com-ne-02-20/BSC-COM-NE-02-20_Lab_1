import java.sql.Date;

public class TestPerson {
public static void main(String[] args) {
Person person = new Person("Bently Tembo", "Mzuzu", "1110001", "bentlytembo@gmail.com");
System.out.println(person);
Student student = new Student("Richard Mwale", "Lilongwe", "1110101",
"richardmwale@gmail.com", Student.STATUS_FRESHMAN);
System.out.println(student);
Employee employee = new Employee("Memory Nyirenda", "Brantyre", "1010101",
"memorynyirenda@email.com", "100", 10000, new Date(0));
System.out.println(employee);
Faculty faculty = new Faculty("Ivy Nkhambule", "Mzimba", "1001010", "ivynkhambule@gmail.com",
"203", 80000, new Date(0), "7am-5pm", "Associate");
System.out.println(faculty);
Staff staff = new Staff("Joseph Phiri", "Rumphi", "1010111", "josefhphiri@gmail.com",
		null, 75000, new Date(0), "7am-5pm");
}
}
