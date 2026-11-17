
    public class Vehicle {
        int passengers, wheels, maxspeed, burnup;
        public static void main() {
            Vehicle masina = new Vehicle();
            masina.passengers = 2;
            masina.wheels = 4;
            masina.maxspeed = 130;
            masina.burnup = 30;

            Vehicle autobuz = new Vehicle();
            autobuz.passengers = 45;
            autobuz.wheels = 4;
            autobuz.maxspeed = 100;
            autobuz.burnup = 25;

            double time = 0.5;
            System.out.print("Automobilul cu " + masina.passengers + " pasageri ");
            masina.distanta(time);
            System.out.print("Autobuzul cu " + autobuz.passengers + " pasageri ");
            autobuz.distanta(time);


        }
        void distanta(double interval){
            double value = maxspeed * interval;
            System.out.println("va parcurge o distanta egala cu " + value + " km");
        }
    }
