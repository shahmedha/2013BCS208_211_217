import mpi.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


class match_Classs
{		
	
	public void Data_match(HashMap event_hashmp,HashMap con1_hashmp)
	{
		
		
		Set set=con1_hashmp.entrySet();

//		for_reading objForRead = new for_reading();

	//	event_hashmp = objForRead.getHashMap();

		System.out.println(event_hashmp.size());

		Iterator con1_itr=set.iterator();
		Set set1=event_hashmp.entrySet();
		Iterator event_itr=set1.iterator();


		while(con1_itr.hasNext())
		{
			
			Map.Entry n=(Map.Entry)con1_itr.next();
			String a=(String)n.getValue();
			String st[]=a.split(" ");
			
			int i=0;
			 event_itr=set1.iterator();
			while(event_itr.hasNext())
			{
				//System.out.println("2nd while");
				
				Map.Entry n1=(Map.Entry)event_itr.next();
			
				String b=(String)n1.getValue();
	//			System.out.println("string b " +b);
			
				String st1[]=b.split(" ");
						
				if(st[i].equals(st1[i]) && st[i+1].equals(st1[i+1]))
				{
				
					String s1=st[i+2];
					int event_num=Integer.parseInt(st1[i+2]);
					int con_num=Integer.parseInt(st[i+3]);
					switch(s1)
					{
				
						case "=":
									if(event_num==con_num)
									System.out.println(n.getKey() +" matched with " +n1.getKey());
									break;
						case ">":
									if(event_num > con_num)
									System.out.println(n.getKey() +" matched with " +n1.getKey());
									break;
							
						case "<":
									if(event_num < con_num)
									System.out.println(n.getKey() +" matched with " +n1.getKey());
									break;
						 default :
						    System.out.println("Invalid grade");
					   
					}
						
				}
			}
			
		}
		
	}
	public void Data_match_method2(HashMap event_hashmp,HashMap con2_hashmp)
	{
		Set set11=con2_hashmp.entrySet();
		Iterator con2_itr=set11.iterator();
		Set set1=event_hashmp.entrySet();
		Iterator event_itr=set1.iterator();
		System.out.println("mathch method2");

			
		while(con2_itr.hasNext())
		{
			
			Map.Entry n=(Map.Entry)con2_itr.next();
			String a=(String)n.getValue();
			String st[]=a.split(" ");
			
			int i=0;
			 event_itr=set1.iterator();
			while(event_itr.hasNext())
			{
				

				
				Map.Entry n1=(Map.Entry)event_itr.next();
			
				String b=(String)n1.getValue();
			
			
				String st1[]=b.split(" ");
			
			
				if(st[i].equals(st1[i]) && st[i+1].equals(st1[i+1]))
				{
				
					String s1=st[i+2];
					int event_num=Integer.parseInt(st1[i+2]);
					int con_num=Integer.parseInt(st[i+3]);
					switch(s1)
					{
				
						case "=":
									if(event_num==con_num)
									System.out.println(n.getKey() +" matched with " +n1.getKey());
									break;
						case ">":
									if(event_num > con_num)
									System.out.println(n.getKey() +" matched with " +n1.getKey());
									break;
							
						case "<":
									if(event_num < con_num)
									System.out.println(n.getKey() +" matched with " +n1.getKey());
									break;
						 default :
						    System.out.println("Invalid grade");
					   
					}
						
				}
			}
			
		}
		
	}
}
