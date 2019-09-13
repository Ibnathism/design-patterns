public class VanillaShake extends Shake {
    private String additionalIng1;
    private String additionalIng2;
    private int basePrice;

    public VanillaShake(String baseIng1, String baseIng2){
        super(baseIng1, baseIng2);
    }

    public VanillaShake setAdditionalIng1(String additionalIng1) {
        this.additionalIng1 = additionalIng1;
        return this;
    }

    public VanillaShake setAdditionalIng2(String additionalIng2) {
        this.additionalIng2 = additionalIng2;
        return this;
    }

    public VanillaShake setBasePrice(int basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getAdditionalIng1() {
        return additionalIng1;
    }

    public String getAdditionalIng2() {
        return additionalIng2;
    }

    @Override
    public String toString() {
        return "VanillaShake\n" + "Base Ingredients : "+ this.getBaseIng1()+" , "+this.getBaseIng2()+
                "\nAdditional Ingredients :" + additionalIng1 + " , " + additionalIng2 +
                "\nBasePrice : " + basePrice;
    }
}
