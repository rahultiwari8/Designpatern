package com.designPattern.adaptor;

public class AdaptorExample {
    public static void main(String[] args) {

        AndroidCharger androidCharger = new AndroidCharger();
        Android androidphone = new Oneplus5();

        androidCharger.charge(androidphone);


        Iphone iphone = new Iphone10();
        IphoneCharger iphoneCharger =new IphoneCharger();

        iphoneCharger.charge(iphone);

        AndroidtoIphoneAdaptor androidtoIphoneAdaptor = new AndroidtoIphoneAdaptor(androidphone);

        iphoneCharger.charge(androidtoIphoneAdaptor);




    }
}
