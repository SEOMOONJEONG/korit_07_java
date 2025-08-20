package ch00_test1;

class Factory {
    private static Factory instance;
    private String factoryName;

    private Factory(){

    }

    public static Factory getInstance(){
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public static void main(String[] args) {
        Factory factory1 = Factory.getInstance();

        factory1.setFactoryName("코리아공장");
        System.out.println("factoryName : " + factory1.getFactoryName());
    }
}

