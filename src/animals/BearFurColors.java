package animals;

public enum BearFurColors
{
    GRAY("GRAY"),
    WHITE("WHITE"),
    BLACK("BLACK");
    public final String furColor;

     BearFurColors(String color) {
        this.furColor = color;

    }
    public String getFurColor(){
        return furColor;
    }
}
