
public class CheckMembershipCtrl {
    private TeamDAO teamDAO;

    public CheckMembershipCtrl() {
        teamDAO = new TeamDAO();
    }

    // complete the checkMembershipDuration method here
    public int checkMembershipDuration(String stuName, String teamName){
        Team team = teamDAO.retrieve(teamName);
        TMSDate dateFormed = team.getDateFormed();

        Student student = team.retrieve(stuName);
        if (student == null) { // because of null pointer exception
            return -1; 
        }
        TMSDate dateJoined = student.getDateJoined();
        return dateJoined.calculateDifference(dateFormed); 
    }
       
}
