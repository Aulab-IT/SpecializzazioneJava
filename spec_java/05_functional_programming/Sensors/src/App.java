public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        //! creiamo una lista o un array di sensori che inizializziamo
        var sensors = new Sensor[] {
            new Sensor(37, 55),
            new Sensor(28, 55),
            new Sensor(44, 55),
            new Sensor(25, 55),
            new Sensor(24, 55),
        };

        Thermometer[] therms = new Thermometer[]{
            new Thermometer(37),
            new Thermometer(28),
            new Thermometer(44),
            new Thermometer(25),
            new Thermometer(24)
        };

        var refrigerators = new RefrigeratorSensor[] {
            new RefrigeratorSensor(28),
            new RefrigeratorSensor(44),
            new RefrigeratorSensor(25),
            new RefrigeratorSensor(24),
        };
            

        // double sum = 0;
        // for (Sensor sensor : sensors) {
        //     sum += sensor.getExternalTemp();
        // }

        // PropertyGetter pGetter = (Object obj) -> ((Sensor) obj).getExternalTemp();

        // PropertyGetter pGetterTerm = (Object obj) -> ((Thermometer) obj).getExternalTemp();

        // System.out.println("La temperatura esterna media presa dai sensori è di " + averageExternalTemp(sensors, pGetter) + " gradi");

        // System.out.println("La temperatura media esterna presa dai termometri  è " + averageExternalTemp(therms, pGetterTerm) + " gradi");

        System.out.println("La temperatura esterna media presa dai sensori è di " + averageExternalTemp(sensors, (Object obj) -> ((Sensor) obj).getExternalTemp()) + " gradi");

        System.out.println("La temperatura media esterna presa dai termometri  è " + averageExternalTemp(therms, (Object obj) -> ((Thermometer) obj).getExternalTemp()) + " gradi");

        System.out.println("La temperatura esterna media presa dai sensori frigo è di " + averageExternalTemp(refrigerators, (Object obj) -> ((RefrigeratorSensor) obj).getExternalTemp()) + " gradi");

    }

    // public static double averageExternalTemp(Sensor[] sensors, PropertyGetter pGetter){

    //     if (sensors.length == 0) {
    //         return 0;
    //     }

    //     double sum = 0;
    //     for (Sensor sensor : sensors) {
    //         //! NON STIAMO PIU' ACCEDENDO ALLA PRORPIETà DIRETTAMENTE SULL'OGGETTO SENSOR
    //         sum += pGetter.getDoubleProperty(sensor); //! non ho effettuato l'accesso diretto all'oggetto sensor ma lo effettua una classe che implementa l'interfaccia PropertyGetter => prende un oggetto e restituisce un double
    //     }
    //     return (sum / sensors.length);
    // }


    // public static double averageExternalTemp(Thermometer[] therms, PropertyGetter pGetter){

    //     if (therms.length == 0) {
    //         return 0;
    //     }

    //     double sum = 0;
    //     for (Thermometer therm : therms) {
    //         sum += pGetter.getDoubleProperty(therm);
    //     }
    //     return (sum / therms.length);
    // }


    //! se lanciamo questa funzione con i sensori e con SensorExternaleTempGetter, restituirà al media calcolata sugli oggetti di classe Sensor
    //! se lanciamo questa funzione con i termometri  e con ThermometerExternaTempGetter, restituirà al media calcolata sugli oggetti di classe Thermometer
    public static <T> double averageExternalTemp(T[] sensors, PropertyGetter pGetter){

        if (sensors.length == 0) {
            return 0;
        }

        double sum = 0;
        for (T sensor : sensors) {
            sum += pGetter.getDoubleProperty(sensor);
        }
        return (sum / sensors.length);
    }



}
