commands for executing mpi programms in java

For installation of mpj on ubuntu machine just download mpj express,extract it and paste libraries in eclipse.

1. For compilation
			javac -cp.:$MPJ_HOME/lib/mpj.jar class_Name.java
			for eg: javac -cp.:$MPJ_HOME/lib/mpj.jar match_Parallel_Mpi.java


2.For Running
			path for mpjrun.sh -np no._Of_processes class_Name.
			for eg.  /home/dhanashree/mpj-v0_44 (2)/bin/mpjrun.sh -np 2 match_Parallel_Mpi 
