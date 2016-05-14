import mpi.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class match_Parallel_Mpi
{
			
		
	public static void main(String args[])
	{

			long start_time = System.currentTimeMillis();					
			
			HashMap event_hashmp=new HashMap();	
			HashMap con1_hashmp=new HashMap();
			HashMap con2_hashmp=new HashMap();
				
							
			match_Parallel_Mpi matchParallel=new match_Parallel_Mpi();
			read_Class readClass=new read_Class();
			match_Classs matchClass=new match_Classs();

			event_hashmp=readClass.data_read_parallel_for_event();
			con1_hashmp=readClass.data_read_parallel_for_con1();
			con2_hashmp=readClass.data_read_parallel_for_con2();
		
		MPI.Init(args);
		int rank = MPI.COMM_WORLD.Rank();

//		for_matching for_match=new for_matching();
		if(rank==0)
		{
			//System.out.println(rank);
			matchClass.Data_match(event_hashmp,con1_hashmp);
					
			//System.out.println(rank);
	
		}
		else
		{
			matchClass.Data_match_method2(event_hashmp,con2_hashmp);
					
			
		}

		MPI.Finalize();	
		
		long end_time = System.currentTimeMillis();
		long diff_time = end_time - start_time;
		System.out.println("total exection time :" + diff_time + "ms");
		
		
		
	}
		



}

