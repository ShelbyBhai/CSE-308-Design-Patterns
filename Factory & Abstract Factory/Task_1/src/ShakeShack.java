public class ShakeShack {
    public ShakeCommon produceShake(String shakeType){
        if(shakeType.equalsIgnoreCase(null))
            return null;
        if (shakeType.equalsIgnoreCase("chocolate shake"))
            return new ChocolateShake();
        if (shakeType.equalsIgnoreCase("coffee shake"))
            return new CoffeeShake();
        if (shakeType.equalsIgnoreCase("vanilla shake"))
            return new VanillaShake();
        if (shakeType.equalsIgnoreCase("strawberry shake"))
            return new StrawberryShake();
        if (shakeType.equalsIgnoreCase("zero Shake"))
            return new ZeroShake();
        return null;
    }
}
