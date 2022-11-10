public class Programmer extends Person{

    private String companyName;








    //Unique method
    public void coding(){
        System.out.println("Meikinbek is coding at "+companyName +" company");
    }


    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName=companyName;
    }

    //Getter and Setter
    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }


    //toString Method


    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}'+super.toString();
    }
}
