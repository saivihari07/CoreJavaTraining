package Saiviharicollectionstask10.java;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ArraylistWithoutDuplicates
{
	public static void main(String args[])
	{
			List<String> li = new ArrayList<>();
			{
			li.add("mango");
			li.add("apple");
			li.add("grapes");
			li.add("watermelon");
			li.add("pineapple");
			li.add("orange");
			li.add("apple");
			li.add("pineapple");
			li.add("mango");
			}
			for(int i=0;i<li.size();i++)
			{
				for(int j = 0;j<li.size();j++) {
					if(li.get(i).equals(li.get(j)))
					{
					li.remove(j);
					}
				}
			}
			System.out.println("After removing the elements "+li);
		}
	}

			

