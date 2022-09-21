public class splitString {
    public static void main(String args []){
        String source1 = "Dog09March032021Express";
        String [] returnedArray1 = source1.split("\\d+");
        for(String str1 :  returnedArray1){
            System.out.println(" Output1 : "+str1);
        }
        String source2 = "950-003-123-900-456 : 11 _343-1 789----";
        String [] returnedArray2 = source2.split("-",4);
        for(String str2 :  returnedArray2){
            System.out.println(" Output2 : "+str2);
        }

    }

}
