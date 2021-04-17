class DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String first = s.substring(0, n/2);
        String second = s.substring(n/2, n);

        return vowelsCount(first) == vowelsCount(second);
    
    }

    private int vowelsCount(String str){
        int count = 0;
        for(char ch : str.toCharArray()){
            if(Character.toLowerCase(ch) == 'a' || Character.toLowerCase(ch) == 'e' || Character.toLowerCase(ch) == 'i' || Character.toLowerCase(ch) == 'o' || Character.toLowerCase(ch) == 'u')
                count++;
        }
        return count;
    }
}
