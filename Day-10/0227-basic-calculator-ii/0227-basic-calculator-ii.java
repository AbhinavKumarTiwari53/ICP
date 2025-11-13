class Solution {
    public int calculate(String str) {
        Stack<Integer> s=new Stack<>();
        char x='+';
        int sum=0;
        for(int i=0; i<str.length(); i++) {
            char c=str.charAt(i);
            if(Character.isDigit(c)) {
                sum=sum*10+(c-'0');
            }
            if((!Character.isDigit(c) && c!=' ') || i==str.length()-1) {
                if(x=='+') {
                    s.push(sum);
                } else if (x=='-') {
                    s.push(-sum);
                } else if(x =='*') {
                    s.push(s.pop() * sum);
                } else if(x=='/') {
                    s.push(s.pop() / sum);
                }
                x=c;
                sum=0;
            }
        }
        int result=0;
        while(!s.isEmpty()) {
            result+=s.pop();
        }
        return result;
    }
}