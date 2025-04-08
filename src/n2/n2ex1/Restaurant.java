package n2.n2ex1;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int points;

    public Restaurant(String name, int points){
        this.name = name;
        this.points = points;
    }

    public String getName(){
        return this.name;
    }
    public int getPoints(){
        return this.points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, points);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
    Restaurant other = (Restaurant) obj;
    return Objects.equals(name, other.name) && points == other.points;
    }

    @Override
   public String toString(){
        return this.name + " : " + this.points + ";";
    }
}
