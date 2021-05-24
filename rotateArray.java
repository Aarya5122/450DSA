//Pseudocode 1  --> Swaping

public void rotate(long arr[], long n){
  for(int i=0; i<n-1; i++){
    long temp = arr[(int)(i+1)];
    arr[i+1]=arr[0];
    arr[0]=temp;
  }
}


//Pseudocode 2 --> Shifting

public void rotate(long arr[], long n){
  long x = a[(int)(n-1)];
  for(int i=n-1; i>0; i--){
    arr[i] = arr[i-1]
  }
  a[0]=x;
}
