public class DiplomaTester
{
    public static void main(String[] args)
    {
        Diploma diploma1 = new Diploma("Adam Smith", "Gardening");
        System.out.println(diploma1);
        System.out.println();

        Diploma diploma2 = new DiplomaWithHonors("Betsy Smith", "Robotics");
        
        System.out.println(diploma2);
        System.out.println();
    }
}
