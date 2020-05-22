import java.util.Scanner;

public class Email {
    
    private String firstName, lastName, company, password, altEmail;
    private DepartmentType department;
    private int inboxCapacity;


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = "n/a";
        this.department = DepartmentType.NONE;
        this.inboxCapacity = 500;
        this.altEmail = getNewAltEmail();
        this.password = generateRandomPassword(10);

        System.out.println("Email Created: " + this.firstName + " " + this.lastName);
        System.out.println("Password has been created, please desired deparement with setDepartment()");
    }

    public Email(String firstName, String lastName, String company, DepartmentType department, int inboxCapacity, String altEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.department = department;
        this.inboxCapacity = inboxCapacity;
        this.altEmail = altEmail;
        this.password = generateRandomPassword(10);
    }

    //Setters and Getters

    public String getFirstname() {
        return firstName;
    }
    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }
    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getPassword() {
        return password;
    }
    public void setNewRandomePassword(int len) {
        this.password = generateRandomPassword(len);
        System.out.println("Password has been changed!");
    }
    
    public DepartmentType getDepartment() {
        return department;
    }
    public void setDepartment(DepartmentType dept) {
        this.department = dept;
    }

    public void setDepartment() {
        System.out.println("Enter a Department: SALES, DEVLOPMENT, ACCOUNTING, or NONE");
        Scanner in = new Scanner(System.in);
        String dept = in.nextLine();

        switch (dept){
            case "sales":
            case "Sales":
            case "SALES":
                this.department = DepartmentType.SALES;
                System.out.println("Department set to: " + this.department);
                break;
            case "development":
            case "Development":
            case "DEVELOPMENT":
                this.department = DepartmentType.DEVELOPMENT;
                System.out.println("Department set to: " + this.department);
                break;
            case "accounting":
            case "Accounting":
            case "ACCOUNTING":
                this.department = DepartmentType.ACCOUNTING;
                System.out.println("Department set to: " + this.department);
                break;
            case "none":
            case "None":
            case "NONE":
                this.department = DepartmentType.NONE;
                System.out.println("Department set to: " + this.department);
                break;
            default: 
                System.out.println("Invalid input, no department added.");
                break;
        }
        in.close();
    }

    public int getInboxCapacity() {
        return inboxCapacity;
    }
    public void setInboxCapacity(int inboxCapacity) {
        this.inboxCapacity = inboxCapacity;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }
    

    //Other Methods 

    public String getEmail() {
        String dept = (String) department.toString().toLowerCase();
        return firstName + "." + lastName + "@" + dept + "." + company + ".com";
    }

    private String getNewAltEmail() {
        String dept = (String) department.toString().toLowerCase();
        return firstName + "." + lastName + "1@" + dept + "." + company + ".com";
    }

    private String generateRandomPassword(int len) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
        char [] password = new char[len];

        for (int i=0; i<len; i++) {
            int rand = (int) (Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        
        String newPass = new String(password);

        return newPass;
    }

    public void showInfo() {
        System.out.println("Name: " + getFullName());
        System.out.println("Company Email: " + getEmail());
        System.out.println("Mailbox Capacity: " + getInboxCapacity());
        System.out.println("Alt Email: " + getNewAltEmail());
        System.out.println("Department: " + getDepartment());
        System.out.println("Account Password: " + getPassword());
    }

    


}