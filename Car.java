class Car {
    String car_name;
    String car_company;
    int car_model;
    int car_milleage;

    Car(){
        System.out.println("Constructor called.....");
    }

    Car(String name, String company, int model, int milleage){
        this.car_name = name;
        this.car_company = company;
        this.car_model = model;
        this.car_milleage = milleage;
    }

    public void printDetails(){
        System.out.println("car name: "+car_name+"\ncar company: "+car_company);
        System.out.println("car model: "+car_model+"\ncar milleage: "+car_milleage);
    }
}
