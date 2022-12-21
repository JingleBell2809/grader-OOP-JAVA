#include <stdio.h>

int main()
{
    double Fah ;
    double Cel ;
    printf("Enter Fahrenheit : ") ;
    scanf("%lf" , &Fah) ;
    Cel = 5.0/9* (Fah-32) ;
    printf("%.4f Fahrenheit = %.4f Celsius",Fah,Cel) ;
    return 0 ;
}


