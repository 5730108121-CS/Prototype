package sprite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RenderManager {
	
	private static final RenderManager instance = new RenderManager();
	public static RenderManager getInstance(){
		return instance;
	}
	
	private List<IRenderable> allthing;
	
	public RenderManager(){
		allthing = new ArrayList<IRenderable>();
	}
	
	public void add(IRenderable thing){
		allthing.add(thing);
		//Sort our list by Z -- we don't sort during "image drawing" as it's not efficient
		Collections.sort(allthing, new Comparator<IRenderable>() {
			@Override
			public int compare(IRenderable o1, IRenderable o2) {
				if(o1.getZ() > o2.getZ()) return 1;
				return -1;
			}
		});
	}

	public List<IRenderable> getAllthing() {
		return allthing;
	}
	
}