package Xenosis_Internship.Assignment3.Q3;

interface Vehicles {
    public void gearchange(int gear);
}

class bicycle implements Vehicles{

    @Override
    public void gearchange(int gear) {
        final int max_gear = 2;
        if(gear < 1 || gear > max_gear){
            System.out.println("Oops !! You can't change bicycle gear ");
        }else {
            System.out.println("Bicycle gear is changed to : "+ gear);
        }
    }
}

class bike implements Vehicles{

    @Override
    public void gearchange(int gear) {
        final int max_gear=3;
        if( gear < 1 || gear > max_gear){
            System.out.println("Oops!! You can't change bike gear");
        }else{
            System.out.println("Bike gear is changed to : "+gear);
        }
    }
}

class car implements Vehicles{

    @Override
    public void gearchange(int gear) {
        final int max_gear = 6;
        if( gear < 1 || gear > max_gear){
            System.out.println("Oops!! You can't change car gear");
        }else{
            System.out.println("Car gear is changed to :"+gear);
        }
    }

    public static void main(String[] args) {
        Vehicles bicycle = new bicycle();
        bicycle.gearchange(1);
        Vehicles bike = new bike();
        bike.gearchange(4);
        Vehicles car=new car();
        car.gearchange(5);
    }
}
