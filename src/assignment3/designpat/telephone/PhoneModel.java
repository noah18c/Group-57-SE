package assignment3.designpat.telephone;

import java.util.ArrayList;
import java.util.List;

/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */

/**
 * Store a phone number, digit-by-digit
 */


public class PhoneModel {

    interface Observer{
        public void update(PhoneModel phoneModel, int digit);
    }
    private List<Integer> digits = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyAllObservers(this, newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(PhoneModel phoneModel, int newDigit){
        for(Observer observer: observers){
            observer.update(this, newDigit);
        }
    }


}
