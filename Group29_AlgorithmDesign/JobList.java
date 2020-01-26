import java.util.*;
class JobList {
    String JobID;
    int deadLine;
    int profit;

    JobList(String JobID, int deadLine, int profit){
        this.JobID = JobID;
        this.deadLine = deadLine;
        this.profit = profit;
    } 

boolean compare(JobList a, JobList b){
    return(a.profit > b.profit);
}


static void PrintTask(JobList arr[], int n){
    //Arrays.sort(arr);    
    //Arrays.sort(arr,Collections.reverseOrder());
    int[] result= new int[n];
    boolean[] slot= new boolean[n];

    for(int i=0; i<n;i++){
        slot[i] =false;
    }

    for(int i=0; i<n; i++){
        for(int j=Math.min(n,arr[i].deadLine)-1; j>=0; j--){
            if(slot[j]== false){
                result[j] =i;
                slot[j] = true;
                break;
            }
        }
    }
    for(int i=0; i<n; i++){
        if(slot[i]){
            System.out.print(arr[result[i]].JobID+" ");
        }
    }
}

    public static void main(String args[]){
    
    
    JobList[] arr={new JobList("J1",2,90),new JobList("J3",1,40),new JobList("J2",2,20),new JobList("J4",1,30),new JobList("J5",4,65),new JobList("J6",1,35),new JobList("J7",3,50)};
    int n = arr.length; 
    //Arrays.sort(arr,Collections.reverseOrder());
    System.out.println("Following is maximum profit sequence of jobs :"); 
        
    PrintTask(arr,n);
    }
    
         

}
