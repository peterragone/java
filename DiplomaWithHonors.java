public class DiplomaWithHonors extends Diploma
{
    public DiplomaWithHonors(String student, String course)
    {
        super(student, course);
        this.diplomaStatement = super.diplomaStatement + "\n" + "*** with honors ***";    
    }
}
