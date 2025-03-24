package n1.n1ex1.Models;

import java.util.Objects;

public class Month {
    private String name;

    public Month(String name){
        this.name = name;
    }

    public String getName(){
    return this.name;
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Month month = (Month) obj;
        return Objects.equals(this.name, month.name);
    }

   @Override
   public int hashCode(){
       return Objects.hash(name);
   }

    @Override
    public String toString(){
        return this.name;
    }
}
