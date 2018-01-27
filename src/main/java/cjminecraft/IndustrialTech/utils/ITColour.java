package cjminecraft.IndustrialTech.utils;

public enum ITColour {
    BLACK("§0"),
    DARK_BLUE("§1"),
    DARK_GREEN("§2"),
    CYAN("§3"),
    DARK_RED("§4"),
    DARK_PURPLE("§5"),
    GOLD("§6"),
    LIGHT_GREY("§7"),
    DARK_GREY("§8"),
    BLUE("§9"),
    GREEN("§a"),
    AQUA("§b"),
    RED("§c"),
    PINK("§d"),
    YELLOW("§e"),
    WHITE("§f"),
    OBFUSCATED("§k"),
    BOLD("§l"),
    STRIKE("§m"),
    UNDERLINE("§n"),
    ITALIC("§o"),
    RESET("§r");


    private String code;

    ITColour(String code) {
        this.code = code;
    }

    public static String translate(String message) {
        String newmessage = message;
        for (ITColour c : values()) {
            newmessage = newmessage.replace(c.code.replace('§', '&'), c.code);
        }
        return newmessage;

    }

    public static String strip(String message) {
        String newmessage = message;
        for (ITColour c : values()) {
            newmessage = newmessage.replace(c.code, "");
        }
        return newmessage;
    }

    public String toString() {
        return code;
    }


}