class EnhancedForLoop{
    public static void main(String[] args) {
        String[] cities = {"Solapur","Mumbai","Pune","Hyderabad","Delhi"};
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
        System.out.println("_________________________________");

        for (String c : cities) {
            System.out.println(c);
        }
    }
}