import java.util.ArrayList;

public class Carlist implements Cloneable {
    private ArrayList<Car>car=new ArrayList<>();

    public void addcar(Car c){
        boolean exist=false;
        for (int i = 0; i < car.size(); i++) {
            if (c.getEngineno().equals(car.get(i).getEngineno())) {
              exist=true;
              break;
            }
        }   
                if (exist) {
        System.out.println("Car is already Present");
            System.out.println("------------------------");
    } else {
        car.add(c);
        System.out.println("Car added Successfully");
            System.out.println("------------------------");
    }
    }
    public void removecar(String Engineno){
        boolean exist=false;
    for (int i = 0; i < car.size(); i++) {
        if (Engineno.equals(car.get(i).getEngineno())) {
            car.remove(i);
            System.out.println("Car having Engine no"+Engineno+"removed");
                System.out.println("------------------------");
            exist=true;
            break;
        }
    }
    if (!exist) {
         System.out.println("Car does not exist");
             System.out.println("------------------------");
    }    
   
    }
    
 public void Printallcars() {
    if (car.isEmpty()) {
        System.out.println("No cars in the list.");
    } else {
        for (int i = 0; i < car.size(); i++) {
            System.out.println("Car " + (i+1) + ":");
            System.out.println(car.get(i)); 
            System.out.println("------------------------");
        }
    }
}
public void findBestCarByFuelEfficiency() {
    for (int i = 0; i < car.size() - 1; i++) {
        for (int j = 0; j < car.size() - i - 1; j++) {
            if (car.get(j).getFuelAverage() < car.get(j + 1).getFuelAverage()) {
                // swap
                Car temp = car.get(j);
                car.set(j, car.get(j + 1));
                car.set(j + 1, temp);
            }
        }
    }
    System.out.println("Cars sorted according to Fuel Efficiency (Best first).");
    
    
    if (!car.isEmpty()) {
        System.out.println("Best Car by Fuel Efficiency:");
        System.out.println(car.get(0)); // after sorting, best car will be first
         System.out.println("------------------------");
    }
}


public void sortcarbyprice(){
    for (int i = 0; i < car.size()-1; i++) {
        for (int j = 0; j < car.size()-i-1; j++) {
            if (car.get(j).getPrice()<car.get(j+1).getPrice()) {
                Car temp=car.get(j);
              car.set(j, car.get(j + 1));
                car.set(j + 1, temp);
            }
        }
    }
    System.out.println("Cars Sorted Acc to Price");
     System.out.println("------------------------");
     
}
 @Override
 public Object clone()throws CloneNotSupportedException{
Carlist clonedlist=(Carlist)super.clone();
clonedlist.car=new ArrayList<>();

for (int i = 0; i < car.size(); i++) {
    Car orignal=car.get(i);
    Car cloned=(Car)orignal.clone();
    clonedlist.car.add(cloned);

}
return clonedlist;
 }
 }


    
    

