public class SensorExternalTempGetter implements PropertyGetter {
    public double getDoubleProperty(Object obj){
        Sensor s = (Sensor) obj;
        return s.getExternalTemp();    
    }
}
