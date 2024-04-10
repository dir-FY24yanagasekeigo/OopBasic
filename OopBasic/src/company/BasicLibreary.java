package company;

public class BasicLibreary {

    public static void main(String[] args) {
        String A = new String("Hello");
        String B = new String("Hello");
        String C = A;
        
        System.out.println(A==B);
        System.out.println(A==C);
        
        System.out.println(A.equals(B));
        
        Double D = 3.14;
        System.out.println(D.toString());
        
        System.out.println(D.hashCode());
        
                

    }

}
