package visitor.problem;

public class AnchorNode implements HtmlNode{

    @Override
    public void highlight() {
        System.out.println("hilight-anchor");
    }
}
