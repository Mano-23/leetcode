class Solution {
    public int majorityElement(int[] nums) {
         int c=0;
	     int max=0;
	    Arrays.sort(nums);
	   if(nums.length==0)
	  {
		return max=0;
	  }
	  else if(nums.length==1)
	  {
	     return max=nums[0];
	  }
	else if(nums.length>1)
	{
	for(int i=0;i<nums.length;)
	{  
             c=1;
            for(int j=i+1;j<=nums.length-1;j++)
		{
	          if(nums[i]==nums[j])
	          {
			c++;
		        i++;
	                if(c>nums.length/2)
	    		{
	    		   max=nums[i];
	    		}
			}
			else
			{   
			  c=1;
			   i++;
			}
		}
		i++;
	     }
	    }
       return max;
      
    }
}
