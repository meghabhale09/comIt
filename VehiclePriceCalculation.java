import java.util.Random;

public class VehiclePriceCalculation {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[20];
        String[] names = new String[]{"Name1","Name2","Name3","Name4","Name5","Name6","Name7","Name8","Name9","Name10",
                "Name11","Name12","Name13","Name14","Name15","Name16","Name17","Name18","Name19","Name20"};
        String[] types = new String[]{"Family", "Public Transport", "Commercial"};
        float[] values = new float[]{100000, 80000, 50000, 100000, 40000, 100000, 80000, 50000, 100000, 40000, 100000,
                80000, 50000, 100000, 40000, 100000, 80000, 50000, 100000, 40000};
        for(int i=0;i < vehicles.length;i++){
            vehicles[i] = new Vehicle(names[i],types[new Random().nextInt(types.length)],values[i]);

            float gst = gstCalc(vehicles[i].getCommercialValue()); float discount, additionalCost,finalCost = 0;
            finalCost = vehicles[i].getCommercialValue() + gst;;


            if(vehicles[i].getType().equalsIgnoreCase("family") && vehicles[i].getCommercialValue()<=50000){
                discount = gst*50/100;
                finalCost -=  discount;
            }else if ((!vehicles[i].getType().equalsIgnoreCase("family")) && vehicles[i].getCommercialValue()>=80000){
                additionalCost = vehicles[i].getCommercialValue() *5/100;
                finalCost +=  additionalCost ;
            }

            if(finalCost < 80000){
                finalCost = finalCost - (vehicles[i].getCommercialValue()*5/100);
            }

            System.out.println("Name\t" + vehicles[i].getName() + "\ttype\t" + vehicles[i].getType() +
                    "\tCommercialValue\t"+ vehicles[i].getCommercialValue() + "\tFinal price\t"+ finalCost  );
        }



    }

    public static float gstCalc(float commercialValue){
            if(commercialValue > 100000)  return commercialValue*20/100;
            else return commercialValue*16/100;
    }
}
