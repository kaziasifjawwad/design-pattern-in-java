package strategy.Solution;

import strategy.Solution.compressor.Compressor;
import strategy.Solution.compressor.Jpeg;
import strategy.Solution.filters.Black_White;
import strategy.Solution.filters.Filters;

public class StrategySolutionMain {

    public static void main(String[] args) {

        Compressor compressor = new Jpeg();
        Filters filter = new Black_White();

        Gallery gallery = new Gallery(compressor,filter);
        gallery.store("sample image");

    }
}
