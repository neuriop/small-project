package duck.duckbehaviour;

import utils.Colors;

public abstract class Duck {
    protected String colorHead; // колір голови
    protected String colorBody; // колір тіла
    protected final String colorWater = Colors.colorBlue;

    public void duck() {
        System.out.println(colorHead + "   _\n" +       // Приклад використання кольору качки для унікального відрображення єдиним кодом
                colorBody + "__" + colorHead + "(.)>\n" +
                colorBody + "\\___)\n");
    }

    public void swim() {
        System.out.println(colorHead + "            _\n" +
                colorBody + "         __" + colorHead + "(.)>\n" +
                colorWater + "_ _ _ _ _" + colorBody + "\\___)\n");
    }

    public String getColorHead(){
        return this.colorHead;
    }

    public String getColorBody(){
        return this.colorBody;
    }

}

/*

"   _\n"
"__(.)>\n"
"\\___)\n"

-------------------------

"            _\n"
"         __(.)>\n"
"_ _ _ _ _\\___)\n"

-------------------------

"        _________\n"
"   _   | *quack* /\n"
"__(.)< |/\n"
"\\___)\n"

-------------------------

"__  _\n"
"\\_\\(.)>\n"
" \\___)\n"

 */
