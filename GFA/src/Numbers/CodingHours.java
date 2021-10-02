package Numbers;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int GFA = 6;
        int semWEEK = 17;
        int hoursWEEK = 52;
        float HouPerSem = (17*5)*6;
        float per = (100/HouPerSem)*hoursWEEK;
        System.out.println(HouPerSem);
        System.out.println(per + "%");


    }
}
