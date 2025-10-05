public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car c=new Car("Toyata", "Grande", 5000000, "Xyz123", 15.5, 8.5);
        Car c1=new Car("Honda", "Civic", 9000000, "ABC123", 13, 9);
        Car c2=new Car("Suzuki", "Wagnor", 3500000, "tre34r5", 16,6.5 );
        Carlist original = new Carlist();
      original.addcar(c);
      original.addcar(c1);

        System.out.println("Original List:");
        original.Printallcars();

        // Clone the list
        Carlist cloned = (Carlist) original.clone();

        cloned.addcar(c2);

        System.out.println("After modifying cloned list:");
        System.out.println("Original:");
        original.Printallcars();

        System.out.println("Cloned:");
        cloned.Printallcars();
    }
}
