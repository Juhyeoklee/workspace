#include <iostream>
#include <stdio.h>
using namespace std;

int main(){

    int num1;
    int num2;
    
    scanf("%d", &num1);
    scanf("%d", &num2);

    int il_of_num2 = num2 % 10;
    int sip_of_num2 = int((num2 % 100) / 10);
    int baek_of_num2 = int(num2 / 100);

    printf("%d\n", il_of_num2 * num1);
    printf("%d\n", sip_of_num2 * num1);
    printf("%d\n", baek_of_num2 * num1);
    printf("%d\n", il_of_num2 * num1 + sip_of_num2 * num1 * 10 + baek_of_num2 * num1 * 100);


    return 0;
}