package org.lnu.is.edbo.exeption;

/**
 * Created by illya on 09.05.16.
 */
public class EdboExeption extends RuntimeException  {

    private EdboType type;

    public EdboExeption(String message, EdboType type) {
        super(message);
        this.type = type;
    }

    public EdboType getType() {
        return type;
    }

}
