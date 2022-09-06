class Main {
  public static void main(String[] args) {
    int i,j;
    int rows=5;
    for(i=0;i<=5;i++){
      for(j=0; j<5; j++){
        System.out.print("* ");
      }
      System.out.println();
    }

    for ( i = 1; i <= rows; ++i) {
      for ( j = 1; j <= i; ++j) {
        System.out.print(" * ");
      }
      System.out.println();
    }
    
  }
}