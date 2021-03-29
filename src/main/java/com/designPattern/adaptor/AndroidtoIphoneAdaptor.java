package com.designPattern.adaptor;

public class AndroidtoIphoneAdaptor implements Iphone {
    Android androidphone ;

    public AndroidtoIphoneAdaptor(Android androidphone) {
        this.androidphone = androidphone;
    }


    @Override
    public void charge() {
        androidphone.charge();
    }
}
