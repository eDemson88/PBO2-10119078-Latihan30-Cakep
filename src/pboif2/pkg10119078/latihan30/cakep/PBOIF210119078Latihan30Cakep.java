/*
 *
 * @author
 * NAMA     :   Adam Firdaus D
 * KELAS    :   IF2
 * NIM      :   10119078
 * DESKRIPSI:   Berisi codingan untuk....... cakeeeppppp
 *
 */
package pboif2.pkg10119078.latihan30.cakep;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String PURPLE = "\u001B[35m";
        String CYAN = "\u001B[36m";
        String jawab;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(RED + "Kamu " + RESET);
        System.out.print(GREEN + "ngerjain sendiri " + RESET);
        System.out.print(YELLOW + "latihan 17 sampe " + RESET);
        System.out.println(BLUE + "latihan 30 ini? " + RESET);
        
        System.out.print(BLUE + "Jawab "+ RESET);
        System.out.print(RED + "(Yoi/Enggak) : " + RESET);
        jawab = scanner.next();
        
        System.out.println("");
        String jawabUp = jawab.toUpperCase();
        
        if(jawabUp.equals("YOI")){
            System.out.print(RED + "Mantep gan. " + RESET);
            System.out.println(PURPLE + "Good Job" + RESET);
        }
        else if (jawabUp.equals("ENGGAK")){
            System.out.println(RED + "Nggak apa apa sih gan. " + RESET);
            System.out.println(CYAN +  "Sing penting paham konsep nya yee " + RESET);
            System.out.println(PURPLE + "Banyak banyak latihan gan, cari cari di google " + RESET);
            System.out.println("Keep the code works dude");
        }
        
    }
    
}
