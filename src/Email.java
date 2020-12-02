import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength =8;
    private String department;
    private String email;
    private int mailBoxCapacity=500;
    private String alternateEmail;
    private String companySuffix ="xyzcompany";

    // Constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: "+this.firstName+" "+ this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: "+this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: "+this.password);

        // Combine element to generate an email
        this.email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        System.out.println("Your email is: "+this.email);

    }
    // Ask for the department

    private String setDepartment(){
        System.out.print("Department Codes:\n1 for Sales\n2 for Development\n3 Accounting\n0 None\nEnter " +
                "department: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        String dep="";
        switch (depChoice){
            case 1:
                dep="Sales";
                break;
            case 2:
                dep="Development";
                break;
            case 3:
                dep="Accounting";
                break;
            case 4:
                break;
        }
        return dep;

    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        char[] password = new char[length];
        for(int i=0; i<length;i++){
            int rand =(int) (Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    // Set the alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }
    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }
}
