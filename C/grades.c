#include<stdio.h>
int main(){
    int m1,m2,m3,m4,m5;
    scanf("%d%d%d%d%d",&m1,&m2,&m3,&m4,&m5);
    float per = (m1 + m2 + m3 + m4 + m5)/5;
    if(per >= 90)
    	printf("Grade A");
    else if (per >= 80)
        printf("Grade B");
    else if (per >= 70)
        printf("Grade C");
    else if (per >= 60)
        printf("Grade D");
    else if (per >= 40)
        printf("Grade E");
    else 
        printf("Grade F");
}
