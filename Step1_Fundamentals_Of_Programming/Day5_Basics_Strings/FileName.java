import java.util.*;

public class FileName {

    //Ques1 : Print ascii value of characaters
    public static void Print_Ascii(String str){
        int n=str.length();

        for(int i=0;i<n;++i){
            System.out.print((int)str.charAt(i)+" "); //LEARN Type Cast=Explicitly
        }

    }

    //Ques2 :Count letters, numbers, and special characters in a string
    public static void Count_Letters_Numbers_Special_Characters(String str){
        int letters=0;
        int numbers=0;
        int special=0;

        int n=str.length();

        for(int i=0;i<n;++i){
            char curr=str.charAt(i);

            if(Character.isLetter(curr)){
                letters++;                              //! num=num+1 or num++
            }else if(Character.isDigit(curr)){
                numbers++;
            }else{
                special++;
            }
        }

        System.out.println("Letters="+letters );
        System.out.println("Numbers="+numbers );
        System.out.println("Special="+special );
    }

    
    //Ques3 : Find the difference between the number of consonants and vowels
    public static void Diff_Vowels_Constants(String str){
        int vowels=0;
        int consonants=0;

        int n=str.length();

        for(int i=0;i<n;++i){
            char curr=str.charAt(i);

            if(curr=='a' || curr=='e' || curr=='i' || curr=='o' || curr=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }

        System.out.println("Vowels="+vowels);
        System.out.println("Consonants="+consonants);

        System.out.println("Diff="+Math.abs(-vowels+consonants));

        //LEARN : (int)Math.pow(base,power) ==> return type double
    }
    //Ques4 : Remove leading, trailing, and extra spaces in a string
    public static void Trim(String str){    
        str=str.trim();
    }

    //Ques5 : Count the number of words in a string
    //^ "Azaan Suhail Software Engineer"
    public static void Count_Words(String str){
        int n=str.length();

        //! split method
        String arr[]=str.split("\\s+"); //& s+ means one or more spaces
        
        System.out.println("Words="+arr.length);           
    }

    //Ques6 : Find the maximum and minimum occurring characters in a string
    public static void main(String[] args) {
        String full_name="Azaan Suhail Software Engineer";
        
        Count_Words(full_name);
    }
}
