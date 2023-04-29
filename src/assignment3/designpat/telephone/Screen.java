package assignment3.designpat.telephone;

/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 * System.out.println("hello");
 */





public class Screen {
    enum ObserverEnum implements PhoneModel.Observer {
        DIGITPRINTER {
            @Override
            public void update(PhoneModel phoneModel, int digit) {
                System.out.println(digit);
            }
        },
        DIALINGPRINTER {
            @Override
            public void update(PhoneModel phoneModel, int digit) {
                long phoneNumber = 0;
                for(int i = 0; i < phoneModel.getDigits().size(); i++){
                    phoneNumber = phoneNumber * 10 + phoneModel.getDigits().get(i);
                }

                //we assume within the assignment that the user stops after entering 10 digits
                if(phoneModel.getDigits().size()==10){
                    System.out.println("Now dialing "+phoneNumber+"...");
                }
            }
        };
    }

    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;

    }
}
