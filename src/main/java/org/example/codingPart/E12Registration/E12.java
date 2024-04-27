package org.example.codingPart.E12Registration;
/*
Create Registration Class in which you would have variables such as email, userName and password that have an access scope
only within its own class. After creating an object of the class, the user should be able to call methods and in each method
separately pass values to set users email, username and password.
   Requirements:
   ● Valid email consider to be only yahoo
   ● Valid userName and password cannot be empty and should be of length larger than 6 characters.
     Also, valid passwords cannot contain userName.
 */
public class E12 {
    public static void main(String[] args) {
        Registration user = new Registration();
        user.setEmail("milo123@yahoo.com");
        user.setUserName("KittenLove");
        user.setPassword("OnePassword234");
        user.displayInformation();
    }
}
class Registration{
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email){
        if(isValidEmail(email)){
            this.email = email;
        }else {
            System.out.println("Invalid email. Provide Yahoo email");
        }
    }
    public void setUserName(String userName){
        if(isValidUserName(userName)){
            this.userName = userName;
        }else{
            System.out.println("Invalid UserName. Username cannot be empty and should be 6 characters long.");
        }
    }
    public void setPassword(String password){
        if(isValidPassword(password)){
            this.password = password;
        }else{
            System.out.println("Invalid password. Password cannot contain username.");
        }
    }
    private Boolean isValidEmail(String email){
        return email.endsWith("yahoo.com");
    }
    private Boolean isValidUserName(String userName){
        return !userName.isEmpty() && userName.length() > 6;
    }
    private Boolean isValidPassword(String password){
        return !password.isEmpty() && password.length() >6 && !password.contains(userName);
    }
    public void displayInformation(){
        System.out.println("User information:");
        System.out.println("Email: "+email);
        System.out.println("Username: "+userName);
        System.out.println("Password: "+password);
    }

}
