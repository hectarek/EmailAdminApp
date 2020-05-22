public class EmailApp {

    public static void main(String[] args) {
        
        Email inbox = new Email("Billy", "Joel");
        
        System.out.println(inbox.getEmail());
        System.out.println(inbox.getPassword());

        inbox.setNewRandomePassword(10);

        inbox.setDepartment(DepartmentType.ACCOUNTING);

        inbox.setCompany("hillshirefarms");

        inbox.showInfo();


    }

}