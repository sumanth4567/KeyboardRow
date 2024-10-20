import java.util.*;
public class KeyboardRow {
    public String[] findWords(String[] words) {
        // String r1 = "qwertyuiop";
        // String r2 = "asdfghjkl";
        // String r3 = "zxcvbnm";
        // List<String> list = new ArrayList<>();

        // for (int i = 0; i < words.length; i++) {
        //     String[] a = words[i].toLowerCase().split("");
        //     boolean isValid = true;
        //     String temp = "";a
        //     if (r1.contains(a[0])) {
        //         temp = r1;
        //     } else if (r2.contains(a[0])) {
        //         temp = r2;
        //     } else if (r3.contains(a[0])) {
        //         temp = r3;
        //     }

        //     for (int j = 1; j < a.length; j++) {
        //         if (!temp.contains(a[j])) {
        //             isValid = false;
        //             break;
        //         }
        //     }

        //     if (isValid) {
        //         list.add(words[i]);
        //     }
        // }
        // return list.toArray(new String[list.size()]);

        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM"; 
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int count1=0,count2=0,count3=0,len=words[i].length();
            for(int j=0;j<len;j++){
                if(s1.contains(Character.toString(words[i].charAt(j))))
                    count1++;
                else if(s2.contains(Character.toString(words[i].charAt(j))))
                    count2++;
                else if(s3.contains(Character.toString(words[i].charAt(j))))
                    count3++;
                if(count1==len || count2==len || count3==len)
                    list.add(words[i]);
            }
        }
        String ans[] = new String[list.size()];
        list.toArray(ans);
        return ans;
    }
    public static void main(String[] args) {
        KeyboardRow kr=new KeyboardRow();
        String words[]={"Hello","Alaska","Dad","Peace"};
        words=kr.findWords(words);
        System.out.println(Arrays.toString(words));
    }
}
