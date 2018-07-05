public class Class1 {
    public static void main(String[] args) {
        //System.out.println("Hello world");

        //processParameter("Hello world");                         //1
        //System.out.println(processReturn("Hello world" ));       //2
        //System.out.println(returnSum(7,8, true));                //3
        //System.out.println(returnProduct(7,8, true));            //3
        //iterate();                                               //4
        //arrayValues();                                           //5
        //iterationArrays();                                       //6
        //iterationArrays2();                                      //7


    }

    private static void processParameter(String Sent){
        //String Sentence = Sent;
        System.out.println(Sent);
    }

    private static String processReturn(String Sent){
        //String Sentence = Sent;
        return Sent;
    }

    private static int returnSum(int j, int i, boolean h){
        int jim = j + i;
        int jimothy = j*i;

        if (j == 0){
            return i;
        }else if (i == 0){
            return j;
        }

        if (h == true ) {
            return jim;
        }
        else {
            return jimothy;
        }

    }

    private static int returnProduct(int j, int i, boolean h){
        int jimothy = j*i;
        int jim = j + i;
        if (h == true ) {
            return jimothy;
        }else{
            return jim;
        }

    }

    private static void iterate(){
        int x;
        for(x = 0; x < 10; x++) {

            //System.out.println(ReturnSum(x, 5, true));
            System.out.println(returnProduct(x, 5, true));
        }
    }
    private static void arrayValues(){
        int[] youngArray = {1,2,3,4,5,6,7,8,9,10,};

        for (int eachItem: youngArray){
            //System.out.println(ReturnSum(eachItem, 5, false));
            System.out.println(returnProduct(eachItem, 5, false));

        }

    }

    private static void iterationArrays() {
        int[] youngArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        for (int eachItem : youngArray) {
            System.out.println(eachItem);
        }
    }

    private static void iterationArrays2() {

        int[] youngArray = new int [10];

        for (int x = 0; x < 10; x++ ) {
            youngArray[x] = x;
            System.out.println(youngArray[x]*10);



        }

    }



}












