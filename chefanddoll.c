#include<stdio.h>
int main(void){
int t;
scanf("%d",&t);
while(t--){
int n;
scanf("%d",&n);
int h[100001]={0};
for(int i=0;i<n;i++){
int x;
scanf("%d",&x);
h[x]++;
}
for(int i=0;i<=100000;i++)
if(h[i]%2){
printf("%d\n",i);
break;
}
}
return 0;
}