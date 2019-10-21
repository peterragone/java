public class Diploma
{
    protected String studentName;
    protected String courseName;
    protected String diplomaStatement;

    public Diploma(String student, String course)
    {
        this.studentName = student;
        this.courseName = course;
        this.diplomaStatement = "This certifies that " + studentName + "\n" + "has completed a MOOC in " + courseName;
    }

    @Override
    public String toString()
    {
        return diplomaStatement;
    }
}
