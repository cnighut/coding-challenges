#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int t;
    scanf("%d",&t);
    for(int a0 = 0; a0 < t; a0++){
        long int n; 
        long int qou_5,qou_3,qou_15;
        long long int a,b,c; 
        scanf("%ld",&n);
        qou_5 = (n-1)/5;
        qou_15 = (n-1)/15;
        qou_3 = (n-1)/3;
        a = 5*((qou_5)*(qou_5+1)/2);
        c = 15*((qou_15)*(qou_15+1)/2);
        b = 3*((qou_3)*(qou_3+1)/2);
        printf("%lld\n", a+b-c);
    }

    return 0;
}
