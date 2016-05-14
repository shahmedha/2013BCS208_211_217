import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class EventMatching {
public static void main(String args[])throws IOException
	
	{

		long start_time=System.currentTimeMillis();
		Fileread fr=new Fileread();
		fr.dataRead();
		fr.eventMatching();
		long end_time = System.currentTimeMillis();
		long diff_time= end_time-start_time;
		System.out.println("total exection time :" +diff_time+ "mc");
	}	
}
		//omp.Omp.omp_set_num_threads(4);
		class Fileread
		{
		String s="/home/dhanashree/workspace/serial_pub_sub_system/con1";
		File dir=new File(s);
		File[] files= dir.listFiles();
		//String[]str =new String[50000];
		int x=0;
		String s11="/home/dhanashree/workspace/serial_pub_sub_system/con2";
		File dir11=new File(s11);
		File[] files1= dir11.listFiles();
		//String[]str1 =new String[50000];
		int y=0;
		
		String spath="/home/dhanashree/workspace/serial_pub_sub_system/event";
		File dir1=new File(spath);
		File[] fp=dir1.listFiles();
		//String[] event=new String[4];
		int p=0;
		//int c1=0,c2=0,c3=0;
		HashMap con1=new HashMap();
		HashMap event1=new HashMap();
		HashMap con2=new HashMap();
		//@SuppressWarnings("rawtypes")
		
		
		void dataRead()
		{
		for(File f: files1)
		{
			if(f.isFile())
			{
		
			
			BufferedReader inputstrm = null;
			
			try
			{
			inputstrm = new BufferedReader(new FileReader(f));
			String line;
			
			while((line=inputstrm.readLine())!=null)
			{
				
				//str1[y]=line;
				con2.put("con1"+y,line);
				y++;
				//c1++;
				
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(inputstrm != null)
					try {
						inputstrm.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
			}
	}
	
	
	//System.out.println(c1);
		
		for(File f: files)
		{
				if(f.isFile())
				{
			
				
				BufferedReader inputstrm = null;
				
				try
				{
				inputstrm = new BufferedReader(new FileReader(f));
				String line;
				
				while((line=inputstrm.readLine())!=null)
				{
					
					//str[x]=line;
					con1.put("con"+x, line);
					x++;
					//c2++;
					
				}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				finally
				{
					if(inputstrm != null)
						try {
							inputstrm.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
					}
				}
		}
		
		
		//System.out.println(c2);
		
		
		
		
			
		
		
		
		/*while(ir.hasNext()) {
	         Map.Entry me = (Map.Entry)ir.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }*/
		
		
		for(File f: fp)
		{
				if(f.isFile())
				{
			
				
				BufferedReader inputstrm = null;
				
				try
				{
				inputstrm = new BufferedReader(new FileReader(f));
				String line;
				
				while((line=inputstrm.readLine())!=null)
				{
					
					//event[p]=line;
					event1.put("event"+p, line);
					p++;
					//c3++;
					
				}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				finally
				{
					if(inputstrm != null)
					{
						try {
							inputstrm.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
					}
				}
		}
		}
		}
				
				
		/*for(int j=0;j<str.length;j++)
		{
			con1.put("con"+j, str[j]);
		}	
		
		for(int j=0;j<str1.length;j++)
		{
			con2.put("con1"+j, str1[j]);
		}
		
		for(int j=0;j<event.length;j++)
		{
			event1.put("event"+j, event[j]);
		}*/
					
				
		
		/*while(ir1.hasNext()) {
	         Map.Entry me1 = (Map.Entry)ir1.next();
	         System.out.print(me1.getKey() + ": ");
	         System.out.println(me1.getValue());
	      }
		}*/
		

		void eventMatching()
		{
		Set set=con1.entrySet();
		Iterator con1itr=set.iterator();
		Set set1=event1.entrySet();
		Iterator event1itr=set1.iterator();
		
				
		
			
		
		while(con1itr.hasNext())
		{
			
			Map.Entry n=(Map.Entry)con1itr.next();
			String a=(String)n.getValue();
			String st[]=a.split(" ");
			
			int i=0;
			event1itr=set1.iterator();
			while(event1itr.hasNext())
			{
				//System.out.println("2nd while");
				
			Map.Entry n1=(Map.Entry)event1itr.next();
			
			String b=(String)n1.getValue();
			//System.out.println("string b " +b);
			
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
		Set set11=con2.entrySet();
		Iterator con2itr=set11.iterator();
		event1itr=set1.iterator();
		
		while(con2itr.hasNext())
		{
			
			Map.Entry n=(Map.Entry)con2itr.next();
			String a=(String)n.getValue();
			String st[]=a.split(" ");
			
			int i=0;
			event1itr=set1.iterator();
			while(event1itr.hasNext())
			{
				

				
			Map.Entry n1=(Map.Entry)event1itr.next();
			
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
		
		
				
		
		



