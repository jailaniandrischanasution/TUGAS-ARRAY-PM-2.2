import java.util.*;

public class GeserElemen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan angka geser: ");
        int geser = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        
        String[] kataArray = kalimat.split("");
        int panjang = kataArray.length;
        
        geser = geser % panjang;
        
        List<String> kataList = Arrays.asList(kataArray);
        
        Collections.rotate(kataList, -geser);
        
        System.out.println(String.join("", kataList));
        
        scanner.close();
    }
}
