import java.util.Scanner;

public class Email {
    
    private String firstName, lastName, company, password, altEmail;
    private DepartmentType department;
    private int inboxCapacity;


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = DepartmentType.NONE;
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
    public void setDepartment() {
        System.out.println("Enter a Department: SALES, DEVLOPMENT, ACCOUNTING, or NONE");
        Scanner in = new Scanner(System.in);
        String dept = in.nextLine();

        switch (dept){
            case "sales":
            case "Sales":
            case "SALES":
                this.department = DepartmentType.SALES;
                break;
            case "development":
            case "Development":
            case "DEVELOPMENT":
                this.department = DepartmentType.DEVELOPMENT;
                break;
            case "accounting":
            case "Accounting":
            case "ACCOUNTING":
                this.department = DepartmentType.ACCOUNTING;
                break;
            case "none":
            case "None":
            case "NONE":
                this.department = DepartmentType.NONE;
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
        return firstName + "." + lastName + "@" + department + "." + company + ".com";
    }

    private String generateRandomPassword(int len) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
        char [] password = new char[len];

        for (int i=0; i<len; i++) {
            int rand = (int) (Math.random()*passwordSet.length());
            System.out.println(rand);
            password[i] = passwordSet.charAt(rand);
        }
        
        String newPass = new String(password);

        return newPass;
    }


    


}