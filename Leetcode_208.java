class Trie {
    class TrieNode{
        boolean wordEnd;
        TrieNode[] children;
    
        public TrieNode(){
            wordEnd=false;
            children=new TrieNode[26];
        }
    }
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr=root;
        for(char ch: word.toCharArray()){
            if(curr.children[ch-'a']==null){
                curr.children[ch-'a']=new TrieNode();
            }
            curr=curr.children[ch-'a'];
        }
        curr.wordEnd=true;
    }
    
    public boolean search(String word) {
        TrieNode curr=root;
        for(char ch :word.toCharArray()){
            if(curr.children[ch-'a']==null){
                return false;
            }
            curr=curr.children[ch-'a'];
        }
        return curr.wordEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr=root;
        for(char ch: prefix.toCharArray()){
            if(curr.children[ch-'a']==null){
                return false;
            }
            curr=curr.children[ch-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
