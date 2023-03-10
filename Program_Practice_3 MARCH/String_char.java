/*Find Uppercase, Lowercase, Digits, Special characters, Space */

class String_char{
  public static void main(String[] args){
    int upr=0, lwr=0, dg=0, sc=0, sp=0;

    String s = "pranali sahare 678@gmail.com";
    char c[]=s.tocharArray();
    int leng=c.length;

   for(int i=0;i<c.length;i++){
  if(c[i]>='A' && c[i]<='Z')
  {

  upr++;
  //System.out.println("Uppercase value " +c[i]);

  }

  elseif(c[i]>='a' && c[i]<='z')
  {

  lwr++;

  }

  elseif(c[i]>='0' && c[i]<='9')
  {

  dg++;

  }

  elseif(c[i]==' ')
  {

  sp++;

  }

  else{

  sc++;

  }

    }

  }
}