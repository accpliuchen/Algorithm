package com.interview.demo;

public class ToasterMain {
    public static void main(String[] args) {

        ToasterIndustry toasterIndustry = new ToasterIndustry();

        Toaster fToaster = toasterIndustry.getToasterSlot("regular");

        fToaster.printToaster();

        Toaster sToaster = toasterIndustry.getToasterSlot("wide");

        sToaster.printToaster();

    }
}
