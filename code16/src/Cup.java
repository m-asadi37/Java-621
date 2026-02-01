public class Cup {

    int gr;
    String coffee;

    Cup(int gr, String coffee){
        this.gr = gr;
        this.coffee = coffee;
    }

    String print(){
        return (gr + " " + coffee);
    }

}
