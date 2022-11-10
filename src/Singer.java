public class Singer extends Person{

    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }


    //unique method
    public void singing(){
        System.out.println("Nick Carter is singing in "+bandName +" group");
    }
    public void playGuitar(){
        System.out.println("He also plays guitar in "+bandName +" group");
    }



    //Constructors



    //Getter and Setter
    public String getBandName(){
        return bandName;
    }
    public void setBandName(String bandName){
        this.bandName=bandName;
    }


    //toString Method


    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}'+super.toString();
    }
}

