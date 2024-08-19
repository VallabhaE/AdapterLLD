package Adapter;

import Adaptee.WeightMechine;

public class WeightAdapterInKgs implements WeightAdapterinKG{
    WeightMechine obj;
    public WeightAdapterInKgs(WeightMechine obj) {
        this.obj = obj;

    }
    @Override
    public void GetWeightInKg() {
        System.out.println("Weight in pounds: "+ obj.getWeightMechine()+"\nWeight in Kgs: "+obj.getWeightMechine()*.45);
    }
}
