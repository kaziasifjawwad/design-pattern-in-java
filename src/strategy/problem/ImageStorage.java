package strategy.problem;

public class ImageStorage {
    private String compressor,filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String image){
        if(this.compressor=="jpeg"){
            System.out.println("using a jepg compressor");
        }
        else if(this.compressor=="png"){
            System.out.println("using a png compressor");
        }

        if(this.filter=="black_white"){
            System.out.println("applying black and white filter");
        }
        else if(this.filter=="high_contrast"){
            System.out.println("applying high contrast filter in this image");
        }
    }
}
