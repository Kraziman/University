public class Assignment4 {
    public static void main(String[]args){
        String finalWord, firstTwoNum, firstLet, secondLet;
        for(int i = 0; i < 99; i++){
            if(i<10){
                firstTwoNum = "0" + i;
            }
            else{
                firstTwoNum = String.valueOf(i);
            }
            for(char j = 'a'; j < 'z'; j++){
                finalWord = firstTwoNum;
                firstLet = finalWord + j;
                for(char k = 'a'; k < 'z'; k++){
                    finalWord = firstLet;
                    secondLet = finalWord + k;
                    for(int l = 0; l < 9; l++){
                        finalWord = secondLet + l;
                        System.out.println(finalWord);
                    }
                }
            }
        }
    }
}