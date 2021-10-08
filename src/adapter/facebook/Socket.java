package adapter.facebook;

import adapter.snapchat.SnapFilter;

public class Socket implements FacebookFilter{
    private SnapFilter filter;

    public Socket(SnapFilter filter){
        this.filter=filter;
    }

    @Override
    public void apply() {
        this.filter.normalization();

    }
}
