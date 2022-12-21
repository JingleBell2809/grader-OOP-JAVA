#include <stdio.h>

int main()
{
int dis = 24;
    double time = ((35.0/60.0)+40)/60+1;  // convert to hour
    double speed_miles = dis/time;  // speed in miles      
    double speed_kilo = speed_miles*1.6;  // convert to kilometers
    printf("Speed = %f kilometers/hour",speed_kilo);
    return 0 ;
}
