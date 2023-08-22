public class student {
    private String name;

    private double mark1;
    private double mark2;



    public student (){
        name = "";
        mark1 = 0;
        mark2 = 0;
    }

    public student(String name , double mark1 , double mark2){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.name = name;
    }

    public double getMarks(int marknumber){
        if(marknumber == 1){
            return mark1;
        }
        return mark2;
    }

    public double calcTotal(){
        return mark1 + mark2;
    }


}
