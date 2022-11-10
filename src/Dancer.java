public class Dancer extends Person{

    private String groupName;



    //Unique method
    public void dancing(){
        System.out.println("Atai is dancing in "+groupName +" dancing group");
    }


    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName=groupName;
    }

    public String getGroupName(){
        return groupName;
    }
    public void setGroupName(String groupName){
        this.groupName=groupName;
    }


    //toString Method


    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                '}'+super.toString();
    }
}
