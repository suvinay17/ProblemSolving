/* Google Online Assessment 2019 Suvinay Bothra
*  Question 1 : Hotel Room
*  This code uses a hashmap to puy A rooms with a "+" sign,
*  the key is the room number like 1B and the value is the number of times it occurs
*  and increment the value everytime the same key is put in the map.
*/

public class CodingChallenge{
    public static void main(String []args){
        int value = 0;
        int i = 0;
        Map<String, Integer> x = new HashMap<>(); //Hash Map to store room numbers


        for(i=0; i< A.length; i++)
        {
            if( A[i].charAt(0) == '+')
            {
                x.put(A[i], 0); //setting values for all booked rooms to 0
            }
        }

        int max=0;
        for(i=0; i< A.length; i++)
        {
            if(A[i].charAt(0) == '+')
              {
                x.put(A[i], x.get(A[i])+1); //incrementing the number of times a room is found and putting into the hashmap
                if(max < x.get(A[i]))
                {
                  max = x.get(A[i]);
                }
              }
        }

        ArrayList<String> result = new ArrayList<String>(); //Stores all maximum occurring hotel rooms
        for(i = 0; i < A.length; i++)
        {
            if(A[i].charAt(0) == '+')
            {
              if(x.get(A[i]) == max)
                {
                    result.add(A[i].substring(1));
                }
            }
        }

        String min = "9Z"; // because this is the largest possible room lexicogrpahically
        for(i = 0; i < result.size(); i++)
        {
            if(result.get(i).compareToIgnoreCase(min) < 0) //finding the minimum lexicographical string
            {
                min = result.get(i);
            }
        }

        return min; //returning the highest occuring smallest lexicographical room

}
}
