public class Cat implements MyComparable<Cat> {
    int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int CompareTo(Cat c ){
        if(this.weight < c.weight){
            return -1;
        }else if(this.weight > c.weight) {
            return 1;
        }else {return 0;}
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public int compareTo(Cat o) {
        Cat c = o;

        if(this.weight < c.weight){
            return -1;
        }else if(this.weight > c.weight) {
            return 1;
        }else {return 0;}
    }
}
