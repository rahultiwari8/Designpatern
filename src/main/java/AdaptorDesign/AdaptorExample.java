package AdaptorDesign;

public class AdaptorExample {

    public static void main(String[] args) {
        AndroidInterface Oneplus = new OnePlus6();
        AndroidCharger androidCharger = new AndroidCharger();

        androidCharger.charge(Oneplus);


        IphoneInterface IphoneX =new IphoneX();
        IphoneCharger iphoneCharger = new IphoneCharger();

        iphoneCharger.charge(IphoneX);

        AndoidtIphoneCharger andoidtIphoneCharger = new AndoidtIphoneCharger(Oneplus);

        andoidtIphoneCharger.iphonecharge();


        }
    }



