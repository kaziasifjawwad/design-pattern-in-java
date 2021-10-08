package strategy.Solution;

import strategy.Solution.compressor.Compressor;
import strategy.Solution.filters.Filters;

public class Gallery {

    private Compressor compressor;
    private Filters filter;

    public Gallery(Compressor compressor, Filters filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String image){
        compressor.applyCompressor();
        filter.applyFilter();
    }

}
