
import java.util.Date;
public class Person {
private String name;
private String address;
private String phoneNumber;
private String email;
public Person(String name, String address, String phoneNumber, String email) {
this.name = name;
this.address = address;
this.phoneNumber = phoneNumber;
this.email = email;
}
@Override
public String toString() {
return "Person: " + name;
}
}
class Student extends Person {
static final String STATUS_FRESHMAN = "Freshman";
private static final String STATUS_SOPHOMORE = "Sophomore";
private static final String STATUS_JUNIOR = "Junior";
private static final String STATUS_SENIOR = "Senior";
private String status;
public Student(String name, String address, String phoneNumber, String email, String status) {
super(name, address, phoneNumber, email);
this.status = status;
}
@Override
public String toString() {
return "Student: " + super.toString();
}
}
class Employee extends Person {
private String office;
private double salary;
private Date dateHired;
public Employee(String name, String address, String phoneNumber, String email, String office,
double salary, Date dateHired) {
super(name, address, phoneNumber, email);
this.office = office;
this.salary = salary;
this.dateHired = dateHired;
}
@Override
public String toString() {
return "Employee: " + super.toString();
}
}
class Faculty extends Employee {
private String officeHours;
private String rank;
public Faculty(String name, String address, String phoneNumber, String email, String office,
double salary, Date dateHired, String officeHours, String rank) {
super(name, address, phoneNumber, email, office, salary, dateHired);
this.officeHours = officeHours;
this.rank = rank;
}
@Override
public String toString() {
return "Faculty: " + super.toString();
}
}
class Staff extends Employee {
private String title;
public Staff(String name, String address, String phoneNumber, String email, String office,
double salary, Date dateHired, String title) {
super(name, address, phoneNumber, email, office, salary, dateHired);
this.title = title;
}
@Override
public String toString() {
return "Staff: " + super.toString();
}
}

