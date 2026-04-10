class concurenceEleInArrayUsinfForEach
{
    public static void main(String[] args)
    {
        int[] numArray={1,2,3,4,5,6,7,8,2,11,23,2,11};
        int num2=23;
        int con=0;
        for(int num:numArray)
        {
          if(num==num2)
          {
            con++;
          }
        }
        System.out.println("The number is repeated : "+con);

    }
}
