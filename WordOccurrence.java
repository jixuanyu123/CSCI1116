import java.util.ArrayList;

public class WordOccurrence implements Comparable<WordOccurrence>{
	String word;
	Integer count;
	public WordOccurrence(String word, Integer count) {
		this.word = word;
		this.count = count;
		
	}
	@Override
	public int compareTo(WordOccurrence o) {
		return o.count.compareTo(this.count);
	}
	   @Override 
	    public String toString() {
	        return word + "=" + count;
	    }

		public String getWord() {
			
			return this.word;
		}

		public Integer getCount() {
			
			return this.count;
			
		}
}
