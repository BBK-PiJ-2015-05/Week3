/*
 * Week 3 Day 5
 * 3. Paper Sizes
 */

class PaperSizes {
    
    public static class Paper{
        int width;
        int height;
        String name;
        
        public Paper (){
            this.width = 841;
            this.height = 1189;
            this.name = "A0";
        }
    }
    
    public static Paper calcSize(String a){
        int length = a.length();
        String num = a.substring(1, length);
        int size = Integer.parseInt(num);
        Paper A0 = new Paper();
        A0.name = num;
        if (size == 0 && length == 2){
            return A0;
        }else if(a.length() > 2 && size == 0){
            isBigger(A0);
            return A0;
        }else{
            for (; size > 0; size --){
                int temp = A0.width;
                A0.width = (A0.height / 2);
                A0.height = temp;
            }
            return A0;
        }
    }
    
    public static Paper isBigger(Paper zeros){
        int length = zeros.name.length();
        if(length > 1){
            zeros.name = zeros.name.substring(0, (length - 1));
            int temp = zeros.width;
            zeros.width = zeros.height;
            zeros.height = temp * 2;
            isBigger(zeros);
        }
        return zeros;
    }
}
