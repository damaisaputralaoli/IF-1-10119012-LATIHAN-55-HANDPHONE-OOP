
package pbo10119012latihan55;

/**
 *  NAMA   : DAMAI SAPUTRA LAOLI
 *  KELAS  : IF-1
 *  NIM    : 10119012
 * @author damai
 */
public class PBO10119012Latihan55 {

    
    public static void main(String[] args) {
        Android phone1 = new Android("Samsung","Android","Grand",3000000);
        phone1.setKeyStore("234ibfd3840fo");
        phone1.displayProduct();
        System.out.printf("Android Key Store : %s%n%n", phone1.getKeyStore());

        Blackberry phone2 = new Blackberry("BlackB","RIM","Curve",2000000);
        phone2.setPinBB("BHS249");
        phone2.displayProduct();
        System.out.printf("PIN               : %s%n%n", phone2.getPinBB());

        WindowsPhone phone3 = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        phone3.setWpKeyStore("UUUQIJWORJ");
        phone3.displayProduct();
        System.out.println("Wp Key Store      : " + phone3.getWpKeyStore());

    }
}

