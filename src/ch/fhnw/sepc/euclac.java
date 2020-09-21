package ch.fhnw.sepc;

import javax.swing.*;
import java.util.Scanner;

public class euclac {


 void prt(){
     Scanner scanner = new Scanner(System.in);
     System.out.print("Bestellwert eingeben: ");
     String bs = scanner.next();
 }


    public static void main(String[] args) {
        euclac ec = new euclac();
        ec.prt();
    }


}

