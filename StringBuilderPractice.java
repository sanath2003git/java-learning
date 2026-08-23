public class StringBuilderPractice {
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(4, " Awesome");
        sb.reverse();
        System.out.println("Final StringBuilder: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("First character: " + sb.charAt(0));
        String cs =sb.toString();
        System.out.println("Converted String: " + cs );
    }
}
