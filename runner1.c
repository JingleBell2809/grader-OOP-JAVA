#include <stdio.h>

int main()
{
    int dis = 14;
    double time = ((30.0/60.0)+45)/60;   // convert to hour      
    double speed_kilo = dis/time;  // speed in kilometers     
    double speed_miles = speed_kilo/1.6;  // convert to miles  
    printf("Speed = %f miles/hour",speed_miles);
    return 0 ;
}

