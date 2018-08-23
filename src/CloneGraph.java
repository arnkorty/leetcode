import java.util.HashMap;

public class CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null)
            return null;
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
        map.put(node,copy);
        helper(node,map);
        return copy;
    }
    private void helper(UndirectedGraphNode node, HashMap<UndirectedGraphNode, UndirectedGraphNode> map)
    {
        for(int i=0;i<node.neighbors.size();i++)
        {
            UndirectedGraphNode cur = node.neighbors.get(i);
            if(!map.containsKey(cur))
            {
                UndirectedGraphNode copy = new UndirectedGraphNode(cur.label);
                map.put(cur,copy);
                helper(cur,map);
            }
            map.get(node).neighbors.add(map.get(cur));
        }
    }

    public static void main(String[] args) {

    }
}
