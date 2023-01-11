public class App {
    public static void main(String[] args) throws Exception {
        Integer numero = 10;
        String x = "";
        for(Integer i = 1; i < numero + 1;i++){
            for(int j =0 ; j< i ; j++){
                x =  x + i.toString();
            }
            System.out.println(x);
            x = "";
        }
        
    }
}
