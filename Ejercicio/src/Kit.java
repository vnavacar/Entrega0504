import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kit extends Elemento{

    protected List <Component> children = new ArrayList<>();

    public Kit(int codigo, Component... componentes ){
        super(0, codigo);
        add(componentes);

    }

    public void add(Component component) {
        children.add(component);
    }

    public void add(Component... components) {
        children.addAll(Arrays.asList(components));
    }
    public void remove(Component child) {
        children.remove(child);
    }

    public void remove(Component... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }

}


    

