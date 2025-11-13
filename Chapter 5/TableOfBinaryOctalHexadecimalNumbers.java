public class TableOfBinaryOctalHexadecimalNumbers{
    public static void main(String[] args){
        for(int i=1;i<=256;i++){
            System.out.println(i+" "+Integer.toBinaryString(i)+" "+Integer.toOctalString(i)+" "+Integer.toHexString(i));
        }
    }
}