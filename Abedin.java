ls
public class Abedin{

	int[] array = {5, 10, 15, 20};
	public static void main(String[]args){
		System.out.println(30);
		Systen.out.println(40);
		Systen.out.println(50);
		System.out.println(array);
		System.out.println(60);
		System.out.print(80);
	}
	// How to findout maximum value from an Array.
	public static int maximumValue(int[] array){
		int maxValue = array[0];
		for (int i=0; i<array.length; i++) {
			if(array[i]>maxValue){
				maximum = array[i];
			}
			
		}
		return maxValue;
	}

	*/If age is more than 21 then print "You can buy beer."
	else "You are underage.";

	public static void printStatement(int age){
		if(age>=21){
			System.out.println("You can buy beer.")
		}else{
			System.out.println("You are underage.")
		}
	}

	*/ How to find out Even and Odd number by for loop
	and ifelsecondition?

	public static void printEvenAndOddNumber(int number){
		for(int i=1; i<number; i++){
			if(i%2==0){
				System.out.Println("Even number:" +i)
			}else{
				System.out.println("Odd number:" +i)
			}
		}
	}

	*/ Print Number: 0, 3, 6, 9, 12, 15,18.
	public static void printNumbe(int number){
		for(int i=0; i<=number; i=i+3){
			if(i==number){
				System.out.println(i + ".")

			}else{
				System.out.println(i + ",")
			}
		}
	}

		How to convert Array to ArrayList?
		public static ArrayList<Integer> getArrayToList(int[] numArray){
			ArrayList<Integer> numList = new ArrayList<Integer>();
			for(int i=0; i<numArray.length; i++){
				numList.add(numArray[i]);
			}
			return numlist;

		}

		*/ How to Convert ArrayList to Array?

		public static int[] convetArraylistToArray(ArrayList<Integer> numList){
			int[] numArray = new int[numList.size()];
			for(int i=0; i<numList.size(); i++){
				numArray[i] = numList.get(i);
			}
			return numArray;
		}
		*/ How to Sort an Array?
		public static int[] getSortedArray(int[] numArray){
			Arrays.sort(numArray);
			return numArray;
		}

		*/ How to find out length for a text?
		public static int getLength(String text){
			return text.length;
		}

		*/Input one number then return result add with 30?
		public static int getResult(int number){
			return result+30;
		}

		*/ How to sort a List?

		public static ArrayList<Integer> getSortedList(ArrayList<Integer> list){
			Collections.sort(list);
			return list;
		}

		*/ How can you double an Array?

		public static int[] getDoubleArray(int [] x){
			for(int i=0; i<x.length; i++){
				x[i] = x[i]*2;
			}
			return x;
		}

		*/ How to find out sum for given number?

		public static int getSum(int number){
			int sum = 0;
			for( int i=1; i<=number; i++){
				sum+=i;
			}
			return sum;
		}

		How to convert Mile to Kilomiter?

		public static double getMiToKm(double mile){
			double kilomiter = mile*1.6;
			return kilomiter;
		}

		How to convert Integer to String?

		public static String convertIntegerToString(int number){
			String number = String.valueOf(number);
			return number;
		}

		How to convert String to Integer?

		public static int convertStringToInteger(String number){
			int number = Integer.parseInt(number);
			return number;
		}

		Write a method that take one string input & return the count of characters without whitespace.

		public static int getCharacterWithoutWhitespace(String text){
			int count = 0;
			for(int i=0; i<text.length; i++){
				if(text.toLowerCase().charAt(i)!=' '){
					count++;
				}
			}
			return count;
		}

		Write a method that take one String input & return true if it contains char'a' Otherwise return false.

		public static boolean getContainsDicision(String option){
			if(option.toLowerCase().contains('a')){
				return true;
			}else{
				return false;
			}
		}

		Write a method that take one String input and return the count of all vowels.

		public static int getVowelCount(String text){
			int count = 0;
			String [] vowels = {"a", "e", "i", "o", "u"};
			for(int i=0; i<text.length; i++){
				if(vowelCheck(vowels, String.valueOf(text.charAt(i)))){
					count++;
				}
			}
			return count;
		}

		public static boolean vowelCheck(String[] vowels, String character){
			for(int i=0; i<vowels.length; i++){
				if(vowels[i]).equalsIgnorCase(character)){

                   return true;

            }

			}
			return false;
		}
		How to find out repeated character in a text?

		public static List<Object> getRepeatedCharList(String test){

			String newText = text.toLowerCase;

			List<Object> list = new ArrayList<Object>();

			for(int i=0; i<newText.length; i++){

				for(int j=1+j; j<newText.length; j++){

					String firstLetter=String.valueOf(newText.charAt(i));
					String secondLetter=String.valueOf(newText.charAt(j));
					if(firstLetter.equalsIgnorCase(secondLetter)){
						if(!firstLetter.equals(" ") && !list.contains(firstLetter)){
							list.add(firstLetter);
						}
					}

				}
			}

			Object [] array =list.toArray();
			Arrays.sort(array);
			list = Arays.asList(array);
			return list;
		}

	

}
