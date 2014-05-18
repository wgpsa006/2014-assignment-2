package ps3.graph;

public class DijkstraSpecializer<N> implements PathFinderSpecializer<N> {

    private AbstractGraph<N> graph;

    /**
     * ³Ð³y DijkstraSpeciaizer 
     *
     * @param graph the graph that the algorithm works on
     * @effects creates a DijkstraSpecializer on the specified graph
     */
    public DijkstraSpecializer(AbstractGraph<N> graph) {
        this.graph = graph;
    }

	// Specified in PathFinderSpecializer interface
    public Iterable<N> expandNode(N node) {
        return graph.children(node);
    }

    // Specified in Comparator interface
    public int compare(Path<N> o1, Path<N> o2) {
        if (o1.cost() > o2.cost())
            return 1;
        if (o1.cost() < o2.cost())
            return -1;
        return 0;
    }

}


