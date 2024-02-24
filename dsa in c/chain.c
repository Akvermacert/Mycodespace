#include<stdio.h>
#include<limits.h>
#include<stdlib.h>
void PRINT_OPTIMAL_OUTPUT(int s[][],int i,int j){
    if(i==j){
        printf("A%d",i);
    }
    else{
        printf("(");
        PRINT_OPTIMAL_OUTPUT(s,i,s[i][j]);
        PRINT_OPTIMAL_OUTPUT(s,s[i][j]+1,j);
        printf(")");
    }
}
int ChainMatrix(int p[],int n,int a){
    int m[n][n];
    int s[n][n];
    int i,j,k,l,q;
    for(i=0;i<n;i++){
        m[i][i]=0;
    }
    for(l=2;l<=n;l++){
        for(i=1;i<=n-l+1;i++){
            j=i+l-1;
            m[i][j]=INT_MAX;
            for(int k=i;k<=j-1;k++){
                q = m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
                if(q<m[i][j]){
                    m[i][j] =q;
                    s[i][j]=k;
                }
            }
        }
    }
    if(a==1){
        return m[1][n-1];
    }else if (a==0){
        printf("Sequence of multiploication:");
        PRINT_OPTIMAL_OUTPUT(s,i,j);
    }
}
 
int main(){
    int n;
    printf("Enter the number of matrices:\n");
    scanf("%d",&n);
    int p[n+1];
    printf("Enter the order of dimension\n");
    for(int i=0;i<n+1;i++){
        printf("Enter p[%d]",i);
        scanf("%d",&p[i]);
    }
    ChainMatrix(p,n+1,0);
    printf("Minimum number of multiplication is %d\n",ChainMatrix(p,n+1,1));
    
}
