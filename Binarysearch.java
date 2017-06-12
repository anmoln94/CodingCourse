package CodingCourse;
public class Binarysearch {

    /**
     * Binary search
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int[] arr = {0, 1, 2, 3, 4,55};
        int left, mid, right;
        int key;
        boolean found = false;
        key = 55;
        left = 0;
        right = arr.length - 1;
       

        while (left<=right) 
        {
            mid = (left + right) / 2;
            if (arr[mid] == key) 
            {
                System.out.println("found on index:");
                System.out.println(mid);
                found = true;
                break;
            } 
            else if (key > arr[mid]) 
            {
                left = mid+1;
            } 
            else
            {
                right = mid-1;
            }
        }
        if(found==false)
        {
            System.out.println ("key not found");
        }
    }
    
}
