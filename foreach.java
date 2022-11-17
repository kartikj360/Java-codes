class foreach{
    public static void main(String[] args) {
        int num[]={0,1,2,3,4,5,6,7,8,9,10};
        for(int x : num){
            System.out.println("Value is : "+x);
            x=x*10;
            System.out.println("Value after multipying by 10 : "+x);
        }
        int xyz[]={3,6,6,8,45,24,65,23,46,768,126};
        for (int x : num)
        {
            System.out.println("Value of "+x+" term in xyz array is :- "+xyz[x]);
        }
        
    }
}