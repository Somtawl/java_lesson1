import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2000);
        System.out.println("Число i =  " + i);
        int n = Integer.toBinaryString(i).length()-1;
        System.out.println("Номер старшего значения бита n =  "+n);
       
              
        short count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if ( j % n == 0) {
                count++;
            }
        }
        System.out.println("Колличество чисел кратных n от i до MAX_VALUE =  "+ count); 
        int[] m1 = new int [count];
        count = 0;
               
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j % n == 0) {
                m1[count++] = j;
                }
        } 

        count = 0;
        //второй массив;
        for (int j = Short.MIN_VALUE; j < i; j++){
            if ( j % n != 0) {
                count++;
            }
        }
        System.out.println("Количество чиел кратных n от i до MIN_VALUE =  "+ count); 
        int[] m2 = new int [count];
        count = 0;
                
        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j % n != 0) {
                m2[count++] = j;
                }
        }
        
        }
}