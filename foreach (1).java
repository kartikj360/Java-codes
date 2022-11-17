class foreach{
    public static void main(String []args) {
        int ary[] = {11,13,15,16,17};
        int count=0;
        for(int a: ary)
        {
            count++;
            if(a%2==0){
                System.out.println("Multiple of 2 terminates the loop using break statement");
                break;
                }
            if(count==2){
                System.out.println("2nd term is skipped using continue statement");
                continue;
            }
            System.out.println(a);  
        }
    }
}