package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StringToNumber {

	final String hundred = "hundred";
	final String thousand = "thousand";
	final String million = "million";
	final String billion = "billion";
	final String trillion = "trillion";
	final String quadrillion = "quadrillion";
	final String quintillion = "quintillion";

	Map<String, Long> map = new HashMap<String, Long>();
	Map<String, Long> tenths = new HashMap<String, Long>();

	public static void main(String[] args) {
		StringToNumber obj = new StringToNumber();
		Scanner sc = new Scanner(System.in);
		obj.map.put("zero", 0L);
		obj.map.put("one", 1L);
		obj.map.put("two", 2L);
		obj.map.put("three", 3L);
		obj.map.put("four", 4L);
		obj.map.put("five", 5L);
		obj.map.put("six", 6L);
		obj.map.put("seven", 7L);
		obj.map.put("eight", 8L);
		obj.map.put("nine", 9L);
		obj.map.put("ten", 10L);
		obj.map.put("eleven", 11L);
		obj.map.put("twelve", 12L);
		obj.map.put("thirteen", 13L);
		obj.map.put("fourteen", 14L);
		obj.map.put("fifteen", 15L);
		obj.map.put("sixteen", 16L);
		obj.map.put("seventeen", 17L);
		obj.map.put("eighteen", 18L);
		obj.map.put("nineteen", 19L);
		obj.map.put("twenty", 20L);
		obj.map.put("thirty", 30L);
		obj.map.put("forty", 40L);
		obj.map.put("fifty", 50L);
		obj.map.put("sixty", 60L);
		obj.map.put("seventy", 70L);
		obj.map.put("eighty", 80L);
		obj.map.put("ninety", 90L);

		obj.tenths.put(obj.hundred, 100L);
		obj.tenths.put(obj.thousand, 1000L);
		obj.tenths.put(obj.million, 1000000L);
		obj.tenths.put(obj.billion, 1000000000L);
		obj.tenths.put(obj.trillion, 1000000000000L);
		obj.tenths.put(obj.quadrillion, 1000000000000000L);
		obj.tenths.put(obj.quintillion, 1000000000000000000L);
		

		System.out.println("Please enter a number in words : ");
		String input = sc.nextLine().toLowerCase();
		obj.convertStringToNumber(input);
		
//		Test following Words:
		ArrayList<String> inputArray = new ArrayList<String>();
		inputArray.add("nine hundred three million four hundred sixty one thousand five hundred seventy one");
		inputArray.add("nine hundred three million four hundred sixty one thousand five hundred seventy");
		inputArray.add("one thousand two hundred thirty");
		inputArray.add("six billion forty five million three thousand two hundred twenty one");
		inputArray.add("two hundred thirty four million  ");
		inputArray.add("two hundred ten million          ");
		inputArray.add("three hundred million            ");
		inputArray.add("fifty four million ten");
		inputArray.add("fifty four million sixty one");
		inputArray.add("fifty four million               ");
		inputArray.add("seven million                    ");
		inputArray.add("hundred four million "); //(false case)
		inputArray.add("nine hundred quadrillion six billion forty five million three thousand two hundred twenty one");
		inputArray.add("one quintillion one quadrillion one trillion one billion one million one thousand one hundred eleven");

		boolean evaluate = false;
		
//		Un-comment Below line to convert above strings to numbers 
//		evaluate = true;
		
		if(evaluate) {
			for ( String s1 : inputArray) {
				obj.convertStringToNumber(s1);
			}
			System.out.println("Long max value : " + Long.MAX_VALUE);
			System.out.println("Balance after qunitillion : " + (Long.MAX_VALUE - 1001001001001001111L));
		}
		
//		Long ones = 0L;
//		Long tens = 0L;
		
//        if(wordLength == 1) {
//        	if (map.containsKey(inpArr[0])) {
//        		number = map.get(inpArr[0]);
//        	} else if (tenths.containsKey(inpArr[0])) {
//        		number = map.get(inpArr[0]);
//        	}
//        } else if (wordLength <=2) {
//        	String first = inpArr[0];
//        	String second = inpArr[2];
//        	
//        	if (map.containsKey(second) && map.containsKey(first)) {
//        		number = map.get(first) + map.get(second);
//        	} else if (map.containsKey(first) && tenths.containsKey(second)) {
//        		number = map.get(first) * map.get(second);
//        	}
//        }
//        for(int i=0; i< wordLength-1; i+=2) {
//        	String eve = inpArr[i];
//        	String odd = inpArr[i+1];
//
//        	if(map.containsKey(eve)) {
//        		ones = map.get(eve);
//        	} else if (tenths.containsKey(odd)) {
//        		tens = map.get(odd);
//        	}
//        	number = ones*tens;
//        	ones=0L;
//        	tens=0L;
//        }

//        int i=0;
//        for(String w : inpArr) {
//        	if(map.containsKey(w)) {
//        		ones = map.get(w);
//        	} else if (tenths.containsKey(w)) {
//        		tens = map.get(w);
//        	}
//        	
//        }

	}
	
	private Long parseNumber(ArrayList<String> strArray, int fromIndex, int toIndexExclusive, String multiplier) {
		Long ret =-1L;
		List<String> sub = strArray.subList(fromIndex, toIndexExclusive);
		Long result = processWords(sub);
		if (result < 0) {
			System.out.println("Please enter valid input. Try again!");
//			System.exit(1);
		} else {
			ret =  result * tenths.get(multiplier);
		}
		return ret;
	}

	private Long processWords(List<String> list) {
		Long ret = 0L;
		int length = list.size();

		switch (length) {
		case 1:
			ret = map.get(list.get(0));
			break;
		case 2: {
//	        fifty four million
			if (map.containsKey(list.get(0)) && map.containsKey(list.get(1))) {
				ret = map.get(list.get(0)) + map.get(list.get(1));
			} else if (map.containsKey(list.get(0)) && tenths.containsKey(list.get(1))) {
//		        three hundred million
				ret = map.get(list.get(0)) * tenths.get(list.get(1));
			} else if (tenths.containsKey(list.get(0)) && map.containsKey(list.get(1))) {
//		        hundred four million (false case)
				ret = -1L;
			}
		}
			break;
		case 3: {
//	        two hundred ten million
			if (map.containsKey(list.get(0)) && tenths.containsKey(list.get(1)) && map.containsKey(list.get(2))) {
				List<String> firstTwo = list.subList(0, 2);
				ret = processWords(firstTwo);
				if (ret < 0) {
					ret = -1L;
				} else {
					ret += map.get(list.get(2));
				}
			} else {
				ret = -1L;
			}
//			ninety three hundred million (wrong)
		}
			break;
		case 4: {
//	     	  two hundred thirty four million
			if (map.containsKey(list.get(0)) && tenths.containsKey(list.get(1)) && map.containsKey(list.get(2))
					&& map.containsKey(list.get(3))) {
				List<String> firstThree = list.subList(0, 3);
				ret = processWords(firstThree);
				if (ret < 0) {
					ret = -1L;
				} else {
					ret += map.get(list.get(3));
				}
			}
		}
			break;
		}
		return ret;
	}

	private boolean isValid(int arrayLength, ArrayList<String> inpArr) {
		boolean ret = true;
		if (arrayLength < 1) {
			System.out.println("Please enter valid input. Try again!");
			return false;
		}

		for (String s : inpArr) {
			if (map.containsKey(s)) {
//        		valid = true;
			} else if (tenths.containsKey(s)) {
//        		valid = true;
			} else {
				System.out.println("Contains Invalid Number: " + s);
				System.out.println("Please enter valid input. Try again!");
				return false;
			}
		}
		return ret;
	}
	
	private ArrayList<String> getArrayListFromString(String input) {
		String[] inpArr = input.split(" ");
		ArrayList<String> strArray = new ArrayList<String>(Arrays.asList(inpArr));
		return strArray;
	}
	
	public void convertStringToNumber(String input) {
		if (input!=null) {
			input = input.toLowerCase();
			input = input.trim();
			System.out.println("Input : " + input);
		}
		Long number = 0L;
		ArrayList<String> strArray = getArrayListFromString(input);
		int wordLength = strArray.size();
		
		if (!isValid(wordLength, strArray)) {
			return;
		}
		
		int indexThousand = strArray.indexOf(thousand);
		int indexMillion = strArray.indexOf(million);
		int indexBillion = strArray.indexOf(billion);
		int indexTrillion = strArray.indexOf(trillion);
		int indexQuadrillion = strArray.indexOf(quadrillion);
		int indexQuintillion = strArray.indexOf(quintillion);
		int indexHundred = strArray.lastIndexOf(hundred);

		int lastKnownIndex = -1;
		
//   	two hundred thirty four million
//      two hundred ten million
//      three hundred million
//      fifty four million
//      hundred four million (false case)
//      seven million

		Long ret = -1L;
		if (indexQuintillion > -1) {
			number += parseNumber(strArray, lastKnownIndex + 1, indexQuintillion, quintillion);
			lastKnownIndex = indexQuintillion;
		}
		if (indexQuadrillion > -1) {
			number += parseNumber(strArray, lastKnownIndex + 1, indexQuadrillion, quadrillion);
			lastKnownIndex = indexQuadrillion;
		}
		if (indexTrillion > -1) {
			number += parseNumber(strArray, lastKnownIndex + 1, indexTrillion, trillion);
			lastKnownIndex = indexTrillion;
		}
		if (indexBillion > -1) {
			number += parseNumber(strArray, lastKnownIndex + 1, indexBillion, billion);
			lastKnownIndex = indexBillion;
		}
		if (indexMillion > -1) {
			number += parseNumber(strArray, lastKnownIndex + 1, indexMillion, million);
//			List<String> millionList = strArray.subList(lastKnownIndex + 1, indexMillion);
//			ret = obj.processWords(millionList);
//			if (ret < 0) {
//				System.out.println("Please enter valid input. Try again!");
//				return;
//			} else {
//				number +=  ret * obj.tenths.get(obj.million);
//			}

			lastKnownIndex = indexMillion;
		}

		if (indexThousand > -1) {
			number += parseNumber(strArray, lastKnownIndex + 1, indexThousand, thousand);
			
//			List<String> thousandList = strArray.subList(lastKnownIndex + 1, indexThousand);
//			ret = obj.processWords(thousandList);
//			if (ret < 0) {
//				System.out.println("Please enter valid input. Try again!");
//				return;
//			} else {
//				number +=  ret * obj.tenths.get(obj.thousand);
//			}

			lastKnownIndex = indexThousand;
		}

// 		two hundred thirty four million
//		two hundred thirty million
//		two hundred million
//		two hundred
//		two hundred three
//		two hundred thirty million five hundred one
		if (indexHundred > -1) {
			if ((indexHundred < indexThousand) || (indexHundred < indexMillion) || (indexHundred < indexBillion)
					|| (indexHundred < indexTrillion) || (indexHundred < indexQuadrillion)) {
				//do nothing
			} else {				
				List<String> hundredList = strArray.subList(lastKnownIndex + 1, wordLength);
				ret = processWords(hundredList);
				if (ret < 0) {
					System.out.println("Please enter valid input. Try again!");
					return;
				} else {
					number +=  ret;
				}
			}

			lastKnownIndex = indexHundred;
		} else if (lastKnownIndex != -1 && lastKnownIndex <= wordLength-1 ) {
//			fifty four million ten
//			fifty four million sixty one
//			fifty four million
			if (lastKnownIndex != wordLength-1) {
				List<String> remaining = strArray.subList(lastKnownIndex + 1, wordLength);
				ret = processWords(remaining);
				if (ret < 0) {
					System.out.println("Please enter valid input. Try again!");
					return;
				} else {
					number +=  ret;
				}
			}
		}
		
		// signle word
		if (lastKnownIndex == -1 && wordLength > 0) {
			number = processWords(strArray);
		}
		
		System.out.println("Output Result= " + number + "\n\n");
	}
	
}

