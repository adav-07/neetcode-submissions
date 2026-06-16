/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return node;
        }
        HashSet<Integer> hs = new HashSet<>();
        HashMap<Integer, Node> newhm = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        Node newNode = new Node(node.val);
        Node newMain=newNode;
        newhm.put(node.val, newNode);
        hs.add(node.val);
        while(!q.isEmpty()){
            Node ptr = q.remove();
            int val=ptr.val;
            List<Node> neighbors=ptr.neighbors;
            for(Node neighbor:neighbors){
                if(!newhm.containsKey(neighbor.val)){
                    newNode = new Node(neighbor.val);
                    newhm.put(neighbor.val, newNode);
                }
                else{
                    newNode = newhm.get(neighbor.val);
                }
                newhm.get(val).neighbors.add(newNode);

                if(!hs.contains(neighbor.val)){
                    hs.add(neighbor.val);
                    q.add(neighbor);
                }
            }
        }
        return newMain;
    }
}