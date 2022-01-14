package com.interview.demo;

public class ToasterIndustry {

    public Toaster getToasterSlot(String slotType) {

        if (slotType.equalsIgnoreCase("Regular")) {
            return new RegularSlotToaster();
        } else if (slotType.equalsIgnoreCase("Wide")) {
            return new WideSlotToaster();
        } else {
            return null;
        }
    }
}
