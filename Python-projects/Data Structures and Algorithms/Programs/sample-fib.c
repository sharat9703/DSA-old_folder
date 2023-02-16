#include<stdio.h>

int main(){
    int k;
    int fib(int n){
      if(n<=1){
        return n;
      }
      else{
        return fib(n-1)+fib(n-2);
    }
}
    k = fib(10);

printf("%d",k);

return 0;
}