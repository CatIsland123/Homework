import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemonRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random r=new Random();
		 int  [] a=new int[10];
       for(int i=0;i<10;i++) {
    	   a[i]=r.nextInt(99);
       }
       for(int i=0;i<10;i++) {
    	   System.out.print(a[i]+" ");
       }
       System.out .println();
       
       int [] a1=new int[10];
       System.arraycopy(a, 0,a1, 0, 10);
       System.out .println("复制后得到的数组：");
       for(int i=0;i<10;i++) {
    	   System.out.print(a1[i]+" ");
       }
       System.out .println();
       System.out .println("排序后：");
       Arrays.parallelSort(a1);
       for(int i=0;i<10;i++) {
    	   System.out.print(a1[i]+" ");
       }
       System.out .println();
       System.out .println("请输入要查询的值：");
       Scanner s=new Scanner(System.in);
       int x=s.nextInt();
       int find=-1;
       if((find=Arrays.binarySearch(a1, x))>-1) 
    	   System.out.println("找到值位于索引"+find+"位置");
       else
    	   System.out.println("找不到指定值");
    	   
      
	}

}
