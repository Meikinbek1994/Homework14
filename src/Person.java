public class Person {


    private String name;
    private String designation;




    //Unique Methods

    public void learn(){
        System.out.println(name +" is learning");
    }
    public void walk(){
        System.out.println(name +" is walking");
    }
    public void eat(){
        System.out.println(name +" is eating");
    }


    //Constructor
    public Person(String name, String designation){
        this.name=name;
        this.designation=designation;
    }

    //Getter and Setters

    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
