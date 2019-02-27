package ua.i.mail100;

public enum EnumColor {
    RED("#FF0000", 1), ORANGE("#FFA500", 2), YELLOW("#FFFF00", 3), GREEN("#008000", 4),
    BLUE("#0000FF", 1), INDIGO("#4B0082", 1), VIOLET("#EE82EE", 1);

    private String colorCode;
    private int colorNumber;

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public int getColorNumber() {
        return colorNumber;
    }

    public void setColorNumber(int colorNumber) {
        this.colorNumber = colorNumber;
    }

    private EnumColor(String colorCode, int colorNumber ) {
        this.colorCode = colorCode;
        this.colorNumber = colorNumber;
    }

}

