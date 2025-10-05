public class Car implements Cloneable {

    private String CarBrand;
    private String Model;
    private String Engineno;
    private double FuelAverage;
    private double Price;
    private double ComfortLevel;

    public Car(){

    }
    public Car(  String CarBrand,  String Model,double Price ,String Engineno,double FuelAverage, double ComfortLevel){
    this.CarBrand=CarBrand;
    this.Model=Model;
    this.FuelAverage=FuelAverage;
    this.Price=Price;
    this.ComfortLevel=ComfortLevel;
    this.Engineno=Engineno;

    }
    public Car( Car other ){
     this.CarBrand=other.CarBrand;
    this.Model=other.Model;
    this.FuelAverage=other.FuelAverage;
    this.Price=other.Price;
    this.ComfortLevel=other.ComfortLevel;
    this.Engineno=other.Engineno;

    }
    public String getCarBrand(){
        return CarBrand;

    }
    public String getModel(){
        return Model;
    }
    public double getFuelAverage(){
        return FuelAverage;
    }
    public double  getPrice(){
        return Price;
    }
    public double getComfortLevel(){
        return ComfortLevel;
    }
    public String getEngineno(){
        return Engineno;
    }
    public String toString(){
        return "Car Brand is "+getCarBrand()+"\n"+
        "Model is "+getModel()+"\n"+
        "Engine no is"+getEngineno()+"\n"+
        "Price is"+" "+getPrice()+"\n"+
        "Fuel Average is"+" "+getFuelAverage()+"Km/hr"+"\n"+
        "Comfort level is"+" "+getComfortLevel()+"/10";
    }
    @Override
    public Object clone() {
        try {
            Car cloned= (Car)super.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
            return null;
        }
    }


}