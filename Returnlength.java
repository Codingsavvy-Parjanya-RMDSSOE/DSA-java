class Returnlength {
    public static void main(String[] args)
    {
        String a = " Hello World ";
        
        a = a.trim(); // remove spaces
        
        int n = a.length();
        int count = 0;

        // count last word length
        for(int i = n - 1; i >= 0; i--)
        {
            if(a.charAt(i) != ' ')
            {
                count++;
            }
            else
            {
                break;
            }
        }

        System.out.println(count);
    }
}