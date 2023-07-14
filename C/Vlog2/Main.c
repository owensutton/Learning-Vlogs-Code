
#include <stdio.h>


int main(){
    
    char number[100];

    printf("Enter a Number: ");
    scanf("%[^\n]s", number);
    printf("You entered: %s", number);
    return 0;

}
