#include <stdio.h>

int main(){
    int i,n,a = 0,b = 1;
    scanf("%d",&n);
    
    for ( i = 1; i <= n; i++)
    {
        printf("%d ",a);
        b = a+b -(a=b);
        a = a + b;
    }
}

