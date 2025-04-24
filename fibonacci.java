/*
step1-> first 2 numbers of fib series is 1.
step2->3rd number will be the sum of last two number.
step3->to move forward beyond third number, we are setting 1st number as 2nd number and, 2nd number as 3rd and so on.
step4-> we will iterate till the nth number to find nth fib number
step5-> nth fib number will be the sum of n-1 and n-2.
*/
int fb(int n)
{
    int n1=1;// first fib num
    int n2=1;// second fib num
    int result =0; //result is nth fib number

    for(int i=3; i<=n;i++)
    {
         result=n1+n2; //adding previous 2 number
         n1=n2; //changing the first number to second number
         n2=result; // changing the second number to result for calculation of next fib num
    }

    return result;
}
