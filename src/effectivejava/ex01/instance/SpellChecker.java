package effectivejava.ex01.instance;

public class SpellChecker {
    private final SpellCheckerService spellCheckerService;
    public SpellChecker(SpellCheckerService spellCheckerService){
        this.spellCheckerService = spellCheckerService;
    }

    public void writeKong(){
        spellCheckerService.kong();
    }

    public void writeLee(){
        spellCheckerService.lee();
    }
}
