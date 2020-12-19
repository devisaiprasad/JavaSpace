package AbstractPackage;

abstract class Product {

	private int multiplyBy;
    public Product( int multiplyBy ) {
        this.multiplyBy = multiplyBy;
        System.out.println("multiplyBy = "+multiplyBy);
    }

    public int mutiply(int val) {
       return multiplyBy * val;
    }
    
    
    abstract void fun();

	
}
