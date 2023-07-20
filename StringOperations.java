public class StringOperations {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Subhradeep");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" hi");
        System.out.println(sb);
        sb.append(12);
        System.out.println(sb);
        
    }
}
