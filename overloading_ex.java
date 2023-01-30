class overloading_ex{

static int sum(int a, int b){

  return(a+b);

}

int sum(int a, int b, int c){

return(a+b+c);

}

int sum(int a, int b, int c, int d){

return(a+b+c+d);
}
void sum(){

}


public static void main (String[] args)
{

System.out.println(sum(2, 3));

}

}

