// Name: Jinfeng (Jeffery) Liu
// Email: liujinfeng1209@gmail.com
// Phone: 778-387-9021

// Programming language: Java
// IDE: Eclipse

// 1. get the original list.
// 2. add all elements into the original list.
// 3. remove duplicates from the list.
// 4. get delete elements from the list.
// 5. sort the list.
// 6. print the result.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public final class ImmutableList {

	final static String os = "one, two, three";
	final static String as = "one, two, five, six";
	final static String ds = "two, five";
	
	public static ArrayList<String> getOriginalList(String s)
	{
		// Splits the string
		ArrayList<String> lists = new ArrayList<String>(Arrays.asList(s.split("\\s*,\\s*")));
		return lists;
	}
	// Add "add list" to the original list
	public static ArrayList<String> addList(String s, ArrayList<String> al)
	{
		String[] addList = s.split("\\s*,\\s*");
		for(String i : addList) 
		{
			al.add(i);
		}
		return al;
	}
	// Remove duplicates from the list
	public static ArrayList<String> removeDuplicates(ArrayList<String> al)	
	{
		ArrayList<String> newList = (ArrayList<String>) al.stream().distinct().collect(Collectors.toList());
		return newList;
	}
	// Delete items from the list
	public static ArrayList<String> deleteList(String s, ArrayList<String> al)
	{
		String[] deleteList = s.split("\\s*,\\s*");
		for(String i : deleteList) 
		{
			al.remove(new String(i));
		}
		return al;
	}
	// Sort the list
	public static ArrayList<String> sortList(ArrayList<String> al)
	{
		int l = al.size();
		for(int i = 0; i < l; i++)
		{
			for(int j = 1; j < l-i; j++)
			{
				if(al.get(j-1).length() < al.get(j).length())
				{
					Collections.swap(al, j-1, j);
				}
				else if(al.get(j-1).length() == al.get(j).length())
				{
					if((int)al.get(j-1).charAt(0) < (int)al.get(j).charAt(0))
					{
						Collections.swap(al, j-1, j);
					}
				}
			}
		}
		return al;
	}
	// Print the List
	public static void printArrayList(ArrayList<String> al)
	{
		System.out.print("Original List = [");
		for(String i : al)
		{
			System.out.print(i + ", ");
		}
		System.out.println("]");
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lists = getOriginalList(os);
		lists = addList(as, lists);
		lists = removeDuplicates(lists);
		lists = deleteList(ds, lists);
		lists = sortList(lists);
		printArrayList(lists);		
	}
}

