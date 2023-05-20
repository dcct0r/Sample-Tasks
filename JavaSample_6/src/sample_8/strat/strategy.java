package sample_8.strat;

interface Strategy {
    void download(String file);
}
class DownloadWindownsStrategy implements Strategy {
    public void download(String file) {
        System.out.println("windows download: " + file);
    }
}
class DownloadLinuxStrategy implements Strategy {
    public void download(String file) {
        System.out.println("linux download: " + file);
    }
}
class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void download(String file){
        strategy.download(file);
    }
}

public class strategy {
    public static void main(String[] args) {
        Context context = new Context(new DownloadWindownsStrategy());
        context.download("file.txt");
        context = new Context(new DownloadLinuxStrategy());
        context.download("file.txt");
    }
}
