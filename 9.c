#include <stdio.h>
int main()
{
 int second , minute , hour , day ;
 scanf("%d" , &second) ;
 day = second / 86400 ;
 hour = second/60/60%24 ;
 minute = (second % 3600) / 60 ;
 printf("%d days %d hours %d minutes " , day , hour , minute) ;
 return 0 ;
}
