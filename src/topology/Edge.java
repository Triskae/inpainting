/**
 * <> with heart by Doutel Silva Filipe, Nadaud Sörel and Barbero Lucas
 */

package topology;

public class Edge {

    private static int[][] v={{1,0},{0,1}};
    public int direction,i,j;
    public int orientation;
    public int label;
    private BoundingBox bb;


    public Edge(int direction, int i, int j, int orientation, BoundingBox bb) {
        this.direction = direction;
        this.i = i;
        this.j = j;
        this.orientation = orientation;
        this.bb = bb;
        // definition unique du label en fonction de la direction du edge
        if(direction==0)
        {label=	 (i+(orientation-1)/2*v[direction][0])
                +(j+(orientation-1)/2*v[direction][1])*bb.width;}
        else
        {label=bb.nbEdgesHorizontal+
                (i+(orientation-1)/2*v[direction][0])*bb.height
                +(j+(orientation-1)/2*v[direction][1]);}


}

    public Point[] border() throws Exception {
         Point[] pp = {new Point(bb,i,j), new Point(bb,i+orientation*v[direction][0],j+orientation*v[direction][1])} ; // retournekes deux points constitutifs d'une instance de Edge
        /*int d1=(1-orientation)/2;
        int d2=(1+orientation)/2;
        Point[] pp = { new Point(bb,i+d1*v[direction][0],j+d1*v[direction][1]), new Point(bb,i+d2*v[direction][0],j+d2*v[direction][1])} ; // retournekes deux points constitutifs d'une instance de Edge
*/
        return pp;

    }

    @Override
    public String toString() {
        return "Edge{" +
                "direction=" + direction +
                ", i=" + i +
                ", j=" + j +
                ", orientation=" + orientation +
                ", label=" + label +
                ", bb=" + bb +
                '}';
    }


}
