import Adaptee.WeightMechine;
import Adapter.WeightAdapterInKgs;
import Adapter.WeightAdapterinKG;

public class Main {
    public static void main(String[] args) {
        WeightAdapterinKG eswar = new WeightAdapterInKgs(new WeightMechine());
        eswar.GetWeightInKg();
    }
}