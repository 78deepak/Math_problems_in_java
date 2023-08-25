public class Reverse_number {
    public static void rev(int num , String s){
        if(num==0){
            int i=Integer.parseInt(s);
            System.out.println(i);
            return;
        }
        int x = num%10;
        s += x;
        rev(num/10,s);
    }
    public static void main(String[] args) {
        int num = 674;
        String s = "";
        rev(num,s);
    }
}
