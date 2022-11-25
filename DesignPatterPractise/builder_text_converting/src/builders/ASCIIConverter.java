package builders;

import product.ASCIIText;

public class ASCIIConverter implements TextConverter{
    ASCIIText asciiTextObj;

    @Override
    public void convertCharacter(char c) {
        char asciiChar = new Character(c).charValue();
        asciiTextObj.append(asciiChar);
    }

    @Override
    public void convertParagraph() {

    }

    public ASCIIText getResult(){
        return  asciiTextObj;
    }
}
