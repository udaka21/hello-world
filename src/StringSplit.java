/**
 * Created by udaka on 11/7/16.
 */
public class StringSplit {
    public static void main(String[] args) {
        String a = "1 ; a , 2 ; b , 3 ; c";


        String[] abc = a.split(",");
        int abcLength = abc.length;

        String[] id= new String[abcLength];
        String[] queueName = new String[abcLength];

        for (int i =0 ; i < abcLength ;  i++){
            System.out.println(abc[i]);
            id[i] = abc[i].split(";")[0];
            queueName[i] = abc[i].split(";")[1];
            System.out.println(id[i]);
        }
    }

}
