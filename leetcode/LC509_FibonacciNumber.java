class Solution {
    public int fib(int n) {
        if(n<=1){
          return n;
        }
          int n0=0;
          int n1=1;
        for(int i=2;i<=n;i++){
            int next=n0+n1;
            n0=n1;
            n1=next;
        }

        return n1;
    }
}
