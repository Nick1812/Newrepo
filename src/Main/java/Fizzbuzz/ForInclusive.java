package Main.java.Fizzbuzz;

public class ForInclusive {public static int sum(int a){
    int sum=0;
    for(int i=0;i<a;i++){
        if(i%3==0||i%5==0){
            sum+= i;}}
    return sum;
}
    public static void main(String[] args) {
        System.out.println(sum(15));
    }


}
