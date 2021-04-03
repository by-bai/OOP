public class SearchCtrl {
    private InterestGroupDAO IGDM;

    public SearchCtrl() {
        IGDM = new InterestGroupDAO();
    }

    public Student searchPresident(String IGName, int year) {
        // 1.1.1: retrieve(IGName)   

        InterestGroup interestGroup = IGDM.retrieve(IGName); // returns InterestGroup object

        // 1.1.2: retrievePresidentInYear(year)
        if (interestGroup != null) {
            return interestGroup.retrievePresidentInYear(year); // returns Student object
        }

        return null;
    }
}
