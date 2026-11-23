public class AeroportPart2 {

    public static void main(String[] args) {
        AeroportEx3 aeroport = new AeroportEx3();

        // Apelam metoda cu diferite valori pentru parametrul 'destinatie'
        aeroport.AnnounceFlight("Paris");
        aeroport.AnnounceFlight("Tokyo");
        aeroport.AnnounceFlight("Bucuresti");
    }
}
