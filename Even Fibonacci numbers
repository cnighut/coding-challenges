#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
long long int fibonacci(long long int k);

int main(){
    int t; 
    scanf("%d",&t);
    for(int a0 = 0; a0 < t; a0++){
        long long int n; 
        scanf("%lld",&n);
        long long int sum = 0;
        for(long long int i = 0;fibonacci(i)<n;i++){
            sum += fibonacci(i);
        }
        printf("%lld\n", sum);
    }
    return 0;
}

long long int fibonacci(long long int n)
{
  long long int a = 0, b = 2, c, i;
  if( n == 0)
    return a;
  for (i = 2; i <= n; i++)
  {
     c = a + 4*b;
     a = b;
     b = c;
  }
  return b;
}
