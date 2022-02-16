package Snake_ladder_UC7 ;

class Player1
{
	int i=0;
	int noPlay1=0;
	int ladder1=1;
	int snake1=2;
	public int c;
	int count1=0;
	
	public void perform1()
	{
		while(i<=100)
		{
			count1 += 1;
			int roll = (int ) Math.floor((Math.random() * 10) % 3);
			int value = (int) Math.floor((Math.random() * 10) % 6)+1;
			System.out.println("Dice Roll =" + value);
			
			//logic
			if(roll == noPlay1) 
			{
				System.out.println("No Play1" + i);
			}
	
			else if (roll == ladder1) 
			{
				     i=i+value;
			         if(i == 100)
		         	{
			     	i=100;
				     System.out.println("Ladder1 :" +i);
			        }
		         	else
		         	{
				    System.out.println("Ladder1 :" + i);
		         	}
			         int c=i-value;
			}
    	   else 
    	   {
			     i=i-value;
			     if(i<0)
			     {
			     i=0;
				       System.out.println("snake1 :" + i);
			     }
			     else
			     {
			    	System.out.println("snake1 :" + i);
			     }
    	     }
        }
	} 
}
    class Player2
    {

    	int j=0;
    	int noPlay2=0;
    	int ladder2=1;
    	int snake2=2;
    	public int d;
    	int count2=0;
    	public void perform2()
    	{
    		while(j<=100)
    		{
    			count2 += 1;
    			int roll = (int ) Math.floor((Math.random() * 10) % 3);
    			int value = (int) Math.floor((Math.random() * 10) % 6)+1;
    			System.out.println("Dice Roll =" + value);
    			
    			//logic
    			if(roll == noPlay2) 
    			{
    				System.out.println("No Play" + j);
    			}
    	
    			else if (roll == ladder2) 
    			{
    				     j=j+value;
    			         if(j == 100)
    		         	{
    			     	j=100;
    				     System.out.println("Ladder2 :" +j);
    			        }
    		         	else
    		         	{
    				    System.out.println("Ladder2 :" + j);
    		         	}
    			         int d=j-value;
    			}
        	   else 
        	   {
    			     j=j-value;
    			     if(j<0)
    			     {
    			     j=0;
    				       System.out.println("snake2 :" + j);
    			     }
    			     else
    			     {
    			    	System.out.println("snake2 :" + j);
    			     }
        	     }
            }
    	} 
    }
    
public class Snake_ladder_UC7 {

public static void main(String[] args) 
{		
	Player2 obj = new Player2();
	obj.perform2();
	if(obj.d<=obj.j)
	{
		obj.perform2();
	}
	System.out.println(obj.j);
	
	Player1 obj1 = new Player1();
	obj1.perform1();
	if(obj1.c<=obj1.i)
	{
	 	 obj1.perform1();
	}
    System.out.println(obj1.i);
    System.out.println("No. of times player1 rolls = "+ obj1.count1);
    System.out.println("No. of times player2 rolls = "+ obj.count2);
    if (obj1.count1 < obj.count2)
	{
		System.out.println("player 1 won");
	}
	else
	{
		System.out.println("player 2 won");
	}
   
}
}
