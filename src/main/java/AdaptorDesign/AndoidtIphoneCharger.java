package AdaptorDesign;

public class AndoidtIphoneCharger implements IphoneInterface{

    AndroidInterface androidinstance;

    public AndoidtIphoneCharger(AndroidInterface androidinstance) {
        this.androidinstance = androidinstance;
    }

    @Override
    public void iphonecharge() {
        androidinstance.androidcharge();
    }
}
