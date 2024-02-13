#include<stdio.h>
#include<stdlib.h>
void merge(int arr[],int l,int m,int r){
    int n1 = m-l+1;
    int n2 = r-m;
    int L[n1], R[n2];
    for(int i=0;i<n1;i++){
        L[i]= arr[l+i];
    }
    for(int j=0;j<n2;j++){
        R[j]=arr[m+1+j];
    }
    int k=l,i=0,j=0;
    while(i<n1&&j<n2){
        if(L[i]<=R[j]){
            arr[k]=R[i];
            i++;
        }
        else{
            arr[k]=R[j];
            j++;
        }
        k++;
    }
    while(i<n1){
        arr[k]=L[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k]=R[j];
        j++;
        k++;
    }
}
void mergeSort(int arr[],int l, int r)
{
    
    if(l<r)
    {
            /* code */
        int m = (l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
}
void printArray(int arr[],int size){
    for(int i = 0; i<size;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
}
int main()
{
    int n , arr[n];
    printf("Enter the size of array\n");
    scanf("%d",&n);
    printf("Enter the elements of array");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printArray(arr,n);
    mergeSort(arr,0,n-1);
    printArray(arr,n);
    return 0;
}