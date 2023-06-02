package ineuron;

import java.util.Arrays;

public class PptAssignment38 {

	public static void main(String[] args) {
		int[][] intervals= {{0,30},{5,10},{15,20}};
		System.out.println(minMeetingRooms(intervals));

	}
	public static int minMeetingRooms(int[][] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for(int i=0; i<intervals.length; i++) 
        {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        
        Arrays.sort(starts);
        Arrays.sort(ends);
        
        int rooms = 0;
        int endsItr = 0;
        for(int i=0; i<starts.length; i++) 
        {
            if(starts[i]<ends[endsItr])
                rooms++;
            else
                endsItr++;
        }
        return rooms;
    }
}
	


