public class PaperBag extends ItemPack implements Biodegradable, Disposable {
    public PaperBag(String name){
        super(name);
    }

    public int getDaysToBiodegrade() {
        return 42; 
    }
}
