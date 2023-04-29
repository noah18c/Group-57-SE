package assignment3.designpat.telephone;

/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */

public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 10;

        // Build the object graph
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model);
        KeyPad keyPad = new KeyPad(model);
        model.attach(Screen.ObserverEnum.DIGITPRINTER);
        model.attach(Screen.ObserverEnum.DIALINGPRINTER);

        // Run the program
        keyPad.simulateKeyPresses(NUM_DIGITS);
    }
}
