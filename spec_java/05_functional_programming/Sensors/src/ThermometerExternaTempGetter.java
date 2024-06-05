public class ThermometerExternaTempGetter implements PropertyGetter {
    public double getDoubleProperty(Object obj){
        Thermometer s = (Thermometer) obj;
        return s.getExternalTemp();
    }
}
