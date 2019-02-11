package test.ant.com.gt;

import ant.com.gt.Nodo;
import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.layout.mxIGraphLayout;
import com.mxgraph.util.mxCellRenderer;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author eddyb
 */
public class ChitoUnitTest {

    @Test
    public void chito() throws IOException {
        DefaultDirectedGraph<Nodo, DefaultEdge> g
                = new DefaultDirectedGraph<>(DefaultEdge.class);

        Nodo nodoS = new Nodo("S");
        Nodo nodoE1= new Nodo("E");
        Nodo nodoE2= new Nodo("E");
        Nodo nodoMas= new Nodo("+");

        g.addVertex(nodoS);
        g.addVertex(nodoE1);
        g.addVertex(nodoE2);
        g.addVertex(nodoMas);

        g.addEdge(nodoS, nodoE1);
        g.addEdge(nodoS, nodoMas);
        g.addEdge(nodoS, nodoE2);

        JGraphXAdapter<Nodo, DefaultEdge> graphAdapter
                = new JGraphXAdapter<>(g);
        mxIGraphLayout layout = new mxCircleLayout(graphAdapter);
        layout.execute(graphAdapter.getDefaultParent());

        File imgFile = new File("src/test/resources/graph.png");
        imgFile.createNewFile();
        BufferedImage image
                = mxCellRenderer.createBufferedImage(graphAdapter, null, 2, Color.WHITE, true, null);
        ImageIO.write(image, "PNG", imgFile);

        Assert.assertTrue(imgFile.exists());
    }
}
