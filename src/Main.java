import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int i,p,aver; //p-median
        int sum=0;
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        Arrays.sort(m);
        System.out.println("min value is: "+m[0]);
        System.out.println("max value is: "+m[m.length-1]);
        for (i=0; i<=m.length-1; i++){
            sum+=m[i];}
        aver=sum/(m.length-1);
        System.out.println("average is: "+aver);
        p= m[m.length/2];
        System.out.println("median is: "+p); }}
