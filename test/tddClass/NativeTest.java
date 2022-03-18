package tddClass;

import chapterTwo.Native;

public class NativeTest {

public static void main (String... args) {
    Native aNative = new Native ();

    System.out.println ("The default name is " + aNative.getName ());
    System.out.println ("The default scvId is " + aNative.getScvId ());

    aNative.setName ("Joseph");
    aNative.setScvId (02);

    System.out.println ("The new name is " + aNative.getName ());
    System.out.println ("The new scvId is " + aNative.getScvId ());

    
}




}
