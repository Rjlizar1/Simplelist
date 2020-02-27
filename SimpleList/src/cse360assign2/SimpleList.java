package cse360assign2;

//Ricardo Lizarraga
//Class ID: 409
//Program creates a simple list.


public class SimpleList 
{
	public int [] list;		//list array
	public int count;		//count of variables in list
	public int size;		//size of list
	
	public SimpleList()
	{
		size = 10;			//initial size
		list = new int[size];	//creates list
		count = 0;				//count is amount in array
	}

	public void add(int num)		//adds number
	{
		if(count == size)				//check if list is full
		{
			size = size + (size*(1/2));		//increases by 50%
		}
		for(int i = size; i > 0; i=i-1)	//moves backwards through list
		{
			list[i] = list[i-1];		//moves list up
		}
		
		list[0] = num;				//adds number to beginning

		count++;					//increases count
	}
	
	public void remove(int num)
	{						//removes number
		
		int found = search(num);	//searches for variable
									//returns -1 if not found
		if(found > 0)			//if it is found
		{
			for(int i = found ; i < count; i++)	//goes through list
			{
				list[found] = list[found+1];	//moves numbers back
			}			
			count--;			//decreases count
		}
		
		int decrease_check = size - (size*(1/4));	//find 25% less than full
		
		if(count<decrease_check)	//if less then 25% is empty
		{
			size = decrease_check;		//decrease the size
		}
	}
	
	public int count(){
		return count;		//returns count
	}
	
	public String toString() 
	{
		String output = "";
		for(int i=0 ; i < count ; i++)
		{
			if(i == 0)				//if first then no space before
			{
				output += list[i];
			}
			else				//space before unless first variable
			{
				output += (" "+list[i]);	
			}
		}
		return output;
	}
	
	public int search(int num) 
	{
		int found = -1;			//found is -1 before found
		for(int i=0; i < 10; i =i+1) 
		{
			if(num == list[i])		//if num is found
			{						//makes found equal to position
				found = i;
			}
		}
		return found;			//returns found
	}
	
	public void append(int num)
	{
		if(count == size)   //if list is full
		{
			size = size + (size * (1/2));  //add 50% to size
		}
		
		count++;
		list[count]=num;	//add variable to end
	}
	
	public int first()
	{
		if (size == 0)
		{
			return -1;
		}
		else
		{
			return list[0];			//returns first variable
		}
	}
	
	public int size()
	{
		return size;			//returns size of list
	}
}



