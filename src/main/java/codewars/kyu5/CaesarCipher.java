package codewars.kyu5;

import java.util.ArrayList;
import java.util.List;

public class CaesarCipher {
    private static char shiftCharacter(char character, int shiftAmount, boolean isForward) {
        if (!Character.isLetter(character)) return character;
        char base = Character.isUpperCase(character) ? 'A' : 'a';
        int shiftedOffset = (character - base + (isForward ? shiftAmount : -shiftAmount)) % 26;
        if (shiftedOffset < 0) shiftedOffset += 26;
        return (char) (base + shiftedOffset);
    }

    public static List<String> movingShift(String message, int initialShift) {
        StringBuilder shifted = new StringBuilder(message.length());
        for (int i = 0; i < message.length(); i++) {
            shifted.append(shiftCharacter(message.charAt(i), initialShift + i, true));
        }
        int partLength = (message.length() + 4) / 5;
        List<String> result = new ArrayList<>(5);
        for (int i = 0; i < message.length(); i += partLength) {
            result.add(shifted.substring(i, Math.min(i + partLength, shifted.length())));
        }
        while (result.size() < 5) {
            result.add("");
        }
        return result;
    }

    public static String demovingShift(List<String> encodedParts, int initialShift) {
        StringBuilder decoded = new StringBuilder();
        for (String part : encodedParts) {
            decoded.append(part);
        }
        StringBuilder original = new StringBuilder(decoded.length());
        for (int i = 0; i < decoded.length(); i++) {
            original.append(shiftCharacter(decoded.charAt(i), initialShift + i, false));
        }
        return original.toString();
    }
}
