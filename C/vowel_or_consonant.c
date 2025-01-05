#include<stdio.h>
int  main() {
	char ch ;
    scanf("%c",&ch);
	if(ch > 91)
		ch -= 32;
	if (ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ) 
		printf("VOWEL");
	else
		printf("CONSONANT");
	
    return 0;
}    
