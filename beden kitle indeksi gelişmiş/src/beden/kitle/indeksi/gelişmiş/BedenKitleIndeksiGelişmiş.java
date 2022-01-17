
package beden.kitle.indeksi.gelişmiş;

import java.util.Scanner;

public class BedenKitleIndeksiGelişmiş {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Kilonuz nedir? ");
        int kilo = scanner.nextInt();
        
        System.out.println("Boyunuz? (örnek : 1,72");
        double boy = scanner.nextDouble();
        
        double bki = (kilo / (boy * boy));
        
        if ( bki < 18.5){
            System.out.println("Zayıfsınız ve beden kitle indeksiniz: "+bki);
        }
        else if ( bki >= 18.55 && bki < 25 ){
            
            System.out.println("Normal ve beden kitle indeksiniz: "+bki);
        }
        else if ( bki >=25 && bki< 30){
            System.out.println("Fazla kilolu ve beden kitle indeksiniz: "+bki);
            
        }
        else {
            System.out.println("Obez ve beden kitle indeksiniz: "+bki);
        }
    }
    
    
}
