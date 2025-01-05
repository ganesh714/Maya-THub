#include<stdio.h>

int main(){
    float n;
    scanf("%f",&n);

    if(h<150)
        printf("Person is Dwarf");
    else if(h<165)
        printf("Person is average heighted");
    else if(h<195)
        printf("Person is taller");
    else
        printf("Abnormal height");

    return 0;
}
