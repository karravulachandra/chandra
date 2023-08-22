#include <stdio.h>

int main(void) {
	// your code goes here
	int n,m;
	scanf("%d%d",&n,&m);
	int r[n+1],c[n+1];
	int rmax=0,cmax=0;
	for(int i=0;i<=n;i++){
	  r[i]=0;
	  c[i]=0;
	}
	for(int i=0;i<m;i++){
	  char s[10];int x,y;
	  scanf("%s%d%d",s,&x,&y);
	  if(s[0]=='R'){
	    r[x]+=y;
	    if(r[x]>rmax)
	    rmax=r[x];
	  }
	  else{
	    c[x]+=y;
	    if(c[x]>cmax)
	    cmax=c[x];
	  }
	}
	printf("%d",rmax+cmax);
	return 0;
}

