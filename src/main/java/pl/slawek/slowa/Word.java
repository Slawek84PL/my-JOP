package pl.slawek.slowa;

class Word {
    private int index;
    private String word;
    private int module;
    private int lesson;
    private String time;

    Word(final int index, final String word, final int module, final int lesson, final String time) {
        this.index = index;
        this.word = word;
        this.module = module;
        this.lesson = lesson;
        this.time = time;
    }
}
