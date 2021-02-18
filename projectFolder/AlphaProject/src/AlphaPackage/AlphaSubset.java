package AlphaPackage;

import java.util.ArrayList;

public class AlphaSubset {
	public String mPhrase;
	public ArrayList<Character> mSubset;
	
	public AlphaSubset(String phrase){
		mSubset = new ArrayList<Character>();
		mPhrase = phrase;
		if(validate() == false) { //validates the mPhrase
			mPhrase = "";
		}
		for(int i = 0; i < mPhrase.length(); i++) { //checks for letters in the mPhrase
			char c = mPhrase.charAt(i);
			if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z')){
				if(mSubset.contains(c)) {
					
				}
				else {
				mSubset.add(c);
				}
			}
		}
		for(int i = 0; i < mSubset.size(); i++) { //bubble sort
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
	
	public ArrayList<Character> getSubset(){
		return mSubset;
	}
	
	public String getPhrase(){
		return mPhrase;
	}
	
	public boolean compare(AlphaSubset passedSubset) {
		if(passedSubset.getSubset() == mSubset) {
			return true;
		}
		return false;
	}
	
	private boolean validate() {
		for(int i = 0; i < mPhrase.length(); i++) {
			char c = mPhrase.charAt(i);
			if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z') || c == '!' || c == '"' || c == '#' || c == '$' || c == '%' || c == '&' || c == '\'' || c == '(' || c == ')' || c == '*' || c == '-' || c == ','|| c == '.'|| c == ':' || c == ';' || c == ' ') {
				return true;
			}
			
		}
		return false;
	}

}
