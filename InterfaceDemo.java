class Watch {
    String watchType = "Digital Watch";
    String watchBrand = "Samsung";

    public void getWatch() {
        System.out.println("Watch Brand - " + watchBrand);
        System.out.println("Watch Type  - " + watchType);
    }
}

interface Android {
    String[] smartfeatures = {"Notifications","Google Maps","Alarm","Music Player","Fitness Tracker"};   

    public void getSmartFeatures();
}

class SmartWatch extends Watch implements Android {
    int price = 7000;

    @Override
    public void getSmartFeatures() {
        System.out.println("Smart Features");
        for (String feature : smartfeatures) {
            System.out.println(feature);
        }
    }

    public void setWatch() {
        super.getWatch();
        price = 9000;
        System.out.println("Price - " + price);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        SmartWatch sw = new SmartWatch();
        sw.setWatch();
        sw.getSmartFeatures();
    }
}
