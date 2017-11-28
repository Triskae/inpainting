package topology;

import java.awt.image.BufferedImage;

/**
 * <> with heart by Doutel Silva Filipe, Nadaud Sörel and Barbero Lucas
 */


public class main {
    public static void main(String[] args) throws Exception {
    	Color c = new Color(255,255,255);
    	Color c1 = new Color(255,255,255);
    	Color c2 = new Color(0,0,0);


    	System.out.println(Color.dist(c,c1));
    	System.out.println(Color.dist(c,c2));


    	byte b = (byte) 255;
    	System.out.println(b);
    	System.out.println(Byte.toUnsignedInt(b));
    	System.out.println(c.toString());
		BufferedImage bbb;
		/**bbb = ImageIO.read(new File("test.jpg"));
		int a =bbb.getRGB(0,0);
		System.out.println(a);

		Color ccc= Color.rgbToColor(a);



		System.out.println(ccc);
		int g = ccc.colorToRgb();
		System.out.println(g);
		System.out.println("lol");
		System.out.println(Color.rgbToColor(g));**/

		//Matrix m = new Matrix("P:\\Desktop\\téléchargement.png");
        //System.out.println(m.val[0][0]);

        //Mask mm = new Mask("P:\\Desktop\\mask.bmp",new Color(0,0,0));
        //System.out.println(mm.val[0][0]);

        BoundingBox bb = new BoundingBox("P:\\Desktop\\test.bmp");
        //System.out.println(mm.touchedBy(new Point(bb,10,10)));
       // m.applyMask(mm);
       // m.save("P:\\Desktop\\camarchestp");
        Edge e = new Edge(0,4,4,-1,bb);
      //  Edge filipe = new Edge(5,5,1,1,bb);
		System.out.println(e.border()[1]);
		Edge[] edges = new Point(bb,5,5).outerEdges();
		System.out.println(edges[0].border()[1]);
		System.out.println(edges[1].border()[1]);
		System.out.println(edges[2].border()[1]);
		System.out.println(edges[3].border()[1]);

		System.out.println(edges.length);
		Patch p = new Patch(new Point(bb,5,2),4,bb);
		System.out.println(p.toString());
		Matrix m = new Matrix("P:\\Desktop\\test.bmp");
		Mask mm = new Mask("P:\\Desktop\\mask.bmp",new Color(0,0,0));
		System.out.println(mm.val[0][0]);
		m.applyMask(mm);
		m.save("P:\\Desktop\\imagewithmask");
		Boundary laBoundary = new Boundary(mm);
		System.out.println(laBoundary);
		Tag t = new Tag(laBoundary);
		for(int i = 0 ; i<bb.nbEdges;i++){
			System.out.println(t.getIndex()[i]);
		}
		System.out.println(laBoundary.edges.size());


		}
	}


