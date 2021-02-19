package AlphaPackage;

import java.util.ArrayList;

public class AlphaSubset {
	public String mPhrase;
	public ArrayList<Character> mSubset;
	
	public AlphaSubset(String phrase){
		mSubset = new ArrayList<Character>();
		mPhrase = phrase;
		if(validate() == false) { //validates the mPhrase
			mPhrase = null;
		}
		if(mPhrase != null) {
  		for(int i = 0; i < mPhrase.length(); i++) { //checks for letters in the mPhrase and adds only the letters to the mSubset
  			char c = mPhrase.charAt(i);
  			if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z')){
  				if(mSubset.contains(c)) {
  					
  				}
  				else {
  				mSubset.add(c);
  				}
  			}
  		}
		}
		for(int i = 0; i < mSubset.size(); i++) { //bubble sorts the mSubset
			for(int j = 0; j < mSubset.size()-i-1; j++) {
				if(mSubset.get(i) > mSubset.get(j + 1))
        {
               char tempVar = mSubset.get(j + 1);
               mSubset.set(j,mSubset.get(j+1));
               mSubset.set(i+1, tempVar);
        }
			}
		}
		
	}
	
	public ArrayList<Character> getSubset(){ //returns the mSubset
		return mSubset;
	}
	
	public String getPhrase(){ //returns the mPhrase
		return mPhrase;
	}
	
	public boolean compare(AlphaSubset passedSubset) { //compares the passed AlphaSubset's mSubset to this AlphaSubset's mSubset. If both are equal returns true, if not returns false
		if(passedSubset.getSubset() == mSubset) {
			return true;
		}
		return false;
	}
	
	private boolean validate() {
		for(int i = 0; i < mPhrase.length(); i++) {
			char c = mPhrase.charAt(i); //iterates through the string and sees if anything does not equal a valid character. Returns false if an invalid character comes up, else returns true
			if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z') || c == '!' || c == '"' || c == '#' || c == '$' || c == '%' || c == '&' || c == '\'' || c == '(' || c == ')' || c == '*' || c == '-' || c == ','|| c == '.'|| c == ':' || c == ';' || c == ' ') {
				
			}
			else {
				return false;
			}
			
		}
		return true;
	}

}
