import mpi.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class read_Class
{		
			HashMap event_hashmp=new HashMap();	
			HashMap con1_hashmp=new HashMap();
			HashMap con1_2_hashmp=new HashMap();
			HashMap con1_3_hashmp=new HashMap();
	//		HashMap con1_4_hashmp=new HashMap();

			HashMap con2_hashmp=new HashMap();
			HashMap con2_2_hashmp=new HashMap();
			HashMap con2_3_hashmp=new HashMap();
	//		HashMap con2_4_hahsmp=new HashMap();
			
		
		public HashMap data_read_parallel_for_event()
		{	
		//HashMap event_hashmp = new HashMap();
		String spath="/home/sonali/workspace/Demo/event";
		File dir1=new File(spath);
		File[] fp=dir1.listFiles();
		String[] event=new String[4];
		int p=0;
		
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
					
							event_hashmp.put("event"+p, line);
							p++;
						}
						}
						catch(Exception e){
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
//		System.out.println("Method=========>"+event_hashmp.size());
		return event_hashmp;
	}
	

	public HashMap data_read_parallel_for_con1()
	{	
	
			String s="/home/sonali/workspace/Demo/con1";
				File dir=new File(s);
				File[] files= dir.listFiles();
				//String[]str =new String[50000];
				int x=0;
		
				int c1=0,c2=0,c3=0;
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
					
					
								
							con1_hashmp.put("con1"+x, line);
							x++;
					
						}
						}
						catch(Exception e){
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
	return con1_hashmp;
		
	}

/*	public HashMap data_read_parallel_for_con1_2()
	{	
	
			String s="/home/sonali/workspace/Demo/con1_2";
				File dir=new File(s);
				File[] files= dir.listFiles();
				//String[]str =new String[50000];
				int x=0;
		
				int c1=0,c2=0,c3=0;
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
					
					
								
							con1_2_hashmp.put("con1"+x, line);
							x++;
					
						}
						}
						catch(Exception e){
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
	return con1_2_hashmp;
		
	}
	public HashMap data_read_parallel_for_con1_3()
	{	
	
			String s="/home/sonali/workspace/Demo/con1_3";
				File dir=new File(s);
				File[] files= dir.listFiles();
				//String[]str =new String[50000];
				int x=0;
		
				int c1=0,c2=0,c3=0;
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
					
					
								
							con1_3_hashmp.put("con1"+x, line);
							x++;
					
						}
						}
						catch(Exception e){
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
	return con1_3_hashmp;
		
	}

/*	public HashMap data_read_parallel_for_con1_4()
	{	
	
			String s="/home/sonali/workspace/Demo/con1_4";
				File dir=new File(s);
				File[] files= dir.listFiles();
				//String[]str =new String[50000];
				int x=0;
		
				int c1=0,c2=0,c3=0;
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
					
					
								
							con1_4_hashmp.put("con1"+x, line);
							x++;
					
						}
						}
						catch(Exception e){
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
	return con1_4_hashmp;
		
	}
	public HashMap data_read_parallel_for_con2_2()
	{
		//System.out.println("===>"+me);
			String s11="/home/sonali/workspace/Demo/con2_2";
			File dir11=new File(s11);
			File[] files1= dir11.listFiles();
	
			int y=0;
			//System.out.println("me==2");

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
				
								//c1++;
								con2_2_hashmp.put("con2"+y, line);
								y++;

							}
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						finally
						{
							if(inputstrm != null)
								try 
								{
									inputstrm.close();
								} 
								catch (IOException e) 
								{
									e.printStackTrace();
								}
									
				
						}
					}
				}
			
	return con2_2_hashmp;
	
	
	}
	public HashMap data_read_parallel_for_con2_3()
	{
		//System.out.println("===>"+me);
			String s11="/home/sonali/workspace/Demo/con2_3";
			File dir11=new File(s11);
			File[] files1= dir11.listFiles();
	
			int y=0;
			//System.out.println("me==2");

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
				
								//c1++;
								con2_3_hashmp.put("con2"+y, line);
								y++;

							}
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						finally
						{
							if(inputstrm != null)
								try 
								{
									inputstrm.close();
								} 
								catch (IOException e) 
								{
									e.printStackTrace();
								}
									
				
						}
					}
				}
			
	return con2_3_hashmp;
	
	
	}
/*	public HashMap data_read_parallel_for_con2_4()
	{
		//System.out.println("===>"+me);
			String s11="/home/sonali/workspace/Demo/con2_4";
			File dir11=new File(s11);
			File[] files1= dir11.listFiles();
	
			int y=0;
			//System.out.println("me==2");

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
				
								//c1++;
								con2_4_hashmp.put("con2"+y, line);
								y++;

							}
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						finally
						{
							if(inputstrm != null)
								try 
								{
									inputstrm.close();
								} 
								catch (IOException e) 
								{
									e.printStackTrace();
								}
									
				
						}
					}
				}
			
	return con2_4_hashmp;
	
	
	}*/

	public HashMap data_read_parallel_for_con2()
	{
		//System.out.println("===>"+me);
			String s11="/home/sonali/workspace/Demo/con2";
			File dir11=new File(s11);
			File[] files1= dir11.listFiles();
	
			int y=0;
			//System.out.println("me==2");

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
				
								//c1++;
								con2_hashmp.put("con2"+y, line);
								y++;

							}
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						finally
						{
							if(inputstrm != null)
								try 
								{
									inputstrm.close();
								} 
								catch (IOException e) 
								{
									e.printStackTrace();
								}
									
				
						}
					}
				}
			
	return con2_hashmp;
	
	
	}
}
