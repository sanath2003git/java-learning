public class StringPractice {
    public static void main(String[] args) {

        String firstName = "Harry";
        String lastName = "Grow";
        String email = "harry.grow@example.com";


        String fn=firstName.toLowerCase();
        String ln=lastName.toLowerCase();
        String username = fn+ln;
        email = email.replace("example", "gmail");
        System.out.print("Username: "+username);
        System.out.print("\nEmail: "+email);
        int position= email.indexOf("@");
        System.out.println("\n@ position: "+position);

    }
}