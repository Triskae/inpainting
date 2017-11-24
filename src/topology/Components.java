/**
 * <> with heart by Doutel Silva Filipe, Nadaud Sörel and Barbero Lucas
 */


package topology;

import java.util.ArrayList;

public class Components {
    private ArrayList<Component> components;
    private int size(){
        return components.size();
    }
    public Components(Boundary b) throws Exception {
        components=new ArrayList<Component>();
        Tag tag=new Tag(b);
        Point seedPoint=tag.SeedPoint();
        while(seedPoint!=null) {
            Component newComponent=new Component(tag,seedPoint);
            components.add(newComponent);
            seedPoint=tag.SeedPoint();}}}
