public class Main {
    public static void main(String[] args ){

        int [] n=new int [7];
        n[0]=12;
        n[1]=24;
        n[2]=28;
        n[3]=37;
        n[4]=33;
        n[5]=46;
        n[6]=48;
        int sum=0;
for (int i = 0; i <= n.length-1; i++){

    sum+=n[i];

}
double avg = sum/n.length;
        System.out.println("Average = " + avg);
System.out.println("***********\n");



    }
}