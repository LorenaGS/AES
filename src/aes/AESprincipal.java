/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aes;

import java.util.Scanner;

/**
 *
 * @author Sango
 */
public class AESprincipal {

    /**
     * @param args the command line arguments
     */
    public static String[][] SBox ={
    {"63","7C","77","7B","F2","6B","6F","C5","30","01","67","2B","FE","D7","AB","76"},
    {"CA","82","C9","7D","FA","59","47","F0","AD","D4","A2","AF","9C","A4","72","C0"},
    {"B7","FD","93","26","36","3F","F7","CC","34","A5","E5","F1","71","D8","31","15"},
    {"04","C7","23","C3","18","96","05","9A","07","12","80","E2","EB","27","B2","75"},
    {"09","83","2C","1A","1B","6E","5A","A0","52","3B","D6","B3","29","E3","2F","84"},
    {"53","D1","00","ED","20","FC","B1","5B","6A","CB","BE","39","4A","4C","58","CF"},
    {"D0","EF","AA","FB","43","4D","33","85","45","F9","02","7F","50","3C","9F","A8"},
    {"51","A3","40","8F","92","9D","38","F5","BC","B6","DA","21","10","FF","F3","D2"},
    {"CD","0C","13","EC","5F","97","44","17","C4","A7","7E","3D","64","5D","19","73"},
    {"60","81","4F","DC","22","2A","90","88","46","EE","B8","14","DE","5E","0B","DB"},
    {"E0","32","3A","0A","49","06","24","5C","C2","D3","AC","62","91","95","E4","79"},
    {"E7","C8","37","6D","8D","D5","4E","A9","6C","56","F4","EA","65","7A","AE","08"},
    {"BA","78","25","12","1C","A6","B4","C6","E8","DD","74","1F","4B","BD","8B","8A"},
    {"70","3E","B5","66","48","03","F6","0E","61","35","57","B9","86","C1","1D","9E"},
    {"E1","F8","98","11","69","D9","8E","94","9B","1E","87","E9","CE","55","28","DF"},
    {"8C","A1","89","0D","BF","E6","42","68","41","99","2D","0F","B0","54","BB","16"}};
    
    public static String[][] ETabla={
    {"01","03","05","0f","11","33","55","ff","1A","2E","72","96","A1","F8","13","35"},
    {"5F","E1","38","48","D8","73","95","A4","F7","02","06","0A","1E","22","66","AA"},
    {"E5","34","5C","E4","37","59","EB","26","6A","BE","D9","70","90","AB","E6","31"},
    {"53","F5","04","0C","14","3C","44","CC","4F","D1","68","B8","D3","6E","B2","CD"},
    {"4C","D4","67","A9","E0","3B","4D","D7","62","A6","F1","08","18","28","78","88"},
    {"83","9E","B9","D0","6B","BD","DC","7F","81","98","B3","CE","49","DB","76","9A"},
    {"B5","C4","57","F9","10","30","50","F0","0B","1D","","","","","",""},
    {"","","","","","","","","","","","","","","",""},
    {"","","","","","","","","","","","","","","",""},
    {"","","","","","","","","","","","","","","",""},
    {"","","","","","","","","","","","","","","",""},
    {"","","","","","","","","","","","","","","",""},
    {"","","","","","","","","","","","","","","",""},
    {"","","","","","","","","","","","","","","",""},
    {"","","","","","","","","","","","","","","",""},
    {"","","","","","","","","","","","","","","",""},
    {"","","","","","","","","","","","","","","",""}};
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner opcion1 = new Scanner(System.in);
        int opcion_menu;
        int opcion_menu1;
        do{
            menu();
            opcion_menu = opcion1.nextInt();
            
            switch(opcion_menu){
                case 1:{
                    menu1();
                    opcion_menu1 = opcion1.nextInt();
                    String hexNumber = "6A";
                    int decimal = Integer.parseInt(hexNumber, 16);
                    System.out.println("Hex value is " + decimal);
                    String [][] mensaje={{"41","65","75","61"},{"45","73","79","63"},{"53","20","20","69"},{"20","6D","66","6C"}};
                    String [][] key={{"2B","28","AB","09"},{"7E","AE","F7","CF"},{"15","D2","15","4F"},{"16","A6","88","3C"}};
                    break;
                }
                case 2:{
                    menu2();
                    opcion_menu1 = opcion1.nextInt();
                    break;
                }
            }
        }while(opcion_menu!=3);
    }
    
    private static void menu() {
        System.out.println("\n Bienvenido a la implementación de AES");
        System.out.println(" Creado por:");
        System.out.println(" Deici Lorena Gomez Suarez");
        System.out.println(" David Fernando Espinel Sarmiento");
        System.out.println("Opciones disponibles: ");
        System.out.println("1. Encriptar mensaje");
        System.out.println("2. Desencriptar mensaje");
        System.out.println("3. Salir");
        System.out.println("Ingrese su opción: ");
    }
    
    private static void menu1() {
        System.out.println("1. Encriptar mensaje");
        System.out.println("Seleccione el metodo de ingreso:");
        System.out.println("   1. 128");
        System.out.println("   2. 192");
        System.out.println("   3. 256");
        System.out.println("Ingrese su opción: ");
    }
    
    private static void menu2() {
        System.out.println("1. Desencriptar mensaje");
        System.out.println("Seleccione el metodo de ingreso:");
        System.out.println("   1. 128");
        System.out.println("   2. 192");
        System.out.println("   3. 256");
        System.out.println("Ingrese su opción: ");
    }
    
}
