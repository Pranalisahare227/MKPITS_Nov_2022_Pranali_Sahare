
/*12.	Write a Java program to print the alphabet set in decimal and character form.*/

class alphabetset_assig12 {
    public static void main(String[] argu) {
        int j = 0;
        char i;

System.out.println("For Small letter");

        for ( i = 'a'; i <= 'z'; i++,j++) {
		j = i;
            System.out.println(" " + i+ " " + j);
            //j++;
        }

     System.out.println("For Capital letter");

        int k = 0;
        char l;

        for(l= 'A';l<='Z';l++,k++){
			k = l;
		System.out.println(" " + l+ " " + k);
	}
    }

}
