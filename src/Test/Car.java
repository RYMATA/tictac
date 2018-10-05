package Test;

public class Car {
     private String mark, model, type;
    Car(String mark, String  model,String type){
        this.mark=mark;
        this.model=model;
        this.type=type;

    }
    public void setMark(String mark){
        this.mark = mark;

    }
    public  String getMark(){
      return mark;
    }
}
