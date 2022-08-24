public class FindPattern {

    public static void main(String[] args) {
        char inputArray[]={
                'p','a','s','t','i','t','s','i','o',' ',
                'm','a','k','e','s',' ',
                't','h','e',' ',
                'd','a','y'
        };

        reverseString(inputArray,0 , inputArray.length-1);
        reverseWords(inputArray);
    }


    private static void reverseString(char[] inputArray,int begin, int end){
        while (begin<end){
            char tmp=inputArray[begin];
            inputArray[begin]=inputArray[end];
            inputArray[end]=tmp;
            begin++;
            end--;
        }
        System.out.println(inputArray);
    }

    private static  void reverseWords(char[] inputArray){
        int begin=0;
        int i=0;
        while (i<inputArray.length){
            if (inputArray[i] == ' '){
                reverseString(inputArray,begin,i-1);
                begin=i+1;
            }
            if (i==inputArray.length-1)
                reverseString(inputArray,begin,i);

            i++;
        }

    }


}
